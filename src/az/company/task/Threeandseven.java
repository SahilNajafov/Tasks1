package az.company.task;

import java.util.Scanner;

public class Threeandseven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter interval numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }



//        int i = a;
//        do {
//            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        } while (i <= b);


    }
}
