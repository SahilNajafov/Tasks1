package az.company.task.lesson12;

import java.util.Scanner;

public class RemovingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c = scanner.next();
//        String c ="*hee*lll*oo*";

        if(c.indexOf("*")==0){
            c=c.substring(1);
        }
        while(true){
            int b = c.indexOf("*");

            c=c.replace(c.substring(b-1,b+1),"");
            boolean x = c.contains("*");
            if(!x){
                System.out.println(c);
                break;
            }
        }
    }
}
