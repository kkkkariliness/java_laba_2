public class Name {

    protected String name, lastname, patronymic;

    Name(String name, String lastname, String patronymic) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }
    Name(String name, String lastname) {
        this(name, lastname, null);
    }
    Name(String name) {
        this(name, null, null);
    }
    Name() {
        this (null, null, null);
    }

    String getName() {
        return this.name;
    }
    String getLastName() {
        return this.lastname;
    }
    String getPatronymic() {
        return this.patronymic;
    }

    String setName(String name) {
        this.name = name;
        return this.name;
    }
    void setLastName(String lastname) {
        this.lastname = lastname;
    }
    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastname != null && !lastname.isEmpty()) {
            result.append(lastname).append(" ");
        }

        if (name != null && !name.isEmpty()) {
            result.append(name).append(" ");
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            result.append(patronymic);
        }
        return result.toString().trim(); // Удаляем лишние пробелы в начале и конце
    }
}
