package az.company.task.StreamPractic;

import java.time.LocalDate;

public class User2 {
    String name;
    String surname;
    LocalDate birthdate;
    Double paidAmount;
    CurrencyEnum currency;

    public User2(String name, String surname, LocalDate birthdate, Double paidAmount, CurrencyEnum currency) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.paidAmount = paidAmount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", paidAmount=" + paidAmount +
                ", currency=" + currency +
                '}';
    }
}
