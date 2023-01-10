package az.company.task.StreamPractic;

import java.time.LocalDate;

public class Card2 {
    String cardNumber;
    String holderNumber;
    LocalDate exp;
    Integer cvv;

    public Card2(String cardNumber, String holderNumber, LocalDate exp, Integer cvv) {
        this.cardNumber = cardNumber;
        this.holderNumber = holderNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card2{" +
                "cardNumber='" + cardNumber + '\'' +
                ", holderNumber='" + holderNumber + '\'' +
                ", exp=" + exp +
                ", cvv=" + cvv +
                '}';
    }
}
