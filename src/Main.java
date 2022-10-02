import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==0){
            System.out.println(0);
        }
        else if(number%2==0){
            if(number>0){
                System.out.println("Müsbət cüt ədəddir");
            }
            else{
                System.out.println("Mənfi cüt ədəddir");
            }
        }
        else{
            if(number>0){
                System.out.println("Müsbət tək ədəddir");
            }
            else{
                System.out.println("Mənfi tək ədəddir");
            }
        }


        int num = sc.nextInt();
        int[] a = new int[num / 2];
        int f = num / 2;
        System.out.print(1);
        for (int i = 0; i < num / 2 + 1; i++) {
            int c = num % 2;
            num /= 2;
            a[i] = c;
            --f;
            System.out.print(a[f]);
        }

        //ctrl+alt+l

    }
}