package az.company.task.SixDecember2;

import az.company.task.lesson17.Obj;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassAl {
    public static void main(String[] args) {
        Employeer<String,Integer> developer = new Developer("Kamil","Əliyev",1000);
        Employeer<String,Integer> manager = new Manager("Fərhad","Kamilov",1000);
        Employeer<String,Integer> tester = new Tester("İsmayıl","Mamedov",1000);

        ArrayList<Employeer> arrayList = new ArrayList<>();
        arrayList.add(developer);
        arrayList.add(manager);
        arrayList.add(tester);

//        Collections.sort(arrayList);


        for (Employeer a:arrayList) {
            System.out.println(a+" ");
        }


//        Developer developer1 = new Developer("b");
//        Manager manager1 = new Manager("a");
//        Tester tester1 = new Tester("c");
//
//        ArrayList<Employeer> arrayList1 = new ArrayList<>();
//        arrayList1.add(developer1);
//        arrayList1.add(manager1);
//        arrayList1.add(tester1);
//
//        Collections.sort(arrayList1);
//
//        for (Employeer b:arrayList1) {
//            System.out.println(b+" ");
//        }


    }
}
