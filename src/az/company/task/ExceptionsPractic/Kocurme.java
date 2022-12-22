package az.company.task.ExceptionsPractic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kocurme {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User(1, "Kamil", "Əliyev", LocalDate.of(2003, 10, 13), true));
        userList.add(new User(2, "Fərhad", "Kamilov", LocalDate.of(2002, 9, 21), true));
        userList.add(new User(3, "Nizami", "Zeynalabdin", LocalDate.of(2003, 5, 27), false));
        userList.add(new User(4, "Hümbət", "Hümbətov", LocalDate.of(1998, 12, 19), true));
        userList.add(new User(5, "Sadiq", "Abdullayev", LocalDate.of(1995, 1, 8), true));
        userList.add(new User(6, "Hacıağa", "Musayev", LocalDate.of(2003, 10, 18), true));

        List<Card> userCards = new ArrayList<>();

        if (userList.get(1).cardRequest) {
            userCards.add(new Card(userList.get(1).name + " " + userList.get(1).surname
                    , "5674378987653456"
                    , LocalDate.now().plusYears(3)
                    , 689
                    , 2000.0
                    , userList.get(1).id)
            );
        }
        if (userList.get(2).cardRequest) {
            userCards.add(new Card(userList.get(2).name + " " + userList.get(2).surname
                    , "5674378987653456"
                    , LocalDate.now().plusYears(3)
                    , 123
                    , 2500.0
                    , userList.get(2).id)
            );
        }
        if (userList.get(3).cardRequest) {
            userCards.add(new Card(userList.get(3).name + " " + userList.get(3).surname
                    , "5674378987653456"
                    , LocalDate.now().plusYears(3)
                    , 567
                    , 4000.0
                    , userList.get(3).id)
            );
        }
        if (userList.get(4).cardRequest) {
            userCards.add(new Card(userList.get(4).name + " " + userList.get(4).surname
                    , "5674378987653456"
                    , LocalDate.now().plusYears(3)
                    , 967
                    , 1560.0
                    , userList.get(4).id)
            );
        }
        if (userList.get(5).cardRequest) {
            userCards.add(new Card(userList.get(5).name + " " + userList.get(5).surname
                    , "5674378987653456"
                    , LocalDate.now().plusYears(3)
                    , 356
                    , 5782.0
                    , userList.get(5).id)
            );
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("İstifadəçi id'sini daxil edin: ");
        Integer a = scanner.nextInt();
        System.out.println(userCards.get(a));

    }
}
