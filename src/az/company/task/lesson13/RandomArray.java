package az.company.task.lesson13;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter array's length: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Random array: ");
        for (int i = 0; i < a; i++) {
            arr[i]=random.nextInt(9);
//            arr[i] = scanner.nextInt();
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Last version: ");
        int g = 0;
        for (int l = 0; l < a; l++) {
            if (arr[l] == 9) {
                g++;
            }
        }
        if (g == a) {
            int[] arr1 = new int[a + 1];
            arr1[0] = 1;
            System.out.println();
            for (int n = 0; n < a + 1; n++) {
                System.out.print(arr1[n] + " ");
            }
        } else {
            if (arr[a - 1] <= 8) {
                arr[a - 1] += 1;
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (arr[j] == 9) {
                        arr[j] = 0;
                    } else {
                        arr[j] += 1;
                        break;
                    }
                }
            }
            System.out.println();
            for (int k = 0; k < a; k++) {
                System.out.print(arr[k] + " ");
            }
        }


    }
}
