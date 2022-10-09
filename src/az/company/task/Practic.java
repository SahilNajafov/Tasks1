package az.company.task;

import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        if (a <= b) {
//            for (; a <= b; a++) {
//                b--;
//            }
//            System.out.println("a = " + (a + 1));
//            System.out.println("b = " + (b - 1));
//        }
//        else if (b <= a) {
//            for (; b <= a; b++) {
//                a--;
//            }
//            System.out.println("a = " + (a - 1));
//            System.out.println("b = " + (b + 1));
//        }

        if(a<b){
            System.out.println((a+(b-a))+" "+ (b-(b-a)));
        }

        else{
            System.out.println((a - (b-a))+" "+(b + (b-a)));
        }

    }
}
