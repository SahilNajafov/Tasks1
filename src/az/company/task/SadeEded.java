package az.company.task;

import java.util.Scanner;

public class SadeEded {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ədədi daxil edin: ");
        int num = scanner.nextInt();

        int i = 1;
        int b = 0;
        while (i <= (num / 2) && num > 0) {
            if (num % i == 0) {
                b++;
            }
            i++;
        }
        if (num > 0) {
            if (num == 1) {
                System.out.println("Ədəd nə sadə, nə də mürəkkəbdir");
            } else if (b == 1) {
                System.out.println("Sadə ədəddir");
            } else {
                System.out.println("Sadə ədəd deyil");
            }
        }
        else{
            System.out.println("Ədədi yenidən daxil edin");
        }


    }
}
