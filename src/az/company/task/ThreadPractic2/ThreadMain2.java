package az.company.task.ThreadPractic2;

import az.company.task.ExceptionsPractic.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




//class MyNewThread extends Thread{
//    @Override
//    public void run() {
//        for (Map a:) {
//
//        }
//    }
//}
public class ThreadMain2 {
    public static void main(String[] args) {
        List<Cards> cardsList = new ArrayList<>();

       cardsList.add(new Cards("Kamil", "5136789012341234",1000.0, LocalDate.of(2003, 10, 13)));
       cardsList.add(new Cards( "Fərhad","5136789012341235",2000.0,  LocalDate.of(2002, 9, 21) ));
       cardsList.add(new Cards( "Nizami", "5136789012341236",1500.0, LocalDate.of(2003, 5, 27)));
       cardsList.add(new Cards( "Hümbət", "5136789012341237",1800.0, LocalDate.of(1998, 12, 19)));
       cardsList.add(new Cards( "Sadiq", "5136789012341238",130.5, LocalDate.of(1995, 1, 8)));
       cardsList.add(new Cards( "Hacıağa","5136789012341239",3500.0, LocalDate.of(2003, 10, 18)));

        Map<String,Double> increase = new HashMap<>();

        increase.put("5136789012341234",500.0);
        increase.put("5136789012341235",200.0);
        increase.put("5136789012341236",300.0);
        increase.put("5136789012341237",100.0);
        increase.put("5136789012341238",1000.0);
        increase.put("5136789012341239",50.0);



        Thread myNewThread = new Thread(
                ()->{
                    for (Map.Entry<String, Double> b : increase.entrySet()) {
                        cardsList.stream().filter(x->x.cardNumber.equals(b.getKey())).map(k->k.balance+=b.getValue()).forEach(System.out::println);
                    }

                }
        );
        Thread myNewThread2 = new Thread(
                ()->{
                    for (Cards a:cardsList) {
                            System.out.println(a.holderName);
                    }
                }
        );

        myNewThread.start();
        myNewThread2.start();


    }
}
