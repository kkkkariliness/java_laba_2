import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

// 3 вариант :D
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1 (3)
        //Имена.
        //Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,
        //Отчество. Имя может быть приведено к строковому виду, включающему традиционное
        //представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван
        //Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может
        //быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.
        //Необходимо создать следующие имена:
        // -Клеопатра
        // -Пушкин Александр Сергеевич
        // -Маяковский Владимир
        //Обратите внимание, что при выводе на экран, незаданные параметры никак не участвуют в
        //образовании строки.

        out.println("1 (3): ");
        Name[] my_names;
        while (true) {
            out.print("Хочешь сам ввести имя? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                in.nextLine();
                if (choice == 1) {
                    while (true) {
                        out.print("Сколько у тебя будет людей? ");
                        if (in.hasNextInt()) {
                            int k = in.nextInt();
                            if (k > 1) {
                                my_names = new Name[k];
                                in.nextLine();
                                for (int i = 0; i < k; i++) {
                                    out.println((i + 1) + ": Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                    out.print("Введи Имя: ");
                                    String name = in.nextLine().trim();
                                    out.print("Введи Фамилию: ");
                                    String lastname = in.nextLine().trim();
                                    out.print("Введи Отчество: ");
                                    String patronymic = in.nextLine().trim();
                                    my_names[i] = new Name(name, lastname, patronymic);
                                }
                                for (int i = 0; i < k; i++) {
                                    out.println(my_names[i]);
                                }
                                break;
                            } else if (k == 1) {
                                in.nextLine();
                                out.println("Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                out.print("Введи Имя: ");
                                String name = in.nextLine().trim();
                                out.print("Введи Фамилию: ");
                                String lastname = in.nextLine().trim();
                                out.print("Введи Отчество: ");
                                String patronymic = in.nextLine().trim();
                                Name myname = new Name(name, lastname, patronymic);
                                out.println(myname);
                                break;
                            } else {
                                in.nextLine();
                                out.println("Число должно быть положительным!");
                            }
                        } else {
                            in.nextLine();
                            out.println("Это должно быть число!");
                        }
                    }
                    break;
                } else if (choice == 2) {
                    Name name1 = new Name("Клеопатра");
                    Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
                    Name name3 = new Name("Владимир", "Маяковский");
                    out.println(name1); // Клеопатра
                    out.println(name2); // Пушкин Александр Сергеевич
                    out.println(name3); // Маяковский Владимир
                    break;
                } else {
                    out.println("Попробуй ввести число из предложенных!");
                }
            } else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 2 (2, 3)
        // 2 (2)
        //Человек с именем.
        //Объедините сущности Человек из задачи 1.2 и Имя из задачи 1.3 таким образом, чтобы имя
        //человека задавалось с использованием сущности 1.3, а не строки.
        //Необходимо объединить ранее созданные объекты имен и людей, с получением:
        // -Человека с Именем Клеопатра и ростом 152
        // -Человека с Именем Пушкин Александр Сергеевичи ростом 167
        // -Человека с Именем Маяковский Владимир и ростом 189


        out.println("2 (2):");
        Human[] my_humans;
        while (true) {
            out.print("Хочешь сам ввести имя и рост твоего человека? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                if (choice == 1) {
                    while (true) {
                        out.print("Сколько у тебя будет людей? ");
                        if (in.hasNextInt()) {
                            int ch = in.nextInt();
                            if (ch > 1) {
                                my_humans = new Human[ch];
                                in.nextLine();
                                for (int i = 0; i < ch; i++) {
                                    out.println((i + 1) + ": Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                    out.print("Введи Имя: ");
                                    String name = in.next().trim();
                                    in.nextLine();
                                    out.print("Введи Фамилию: ");
                                    String lastname = in.nextLine().trim();
                                    out.print("Введи Отчество: ");
                                    String patronymic = in.nextLine().trim();
                                    Name myname = new Name(name, lastname, patronymic);
                                    while (true) {
                                        out.print("Введи рост твоего человека: ");
                                        if (in.hasNextInt()) {
                                            int height = in.nextInt();
                                            if (height > 40 && height < 300) {
                                                my_humans[i] = new Human(myname, height);
                                                in.nextLine();
                                                //out.println(myhuman);
                                                break;
                                            } else {
                                                in.nextLine();
                                                out.println("Ну очевидно, что рост должен быть реалистичнее!");
                                            }
                                        } else {
                                            in.nextLine();
                                            out.println("Это должно быть число!");
                                        }
                                    }
                                }
                                for (int i = 0; i < ch; i++) out.println(my_humans[i]);
                                break;
                            } else if (ch == 1) {
                                in.nextLine();
                                out.println("Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                out.print("Введи Имя: ");
                                String name = in.next().trim();
                                in.nextLine();
                                out.print("Введи Фамилию: ");
                                String lastname = in.nextLine().trim();
                                out.print("Введи Отчество: ");
                                String patronymic = in.nextLine().trim();
                                Name myname = new Name(name, lastname, patronymic);
                                while (true) {
                                    out.print("Введи рост твоего человека: ");
                                    if (in.hasNextInt()) {
                                        int height = in.nextInt();
                                        if (height > 40 && height < 300) {
                                            Human myhuman = new Human(myname, height);
                                            in.nextLine();
                                            out.println(myhuman);
                                            break;
                                        } else {
                                            in.nextLine();
                                            out.println("Ну очевидно, что рост должен быть реалистичнее!");
                                        }
                                    } else {
                                        in.nextLine();
                                        out.println("Это должно быть число!");
                                    }
                                }
                            } else {
                                in.nextLine();
                                out.println("Число должно быть положительным!");
                            }
                            //break;
                        } else {
                            in.nextLine();
                            out.println("Это должно быть число!");
                        }
                    }
                    break;
                } else if (Math.abs(choice) == 2) {
                    Human human1 = new Human(new Name("Клеопатра"), 152);
                    Human human2 = new Human(new Name("Александр", "Пушкин", "Сергеевич"), 167);
                    Human human3 = new Human(new Name("Владимир", "Маяковский"), 189);
                    out.println(human1); // Клеопатра
                    out.println(human2); // Пушкин Александр Сергеевич
                    out.println(human3); // Маяковский Владимир
                    break;
                } else {
                    in.nextLine();
                    out.println("Попробуй ввести число из предложенных!");
                }
            } else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 2 (3)
        //Человек с родителем.
        //Измените сущность Человек из задачи 2.2 добавив ему возможность задавать третий параметр:
        //Отец, где Отец — это тоже Человек. При приведении человека к строковой форме необходимо
        //проверить параметры имени, и в зависимости от ситуации выполнить одно из следующих
        //действий:
        // - Если у данного человека нет фамилии, и есть отец, у которого фамилия задана, то
        //фамилию необходимо сделать такой же как у отца.
        // - Если у данного человека нет отчества, а у отца есть имя, то необходимо задать отчество
        //как имя отца с добавлением суффикса “ович”.
        //Затем необходимо выполнить следующие задачи:
        //  1. Создать людей: Чудова Ивана, Чудова Петра, Бориса
        //  2. Сделать Ивана отцом Петра, а Петра отцом Бориса
        //  3. Вывести на экран строковое представление всех троих людей.
        //При желании можно попытаться реализовать систему в более полном виде: предусмотреть
        //разные виды суффиксов отчества в зависимости от окончания имени, а также предусмотреть
        //возможность задавать по2л человека и менять суффикс отчества в зависимости от пола.

        out.println("2 (3):");
        HumanWParent[] my_hwp = new HumanWParent[0];
        while (true) {
            out.print("Хочешь сам ввести имена? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                in.nextLine();
                if (choice == 1) {
                    int ch = 0;
                    while (true) {
                        out.print("Сколько у тебя будет людей? ");
                        if (in.hasNextInt()) {
                            ch = in.nextInt();
                            if (ch > 1) {
                                my_hwp = new HumanWParent[ch];
                                in.nextLine();
                                for (int i = 0; i < ch; i++) {
                                    out.println((i + 1) + ": Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                    out.print("Введи Имя: ");
                                    String name = in.next().trim();
                                    in.nextLine();
                                    out.print("Введи Фамилию: ");
                                    String lastname = in.nextLine().trim();
                                    out.print("Введи Отчество: ");
                                    String patronymic = in.nextLine().trim();
                                    Name myname = new Name(name, lastname, patronymic);
                                    while (true) {
                                        out.print("Введи рост твоего человека: ");
                                        if (in.hasNextInt()) {
                                            int height = in.nextInt();
                                            if (height > 40 && height < 300) {
                                                my_hwp[i] = new HumanWParent(new Human(myname, height), null);
                                                in.nextLine();
                                                break;
                                            } else {
                                                in.nextLine();
                                                out.println("Ну очевидно, что рост должен быть реалистичным!");
                                            }
                                        } else {
                                            in.nextLine();
                                            out.println("Это должно быть число!");
                                        }
                                    }
                                }
                                for (int i = 0; i < ch; i++) {
                                    while (true) {
                                        for (int j = 0; j < ch; j++) {
                                            if (j != i) out.println((j + 1) + ": " + my_hwp[j].human.getName());
                                        }
                                        out.println("Кто из вышеперечисленных станет отцом " + my_hwp[i].human.getName() + "?");
                                        out.print("Введи номер этого человека (Если отец ушёл за хлебом - введи 0): ");
                                        if (in.hasNextInt()) {
                                            int choise = in.nextInt();
                                            in.nextLine();
                                            if (choise > 0 && choise <= ch && choise != (i + 1)) {
                                                if (my_hwp[choise - 1].getFather() != null && my_hwp[choise - 1].getFather() == my_hwp[i].human) {
                                                    out.println("Нельзя выбрать сына в качестве отца!");
                                                } else {
                                                    my_hwp[i].setFather(my_hwp[choise - 1].human);
                                                    break;
                                                }
                                            }
                                            if (choise == 0) {
                                                break;
                                            }
                                            out.println("Попробуй другое число! (Например, из тех, что тебе предлагают выше!)");
                                        } else {
                                            in.nextLine();
                                            out.println("Это должно быть число!");
                                            out.print("Давай по новой: ");
                                        }
                                    }
                                }
                                out.println("Вот что получилось:");
                                for (int i = 0; i < ch; i++) out.println(my_hwp[i]);

                                break;
                            } else if (ch == 1) {
                                out.println("Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                out.print("Введи Имя: ");
                                String name = in.next().trim();
                                in.nextLine();
                                out.print("Введи Фамилию: ");
                                String lastname = in.nextLine().trim();
                                out.print("Введи Отчество: ");
                                String patronymic = in.nextLine().trim();
                                Name myname = new Name(name, lastname, patronymic);
                                while (true) {
                                    out.print("Введи рост твоего человека: ");
                                    if (in.hasNextInt()) {
                                        int height = in.nextInt();
                                        if (height > 40 && height < 300) {
                                            Human myhum = new Human(myname, height);
                                            in.nextLine();
                                            out.println(myhum);
                                            break;
                                        } else {
                                            in.nextLine();
                                            out.println("Ну очевидно, что рост должен быть реалистичнее!");
                                        }
                                    } else {
                                        in.nextLine();
                                        out.println("Это должно быть число!");
                                    }
                                }
                            } else {
                                in.nextLine();
                                out.println("Число должно быть положительным!");
                            }
                            //break;
                        } else {
                            in.nextLine();
                            out.println("Это должно быть число!");
                        }
                    }
                    break;
                } else if (choice == 2) {
                    Human hum1 = new Human(new Name("Иван", "Чудов"), 180);
                    Human hum2 = new Human(new Name("Петр", "Чудов"), 175);
                    Human hum3 = new Human(new Name("Борис"), 185);

                    HumanWParent human1 = new HumanWParent(hum1);
                    HumanWParent human2 = new HumanWParent(hum2, hum1);
                    HumanWParent human3 = new HumanWParent(hum3, hum2);

                    out.println(human1);
                    out.println(human2);
                    out.println(human3);
                    break;
                } else {
                    out.println("Попробуй ввести число из предложенных!");
                }
            } else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 3 (3)
        //Города.
        //Создайте сущность Город, которая будет представлять собой точку на карте со следующими
        //характеристиками:
        // -Название города
        // -Набор путей к следующим городам, где путь представляет собой сочетание Города и
        //стоимости поездки в него.
        //Кроме того, Город может возвращать текстовое представление, в виде названия города и списка
        //связанных с ним городов (в виде пары: “название:стоимость”).
        //Используя разработанную сущность реализуйте схему, представленную на рисунке 2.

        out.println("3 (3): ");
        City[] city;
        while (true) {
            out.print("Хочешь добавить города сам? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                if (choice == 1) {
                    int count;
                    int nom_city;
                    while (true) {
                        out.print("Сколько у тебя будет городов? ");
                        if (in.hasNextInt()){
                            count = in.nextInt();
                            if (count > 0) {
                                city = new City[count];
                                for (int i = 0; i < count; i++) {
                                    out.print("Введи название для города " + (i+1) + ": ");
                                    city[i] = new City(in.next());
                                    in.nextLine();
                                }
                                break;
                            }
                            else out.println("Число должно быть положительным!");
                        }
                        else {
                            in.nextLine();
                            out.println("Это должно быть число! (положительное)");
                            in.nextLine();
                        }
                    }
                    if (count > 1) {
                        for (int i = 0; i < count; i++) {
                            boolean flag = true;
                            List<Integer> usedCities = new ArrayList<>();
                            while (true) {
                                out.println("В какой город из нижеперечисленных будет лежать путь из города " + city[i].getName() + "? ");
                                for (int j = 0; j < count; j++) {
                                    if (city[j].getName() != city[i].getName()) out.println((j + 1) + ": " + city[j].getName());
                                }
                                out.print("Введи номер города из списка выше (если пути нет - введи 0): ");
                                if (in.hasNextInt()) {
                                    nom_city = in.nextInt();
                                    in.nextLine();
                                    if (usedCities.contains(nom_city)) {
                                        out.println("Этот город уже был введен для текущего города. Попробуй другой город");
                                        continue;
                                    }
                                    if (nom_city > 0 && nom_city <= count && nom_city != (i+1)) {
                                        usedCities.add(nom_city);
                                        while (true) {
                                            out.print("Введи стоимость маршрута: ");
                                            if (in.hasNextInt()) {
                                                int cost = in.nextInt();
                                                in.nextLine();
                                                if (cost > 0) {
                                                    city[i].addRoute(city[nom_city - 1], cost);
                                                    break;
                                                } else {
                                                    out.println("Это должно быть положительное число!");
                                                }
                                            } else {
                                                out.println("Это должно быть число!");
                                                in.nextLine();
                                            }
                                        }
                                    } else if (nom_city == 0) {
                                        out.println("Ну нет пути так нет пути(");
                                        break;
                                    } else {
                                        out.println("Попробуй ввести то, что от тебя требуют!");
                                    }
                                } else {
                                    in.nextLine();
                                    //in.nextLine();
                                    out.println("Это должно быть число!");
                                }
                            }
                        }
                    }
                    for (int i = 0; i < count; i++) { out.print(city[i]); } // вывод ответа
                    break;

                } else if (Math.abs(choice) == 2) {

                    City cityA = new City("A");
                    City cityB = new City("B");
                    City cityC = new City("C");
                    City cityD = new City("D");
                    City cityE = new City("E");
                    City cityF = new City("F");

                    //A
                    cityA.addRoute(cityB, 5);
                    cityA.addRoute(cityF, 1);
                    cityA.addRoute(cityD, 6);
                    //B
                    cityB.addRoute(cityA, 5);
                    cityB.addRoute(cityC, 3);
                    //C
                    cityC.addRoute(cityB, 3);
                    cityC.addRoute(cityD, 4);
                    //D
                    cityD.addRoute(cityC, 4);
                    cityD.addRoute(cityE, 2);
                    cityD.addRoute(cityA, 6);
                    //E
                    cityE.addRoute(cityF, 2);
                    //F
                    cityF.addRoute(cityE, 2);
                    cityF.addRoute(cityB, 1);

                    out.print(cityA);
                    out.print(cityB);
                    out.print(cityC);
                    out.print(cityD);
                    out.print(cityE);
                    out.print(cityF);
                    break;
                }
                else {
                    in.nextLine();
                    out.println("Попробуй ввести число из предложенных!");
                }
            }
            else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 4 (5, 6)
        // 4 (5)
        //Создаем Имена.
        //Измените сущность Имя из задачи 1.3. Новые требования включают:
        // -Имя можно создать указав только Личное имя
        // -Имя можно создать указав Личное имя и Фамилию.
        // -Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.
        //Необходимо создать следующие имена:
        // 1. Клеопатра
        // 2. Александр Сергеевич Пушкин
        // 3. Владимир Маяковский
        // 4. Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия)


        out.println("4 (5): ");
        Name4_5[] my_names4_5;
        while (true) {
            out.print("Хочешь сам ввести имя? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                in.nextLine();
                if (choice == 1) {
                    while (true) {
                        out.print("Сколько у тебя будет людей? ");
                        if (in.hasNextInt()) {
                            int k = in.nextInt();
                            in.nextLine();
                            if (k > 1) {
                                my_names4_5 = new Name4_5[k];
                                for (int i = 0; i < k; i++) {
                                    out.println((i+1) + ": Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                    out.print("Введи Имя: ");
                                    String name = in.next();
                                    in.nextLine();
                                    out.print("Введи Фамилию: ");
                                    String lastname = in.nextLine();
                                    out.print("Введи Отчество: ");
                                    String patronymic = in.nextLine();
                                    my_names4_5[i] = new Name4_5(name, lastname, patronymic);
                                }
                                for (int i = 0; i < k; i++) {
                                    out.println(my_names4_5[i]);
                                }
                                break;
                            } else if (k == 1) {
                                out.println("Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                out.print("Введи Имя: ");
                                String name = in.next();
                                in.nextLine();
                                out.print("Введи Фамилию: ");
                                String lastname = in.nextLine();
                                out.print("Введи Отчество: ");
                                String patronymic = in.nextLine();
                                Name4_5 myname4_5 = new Name4_5(name, lastname, patronymic);
                                out.println(myname4_5);
                                break;
                            } else {
                                out.println("Число должно быть положительным!");
                            }
                        } else {
                            in.nextLine();
                            out.println("Это должно быть число!");
                        }
                    }
                    break;
                } else if (choice == 2) {
                    Name4_5 cleopatra = new Name4_5("Клеопатра");
                    Name4_5 pushkin = new Name4_5("Александр", "Пушкин", "Сергеевич");
                    Name4_5 mayakovsky = new Name4_5("Владимир", "Маяковский");
                    Name4_5 christopher = new Name4_5("Христофор", "Бонифатьевич");
                    out.println(cleopatra); // Клеопатра
                    out.println(pushkin); // Александр Сергеевич Пушкин
                    out.println(mayakovsky); // Владимир Маяковский
                    out.println(christopher); // Христофор Бонифатьевич
                    break;
                }
                else {
                    out.println("Попробуй ввести число из предложенных!");
                }
            }
            else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 4 (6)
        //Создаем Человека. Измените сущность Человек из задачи 2.3. Новые требования включают:
        // -Человека можно создать с указанием имени в виде строки и роста в виде целого числа.
        //При таком способе задания имени должно считаться, что Человеку задано только личное
        //имя.
        // -Человека можно создать с указанием имени в виде строки, роста в виде целого числа и
        //отца в виде Человека. В этом случае необходимо проставить отчество в соответствии с
        //именем отца и присвоить текущему человеку фамилию отца.
        // -Человека можно создать с указанием имени в виде объекта типа Имя (из задачи 4.5) и
        //роста в виде целого числа.
        // -Человека можно создать с указанием имени в виде объекта типа Имя (из задачи 4.5),
        //роста в виде целого числа и отца в виде Человека. В этом случае необходимо проверить
        //что в Имени задано отчество и фамилия, и если они не заданы, то необходимо их задать
        //(отчество в соответствии с именем отца и фамилию отца).
        // -Реализуйте описанные способы создания Человека таким образом, чтобы операции
        //присвоения использовались только в одном из конструкторов.
        // -Необходимо модифицировать способ приведения Человека к строке, теперь текстовая
        //форма должна быть представлена строкой: “Имя, рост”
        //Создайте и выведите на экран следующие объекты:
        // 1. Человека с именем Лев (в виде строки) и ростом 170
        // 2. Человека с именем Пушкин Сергей (как Имя), ростом 168 и отцом Львом (предыдущий Человек)
        // 3. Человека с именем Александр (в виде строки), ростом 167 и отцом Сергеем (предыдущий
        //Человек)

        out.println("4 (6): ");
        HumanWParent4_6[] my_hwp4_6 = new HumanWParent4_6[0];
        while (true) {
            out.print("Хочешь сам ввести имена? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                in.nextLine();
                if (choice == 1) {
                    int ch = 0;
                    while (true) {
                        out.print("Сколько у тебя будет людей? ");
                        if (in.hasNextInt()) {
                            ch = in.nextInt();
                            if (ch > 1) {
                                int answer = 0;
                                my_hwp4_6 = new HumanWParent4_6[ch];
                                in.nextLine();
                                for (int i = 0; i < ch; i++) {
                                    while (true) {
                                        out.print("Как будет задано имя? (1 - строка (будет считаться Личным именем), 2 - как ФИО) ");
                                        if (in.hasNextInt()) {
                                            answer = in.nextInt();
                                            in.nextLine();
                                            if (answer == 1 || answer == 2) break;
                                            else out.println("Попробуй ввести то, что от тебя требуют!");
                                        }
                                        else {
                                            in.nextLine();
                                            out.println("Это должно быть числом!");
                                        }
                                    }
                                    Name4_5 myname = new Name4_5(null);
                                    if (answer == 1) {
                                        out.print((i+1) + ": Введи имя: ");
                                        String name = in.next().trim();
                                        in.nextLine();
                                        myname.setName(name);
                                    }
                                    else {
                                        out.println((i+1) + ": Введи имя (если чего-то нет - нажми Enter): ");
                                        out.print("Введи Имя: ");
                                        String name = in.nextLine().trim();
                                        out.print("Введи Фамилию: ");
                                        String lastname = in.nextLine().trim();
                                        out.print("Введи Отчество: ");
                                        String patronymic = in.nextLine().trim();
                                        myname.setName(name);
                                        myname.setLastName(lastname);
                                        myname.setPatronymic(patronymic);
                                    }
                                    while (true) {
                                        out.print("Введи рост твоего человека: ");
                                        if (in.hasNextInt()){
                                            int height = in.nextInt();
                                            if (height > 40 && height < 300) {
                                                my_hwp4_6[i] = new HumanWParent4_6(myname, height, null);
                                                in.nextLine();
                                                break;
                                            }
                                            else {
                                                in.nextLine();
                                                out.println("Ну очевидно, что рост должен быть реалистичным!");
                                            }
                                        }
                                        else {
                                            in.nextLine();
                                            out.println("Это должно быть число!");
                                        }
                                    }
                                }
                                for (int i = 0; i < ch; i ++) {
                                    while (true) {
                                        for (int j = 0; j < ch; j ++) {
                                            if (j != i) out.println((j+1) + ": " + my_hwp4_6[j].getName());
                                        }
                                        out.println("Кто из вышеперечисленных станет отцом " + my_hwp4_6[i].getName() + "?");
                                        out.print("Введи номер этого человека (Если отец ушёл за хлебом - введи 0): ");
                                        if (in.hasNextInt()) {
                                            int choise = in.nextInt();
                                            in.nextLine();
                                            if (choise > 0 && choise <= ch && choise != (i+1)) {
                                                if (my_hwp4_6[choise - 1].getFather() != null && my_hwp4_6[choise - 1].getFather() == my_hwp4_6[i]) {
                                                    out.println("Нельзя выбрать сына в качестве отца!");
                                                } else {
                                                    my_hwp4_6[i].setFather(my_hwp4_6[choise - 1]);
                                                    break;
                                                }
                                            }
                                            if (choise == 0) {
                                                break;
                                            }
                                            out.println("Попробуй другое число! (Например, из тех, что тебе предлагают выше!)");
                                        }
                                        else {
                                            in.nextLine();
                                            out.println("Это должно быть число!");
                                            out.print("Давай по новой: ");
                                        }
                                    }
                                }
                                out.println("Вот что получилось:");
                                for (int i = 0; i < ch; i++) out.println(my_hwp4_6[i]);
                                break;
                            } else if (ch == 1) {
                                out.println("Введи имя (если Фамилии или Отчества нет - нажми Enter): ");
                                out.print("Введи Имя: ");
                                String name = in.next().trim();
                                in.nextLine();
                                out.print("Введи Фамилию: ");
                                String lastname = in.nextLine().trim();
                                out.print("Введи Отчество: ");
                                String patronymic = in.nextLine().trim();
                                Name4_5 myname = new Name4_5(name, lastname, patronymic);
                                while (true) {
                                    out.print("Введи рост твоего человека: ");
                                    if (in.hasNextInt()) {
                                        int height = in.nextInt();
                                        if (height > 40 && height < 300) {
                                            HumanWParent4_6 myhum = new HumanWParent4_6(myname, height);
                                            in.nextLine();
                                            out.println(myhum);
                                            break;
                                        } else {
                                            in.nextLine();
                                            out.println("Ну очевидно, что рост должен быть больше!");
                                        }
                                    } else {
                                        in.nextLine();
                                        out.println("Это должно быть число!");
                                    }
                                }
                            } else {
                                in.nextLine();
                                out.println("Число должно быть положительным!");
                            }
                            //break;
                        } else {
                            in.nextLine();
                            out.println("Это должно быть число!");
                        }
                    }
                    break;
                } else if (choice == 2) {
                    HumanWParent4_6 lev = new HumanWParent4_6("Лев", 170);
                    out.println(lev);

                    Name4_5 sergeyName = new Name4_5("Сергей", "Пушкин");
                    HumanWParent4_6 sergey = new HumanWParent4_6(sergeyName, 168, lev);
                    out.println(sergey);

                    HumanWParent4_6 alexander = new HumanWParent4_6("Александр", 167, sergey);
                    out.println(alexander);
                    break;
                }
                else {
                    out.println("Попробуй ввести число из предложенных!");
                }
            }
            else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }


        // 5 (2)
        //Кот мяукает.
        //Создайте сущность Кот, которая описывается следующим образом:
        // -Имеет Имя (строка)
        // -Для создания необходимо указать имя кота.
        // -Может быть приведен к текстовой форме вида: “кот: Имя”
        // -Может помяукать, что приводит к выводу на экран следующего текста: “Имя: мяу!”,
        //вызвать мяуканье можно без параметров.
        // -Может помяукать Nраз, что приводит к выводу на экран следующего текста: “Имя: мяу-
        //мяу-…-мяу!”, где количество “мяу”равно N.
        //Создайте кота по имени “Барсик”, и затем пусть он помяукает сначала один раз, а затем три раза.


        out.print("5 (2): ");
        while (true) {
            out.print("Хочешь дать имя котику? (1 - да, 2 - нет) ");
            if (in.hasNextInt()) {
                int choice = in.nextInt();
                if (Math.abs(choice) == 1) {
                    out.print("Введи имя для котика: ");
                    Cat cat = new Cat(in.next().trim());
                    out.println(cat);
                    while (true) {
                        boolean flag = true;
                        while (true) {
                            out.print("Сколько раз мяукнет котик? ");
                            if (in.hasNextInt()) {
                                int m = in.nextInt();
                                in.nextLine();
                                if (m > 0) {
                                    cat.meow(m);
                                    break;
                                }
                                if (m == 0) {
                                    out.println("За что ты так с котом(((");
                                    break;
                                }
                                else out.println("Число должно быть положительным!");
                            }
                            else {
                                in.next();
                                out.println("Это должно быть число!");
                            }
                        }

                        while (true) {
                            out.print("Котик будет ещё мяукать? (1 - да, 2 - нет) ");
                            if (in.hasNextInt()) {
                                int f = in.nextInt();
                                in.nextLine();
                                if (f == 1) {
                                    flag = false;
                                    break;
                                }
                                if (f == 2) break;
                                out.println("Попробуй ввести число из предложенных!");
                            }
                            else {
                                in.nextLine();
                                out.println("Это должно быть число!");
                            }
                        }
                        if (!flag) continue;
                        break;
                    }
                    break;
                } else if (choice == 2) {
                    Cat barsik = new Cat("Барсик");
                    out.println(barsik);
                    barsik.meow();  // Кот мяукает один раз
                    barsik.meow(3);
                    break;
                }
                else {
                    in.nextLine();
                    out.println("Попробуй ввести число из предложенных!");
                }
            }
            else {
                in.nextLine();
                out.println("Это должно быть число!");
            }
        }
    }
}