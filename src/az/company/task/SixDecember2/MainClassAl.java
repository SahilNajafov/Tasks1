package az.company.task.SixDecember2;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassAl {
    public static void main(String[] args) {
        Employeer<Developer> developer = new Developer("Kamil");
        Employeer<Manager> manager = new Manager("Fərhad");
        Employeer<Tester> tester = new Tester("İsmayıl");

        ArrayList<Employeer> arrayList = new ArrayList<>();
        arrayList.add(developer);
        arrayList.add(manager);
        arrayList.add(tester);

//        Collections.sort(arrayList<>);
        for (Employeer a:arrayList) {
            System.out.println(a+" ");
        }
    }
}
