package az.company.task.lesson12;

import java.util.Scanner;

public class RemovingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();


        while(true){
            int b = c.indexOf("*");
            if(b==0){
                c=c.substring(1);
                continue;
            }
            c=c.replace(c.substring(b-1,b+1),""); // \\bundan ver *dan evvel
            if(!c.contains("*")){
                System.out.println(c);
                break;
            }
        }
    }
}
