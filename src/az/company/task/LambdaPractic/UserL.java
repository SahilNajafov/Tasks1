package az.company.task.LambdaPractic;

import java.time.LocalDate;

public class UserL {
    String name;
    String surname;
    LocalDate birthday;
    LocalDate expdate;

    public UserL(String name, String surname, LocalDate birthday, LocalDate expdate) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.expdate = expdate;
    }

    public LocalDate getUser() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", expdate=" + expdate +
                '}';
    }
}
