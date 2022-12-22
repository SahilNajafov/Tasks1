package az.company.task.ExceptionsPractic;

import java.time.LocalDate;

public class Card {
    String holderNum;
    String cardNum;
    LocalDate expireDate;
    Integer cvv;
    Double balance;
    Integer userId;

    public Card(String holderNum, String cardNum, LocalDate expireDate, Integer cvv, Double balance, Integer userId) {
        this.holderNum = holderNum;
        this.cardNum = cardNum;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderNum='" + holderNum + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
