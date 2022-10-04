package az.company.task;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
    }
}
