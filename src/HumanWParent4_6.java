import java.util.Objects;

public class HumanWParent4_6 {
    private Name4_5 name;
    private int height;
    private HumanWParent4_6 father;

    // Конструктор с именем в виде строки и ростом
    HumanWParent4_6(String name, int height) {
        this(new Name4_5(name), height, null);
    }

    // Конструктор с именем в виде строки, ростом и отцом
    HumanWParent4_6(String name, int height, HumanWParent4_6 father) {
        this(new Name4_5(name), height, father);
    }

    // Конструктор с именем в виде объекта Name и ростом
    HumanWParent4_6(Name4_5 name, int height) {
        this(name, height, null);
    }

    // Основной конструктор с именем, ростом и отцом
    HumanWParent4_6(Name4_5 name, int height, HumanWParent4_6 father) {
        this.name = name;
        this.height = height;
        this.father = father;

        if (this.father != null) {

        }
    }

    // Геттеры и сеттеры
    Name4_5 setName(Name4_5 name) {
        this.name = name;
        return this.name;
    }

    Name4_5 getName() {
        return this.name;
    }

    int setHeight(int height) {
        this.height = height;
        return this.height;
    }

    int getHeight() {
        return this.height;
    }

    HumanWParent4_6 setFather(HumanWParent4_6 father) {
        this.father = father;
        return this.father;
    }

    HumanWParent4_6 getFather() {
        return this.father;
    }

    public String toString(){

        if (this.father != null) {
            if ((Objects.equals(this.name.getLastName(), "")|| Objects.equals(this.name.getLastName(), null)) && (!Objects.equals(this.father.getName().getLastName(), "") || !Objects.equals(this.father.getName().getLastName(), null))) {
                this.name.setLastName(this.father.getName().getLastName());
            }
            if ((Objects.equals(this.name.getPatronymic(), "") || Objects.equals(this.name.getPatronymic(), null)) && (!Objects.equals(this.father.getName().getName(), "") || !Objects.equals(this.father.getName().getName(), null))) {
                this.name.setPatronymic(this.father.getName().getName() + "ович");
            }
            return "Человек с именем \"" + this.name + "\", ростом " + this.height + " и отцом \"" + this.father.getName() + "\"";
        } else {
            return "Человек с именем \"" + this.name + "\" и ростом " + this.height;
        }
    }

}
