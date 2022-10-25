package az.company.task.lesson13;

import java.util.Scanner;

public class MostUsedLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumleni daxil edin: ");
        String a = scanner.nextLine();
//        String a = "hsvada ababbbxaadwdaaaaa mmama saaasdada";
        int o = a.length();
        int[] arr1 = new int[o];
        for (int j = 0; j < a.length(); j++) {
            int g = 0;
            if (a.charAt(j) == ' ') continue;
            for (int k = 0; k < a.length(); k++) {
                if (a.charAt(j) == a.charAt(k)) {
                    g++;
                }
            }
            arr1[j] = g;
        }
        int max = arr1[0];
        for (int p = 1; p < arr1.length; p++) {
            if (max < arr1[p]) {
                max = arr1[p];
            }
        }
        int d = 0;
        for (int r = 0; r < arr1.length; r++) {
            if (arr1[r] == max) {
                d = r;
                break;
            }
        }
        System.out.println("En cox istifade olsunan herf: " + a.charAt(d));
        System.out.println("İstifadə oldunduğu miqdar: " + max);


        /*
        String so = "aa bbb     ";
        int max1=0;
        char herf=so.charAt(0);
        for (int i = 0; i < so.length(); i++) {
            int temp=0;
            if(so.charAt(i)==' ')continue;
            for (int j = i; j < so.length(); j++) {
                if(so.charAt(i)==so.charAt(j))
                    temp++;
            }
            if(max1<temp) {
                max1 = temp;
                herf=so.charAt(i);
            }
        }
        System.out.println("En cox istifade olsunan herf: "+herf);
        System.out.println("İstifadə oldunduğu miqdar: "+max1);
         */

    }
}




//        a = a.trim();
//        int h = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if(a.charAt(i)==' '){
//                h++;
//            }
//        }
//
        /*
        System.out.println(h);
//        int b = a.length();
//        int[] arr = new int[b];
//        for (int i = 0; i < ; i++) {
//            int x = 1;
//            for (int j = 1; j < ; j++) {
//                if()
//                x++;
//            }
//        }
        int x = 0;
        String j;
        int BosluqSayi = -h;
        while(true){
            char y = a.charAt(x);
            j =  a.replace(y,' ');
            for (int k = 0; k < a.length(); k++) {
                if(a.charAt(k)==' '){
                    BosluqSayi++;
                }
            }
//            BosluqSayi=BosluqSayi-h;
            x++;
        }

     */
