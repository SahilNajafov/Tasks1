package az.company.task.SixDecember;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sixdekabr {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(13);
        arrayList1.add(2);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(56);
        arrayList2.add(78);
        combineArrays(arrayList1, arrayList2);
    }
    public static void combineArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> arrayListResult = new ArrayList<>();
        arrayListResult.addAll(arrayList1);
        arrayListResult.addAll(arrayList2);

        for (int i = 0; i < arrayListResult.size(); i++) {
            for (int j = i+1; j < arrayListResult.size(); j++) {
                int a = 0;
                if (arrayListResult.get(i)>arrayListResult.get(j)){
                    a = arrayListResult.get(i);
                    Collections.swap(arrayListResult, i, j);
                    arrayListResult.set(j,a);
                }
            }
        }

        Collections.sort(arrayListResult);

        for (Integer a: arrayListResult) {
            System.out.print(a+" ");
        }
    }

}
