package az.company.task;

import java.util.Scanner;

public class Ponlin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int a ;
//        int b = 0;
//        int x = num;
//        while (num>0) {
//            a = num % 10;
//            b = (b * 10) + a;
//            num /= 10;
//
//        }
//        System.out.println(b);
//        if (x == b) {
//            System.out.println("Polindrome");
//        } else {
//            System.out.println("Not Polindrome");
//        }


        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int nub=num;
        int i = 0;
        int c = 0;
        while (true) {
            c = num / 10;
            num /= 10;
            i++;
            if (c == 0) {
                break;
            }
        }



        int g = i;
        int a, b = 0;
        int x = nub;
        while (true) {
            a = nub % 10;
            b += a * (Math.pow(10, (g - 1)));
            nub /= 10;
            g--;
            if (nub == 0) break;
        }

        System.out.println(b);
        if (x == b) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not Polindrome");
        }

    }
}
