package az.company.task.StreamPractic;

import az.company.task.ExceptionsPractic.Card;
import az.company.task.ExceptionsPractic.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<User2> userList = new ArrayList<>();

        userList.add(new User2("Kamil", "Əliyev", LocalDate.of(2003, 10, 13),20.0,CurrencyEnum.AZN));
        userList.add(new User2("Fərhad", "Kamilov", LocalDate.of(2002, 9, 21),20.0,CurrencyEnum.AZN));
        userList.add(new User2("Nizami", "Zeynalabdin", LocalDate.of(2003, 5, 27),20.0,CurrencyEnum.AZN));
        userList.add(new User2("Hümbət", "Hümbətov", LocalDate.of(1998, 12, 19),20.0,CurrencyEnum.AZN));
        userList.add(new User2("Sadiq", "Abdullayev", LocalDate.of(1995, 1, 8),20.0,CurrencyEnum.AZN));
        userList.add(new User2("Hacıağa", "Musayev", LocalDate.of(2003, 10, 18),20.0,CurrencyEnum.AZN));




//        Set<Card2> userCard =
//                userList.stream().map(user2 -> {
//                    for (User2 a:userList) {
//                        Random random1 = new Random(8999);
//                        int lastFour = random1.nextInt()+1000;
//
//                    }
//                        }
//                ).collect(Collectors.toSet());
    }


}
