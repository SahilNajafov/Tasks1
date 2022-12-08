package az.company.task.LinkedList;

import java.util.LinkedList;

public class LinkedListCol {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(5);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);
        linkedList2.add(8);
        linkedList2.add(5);

        System.out.println(listKesishmeElementleri(linkedList1,linkedList2));
        System.out.println(listKenarElementler(linkedList1,linkedList2));
    }
    public static LinkedList<Integer> listKesishmeElementleri(LinkedList<Integer> linkedList1,LinkedList<Integer> linkedList2){
        LinkedList<Integer> finalList = new LinkedList<>();
        for (int i = 0; i < linkedList1.size(); i++) {
            if (linkedList2.contains(linkedList1.get(i))){
                finalList.add(linkedList1.get(i));
            }
        }
        finalList.sort(null);
        return finalList;

    }
    public static LinkedList<Integer> listKenarElementler(LinkedList<Integer> linkedList1,LinkedList<Integer> linkedList2){
        LinkedList<Integer> finalList2 = new LinkedList<>();

        finalList2.addAll(linkedList1);
        finalList2.addAll(linkedList2);

        for (int i = 0; i < listKesishmeElementleri(linkedList1,linkedList2).size(); i++) {
            finalList2.remove(listKesishmeElementleri(linkedList1,linkedList2).get(i));
            if(finalList2.contains(listKesishmeElementleri(linkedList1,linkedList2).get(i))) i =-1;
        }
        finalList2.sort(null);
        return finalList2;

    }
}
