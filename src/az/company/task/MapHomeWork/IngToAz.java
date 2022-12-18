package az.company.task.MapHomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IngToAz {
    public static void main(String[] args) {
        System.out.println("English: ");
        Scanner scanner = new Scanner(System.in);
        String ingWord = scanner.next();
        Map<Dictionary<Integer,String>,String> translate = new HashMap<>();
        translate.put(new Dictionary<>(1,"hello"),"Salam");
        translate.put(new Dictionary<>(2,"clock"),"Saat");
        translate.put(new Dictionary<>(3,"mirror"),"Güzgü");
        translate.put(new Dictionary<>(4,"translate"),"Tərcümə");
        translate.put(new Dictionary<>(5,"ship"),"Gəmi");
        translate.put(new Dictionary<>(6,"ship"),"Daşımaq");
        translate.put(new Dictionary<>(7,"telephone"),"Telefon");
        translate.put(new Dictionary<>(8,"university"),"Universitet");
        translate.put(new Dictionary<>(9,"shoe"),"Ayaqqabı");
        translate.put(new Dictionary<>(10,"clothes"),"Paltar");


        System.out.println("Azerbaijani: ");
        for (Map.Entry<Dictionary<Integer, String>, String> keyValue : translate.entrySet()) {
            if (!ingWord.toLowerCase().equals(keyValue.getKey().S)) {
            }
            else {
                System.out.println(keyValue.getValue());
            }
        }


    }
}
