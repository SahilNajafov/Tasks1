package az.company.task;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's lenght: ");
        int n = scanner.nextInt();
        int m = n;
        int[][] arr = new int[n][m];
        int cem = 0;
        System.out.println("Enter array's elements: ");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                arr[x][y] = scanner.nextInt();
            }
        }
        for (int i = 0, j = 0; i < arr.length && j < arr.length; i++, j++) {
            cem += arr[i][j];
        }
        for (int a = arr.length - 1, b = 0; a >= 0 && b < arr.length; a--, b++) {
            cem += arr[a][b];
        }
        if (n % 2 != 0) {
            cem -= arr[n / 2][n / 2];
        }
        System.out.println("The sum of the diagonals: ");
        System.out.println(cem);
    }
}
