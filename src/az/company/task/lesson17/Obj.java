package az.company.task.lesson17;

import java.util.Scanner;

public class Obj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Telebelerin sayi: ");
        int telebelerinSayi = scanner.nextInt();

        Telebe[] telebeler = new Telebe[telebelerinSayi];

        for (int i = 0; i < telebelerinSayi; i++) {
            Telebe tlb = new Telebe();
            System.out.printf("%d-ci telebenin adi: ", i + 1);
            tlb.ad = scanner.next();
            System.out.printf("%d-ci telebenin soyadi: ", i + 1);
            tlb.soyad = scanner.next();
            System.out.printf("%d-ci telebenin yasi: ", i + 1);
            tlb.yash = scanner.nextInt();
            System.out.println();
            telebeler[i] = tlb;
        }

        int min = telebeler[0].yash;
        int indexOfMinYash = 0;
        for (int i = 0; i < telebelerinSayi; i++) {
            for (int k = 0; k < telebelerinSayi; k++) {
                if (min > telebeler[k].yash) min = telebeler[k].yash;
            }
            for (int j = 0; j < telebelerinSayi; j++) {
                if (telebeler[j].yash == min) indexOfMinYash = j;
            }
            System.out.printf("%d-ci telebenin melumatlari: \n", i + 1);
            System.out.println("Adi: " + telebeler[indexOfMinYash].ad + " ");
            System.out.println("Soyadi: " + telebeler[indexOfMinYash].soyad + " ");
            System.out.println("Yashi: " + telebeler[indexOfMinYash].yash + " ");
            System.out.println();
            telebeler[indexOfMinYash].yash = 300;
            min = 300;
        }




        //        int j =0;
//        for (int i = 0; i < telebelerinSayi; i++) {
//            System.out.printf("%d-ci telebenin adi: ",i+1);
//            tt.ad = scanner.next();
//            telebeler[i][j]=tt.ad;
//            System.out.printf("%d-ci telebenin soyadi: ",i+1);
//            telebeler[i][j + 1].soyad = scanner.next();
//            System.out.printf("%d-ci telebenin yasi: ",i+1);
//            telebeler[i][j + 2].yash = scanner.nextInt();
//        }
    }
}
