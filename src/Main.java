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


    }
}