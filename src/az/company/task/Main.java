package az.company.task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if(number==0){
//            System.out.println(0);
//        }
//        else if(number%2==0){
//            if(number>0){
//                System.out.println("Müsbət cüt ədəddir");
//            }
//            else{
//                System.out.println("Mənfi cüt ədəddir");
//            }
//        }
//        else{
//            if(number>0){
//                System.out.println("Müsbət tək ədəddir");
//            }
//            else{
//                System.out.println("Mənfi tək ədəddir");
//            }
//        }

//
//        int num = sc.nextInt();
//        int[] a = new int[num / 2];
//        int f = num / 2;
//        for (int i = 0; i < num / 2 + 1; i++) {
//            int c = num % 2;
//            num /= 2;
//            a[i] = c;
//            --f;
//            System.out.print(a[f]);
//        }


        //---------------------------------------------------------------------------------------------------------


//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int i = 0;
//        int c = 0;
//        while (true) {
//            c = num / 10;
//            num /= 10;
//            i++;
//            if (c == 0) {
//                break;
//            }
//        }
//
//        System.out.println(i);
//
//        int g = i;
//        int a, b = 0;
//        int x = num;
//        while (true) {
//            a = num % 10;
//            b += a * (Math.pow(10, (g - 1)));
//            num /= 10;
//            g--;
//            if (num == 0) break;
//        }
//
//        System.out.println(b);
//        if (x == b) {
//            System.out.println("Polindrome");
//        } else {
//            System.out.println("Not Polindrome");
//        }


        /*

        //TASK 1
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int a = 1;
        int b = 0;
        int x = num;
        while (true) {
            a = num % 10;
            b = (b * 10) + a;
            num /= 10;
            if (num == 0) break;
        }

        System.out.println(b);
        if (x == b) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not Polindrome");
        }

         */


        /*
        //TASK 2
        System.out.println("Enter number: ");
        int n = sc.nextInt();


        int a = 1;
        int i = 0;
        if (n >= 1 && n <= 999) {
            while (true) {
                int b = 0;
                while (true) {
                    a = n % 10;
                    b += Math.pow(a, 2);
                    n /= 10;
                    if (n == 0) break;
                }

                n = b;
//                System.out.println(b);

                i++;

                if (b % 10 == 1) {
                    System.out.println(true);
                    break;
                } else {
                    if (i > 50) {
                        System.out.println(false);
                        break;
                    }
                }
            }
        }
         */


        /*
        //TASK 3
        System.out.println("Enter numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Choose one of these operators: +,-,*,/");
        String op = sc.next();
        switch (op){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
         */


    }
}