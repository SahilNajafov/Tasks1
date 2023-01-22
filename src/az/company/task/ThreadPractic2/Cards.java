package az.company.task.ThreadPractic2;

import java.time.LocalDate;

public class Cards {
    String holderName;
    String cardNumber;
    Double balance;
    LocalDate expDate;

    public Cards(String holderName, String cardNumber, Double balance, LocalDate expDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "holderName='" + holderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", expDate=" + expDate +
                '}';
    }
}
