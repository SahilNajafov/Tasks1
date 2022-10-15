package az.company.task;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 5, 8, 10, 45, 67};

        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while (true) {
            int mid = (low + high) / 2;
            if (low > high) {
//                System.out.println(-1);
                System.out.println(low * (-1) - 1);
                break;
            } else if (n == arr[mid]) {
                System.out.println("Number found in this idex: " + mid);
                break;
            } else if (n > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
