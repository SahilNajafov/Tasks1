package az.company.task;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int[] arr = new int[a];
//
//        for (int i = 0; i < a; i++) {
//            arr[i] = scanner.nextInt();
//        }
        boolean result = false;
        int[] arr = {1, 3, 5, 6, 21};
        for (int y : arr) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (b == arr[i]) {
                System.out.println("index = " + i);
                result = true;
                break;
            }
//            else if(b<arr[i]){
//                System.out.println(i);
//                break;
//            }
        else {
                result = false;
            }
        }

        int x = 0;
        if (result == false && arr[0] < b) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < b) {
                    x = j;
                }
            }
            System.out.println("can be added to this index: " + (x + 1));
        } else if (result == false && arr[0] > b) {
            System.out.println("can be added to this index: " + 0);
        }
    }
}
