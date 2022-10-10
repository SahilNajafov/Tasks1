package az.company.task;

import java.util.Scanner;

public class ArrayUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's lenght: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter array's elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = 0;
        int h = 1;
        int v = 0;
        int c;
        int x = 0;
        while(true){
            int min = arr[v];
            for (int j = h; j < a; j++) {
                if(min >= arr[j]){
                    min = arr[j];
                }
            }
            for (int k = 0; k < a; k++) {
                if(arr[k]==min){
                    x = k;
                }
            }
            c = arr[n];
            arr[n] = min;
            arr[x] = c;
            v++;
            h++;
            n++;
            if(h==a) break;
        }

        System.out.println();
        for (int g : arr) {
            System.out.print(g + " ");
        }
    }
}
