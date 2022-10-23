package az.company.task;

import java.util.Scanner;

public class OdurBudur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adamlarin sayi: ");
        int uzunluq = scanner.nextInt();
        int uzunluq2 = uzunluq;
        System.out.println("Iterasiyalarin sayi: ");
        int IterasiyaSayi = scanner.nextInt();
        int[] AdamlarinSayi = new int[uzunluq];

        for (int i = 0; i < uzunluq; i++) {
            AdamlarinSayi[i] = i + 1;
        }
        int x = IterasiyaSayi;
        int v = 0;
        int y = 1;
        int z;
        while (true) {
            int f = 0;
            int c = AdamlarinSayi.length - v;
            int[] AdamlarinSayi2 = AdamlarinSayi;
            while(y<=x){
                z=y;
                if (y == AdamlarinSayi.length) {
                    x = uzunluq-z;
                    y = 1;
                }
                if (y == x) {
                    for (int j = 0; j < c; j++) {
                        if (AdamlarinSayi2[j] == x) {
                            AdamlarinSayi2[j] = 0;
                        }
                        System.out.print(AdamlarinSayi2[j] + " ");

                    }
                    System.out.println();
                    break;
                }
                y++;
                for (int k = 0; k < uzunluq; k++) {
                    if (AdamlarinSayi2[k] != 0) {
                        f++;
                    }
                }
                if (f == 1) {
                    for (int l = 0; l < uzunluq; l++) {
                        if (AdamlarinSayi2[l] != 0) {
                            System.out.println(AdamlarinSayi2[l]);
                        }
                    }
                    break;
                }
            }
        }
    }
}
