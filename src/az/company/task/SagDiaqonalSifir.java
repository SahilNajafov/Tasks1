package az.company.task;

import java.util.Scanner;

public class SagDiaqonalSifir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's lenght: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int uzunluq = arr.length;
        System.out.println("Enter array's elements: ");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                arr[x][y] = scanner.nextInt();
            }
        }



        int i = 0;
        while(i <= arr.length) {
            for (int j = 0;j < uzunluq;j++) {
                arr[i][j] = 1;
            }
            i++;
            uzunluq--;
        }
        for (int l = 0; l < n; l++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[l][k]+" ");
            }
            System.out.println();
        }

    }
}
