package az.company.task.ExceptionsPractic;

import java.time.LocalDate;

public class User {
    Integer id;
    String name;
    String surname;
    LocalDate birthday;
    Boolean cardRequest;

    public User(Integer id, String name, String surname, LocalDate birthday,Boolean cardRequest) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.cardRequest=cardRequest;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", cardRequest=" + cardRequest +
                '}';
    }
}
