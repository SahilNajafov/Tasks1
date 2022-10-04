package az.company.task;

import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();


        int a = 1;
        int i = 0;
        if (n >= 1 && n <= 999) {
            while (true) {//45
                int b = 0;
                while (n>0) {
                    a = n % 10;
                    b += Math.pow(a, 2);
                    n /= 10;
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
    }
}
