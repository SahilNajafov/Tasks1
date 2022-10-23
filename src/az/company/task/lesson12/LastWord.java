package az.company.task.lesson12;

import java.util.Scanner;

public class LastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
        String a;
        a = "luffy is still joyboy";
        a = a.trim();

        int b = a.lastIndexOf(" ");
        System.out.println(a);
        System.out.println(a.substring(b+1).length());
    }
}
