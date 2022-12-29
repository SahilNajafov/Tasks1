package az.company.task.LambdaPractic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class ConsolLamb {
    public static void main(String[] args) {
        List<UserL> userList1 = new ArrayList<>();

        userList1.add(new UserL("Kamil", "Əliyev", LocalDate.of(2003, 10, 13),LocalDate.now().plusMonths(3)));
        userList1.add(new UserL("Fərhad", "Kamilov", LocalDate.of(2002, 9, 21),LocalDate.now().plusMonths(3)));
        userList1.add(new UserL( "Nizami", "Zeynalabdin", LocalDate.of(2003, 5, 27),LocalDate.of(2003, 5, 27).plusMonths(3)));
        userList1.add(new UserL( "Hümbət", "Hümbətov", LocalDate.of(1998, 12, 19),LocalDate.now().plusMonths(3)));
        userList1.add(new UserL( "Sadiq", "Abdullayev", LocalDate.of(1995, 1, 8), LocalDate.of(1995, 1, 8).plusMonths(3)));
        userList1.add(new UserL( "Hacıağa", "Musayev", LocalDate.of(2003, 10, 18),LocalDate.now().plusMonths(3)));

        Consumer<UserL> method = (n) -> {
                    if(LocalDate.now().isAfter(n.expdate)){
                        System.out.println(n);
                    }
        };
        userList1.forEach( method );

    }

}