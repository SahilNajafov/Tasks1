package az.company.task.MapHomeWork;

import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> roman = new HashMap<>();

        roman.put("I", 1);
        roman.put("IV", 4);
        roman.put("V", 5);
        roman.put("IX", 9);
        roman.put("X", 10);
        roman.put("XL", 40);
        roman.put("L", 50);
        roman.put("XC", 90);
        roman.put("C", 100);
        roman.put("CD", 400);
        roman.put("D", 500);
        roman.put("CM", 900);
        roman.put("M", 1000);

        Integer integerNum = scanner.nextInt();

        Integer a = integerNum;
        int i = 0;
        while (true) {
            a = a / 10;
            i++;
            if (a == 0) break;

        }

        Integer[] divided = new Integer[i];
        Integer copyOfNum = integerNum;
        Integer copyOfNum2 = integerNum;

        int b = 1;
        for (int j = 0; j < i; j++) {
            copyOfNum2 = copyOfNum2 / 10;
            copyOfNum = copyOfNum - copyOfNum2 * 10;

            divided[j] = copyOfNum * b;
            copyOfNum = copyOfNum2;
            b = b * 10;
        }
        for (Integer c : divided) {
            System.out.println(c);
        }


        Iterator<Map.Entry<String, Integer>> iterator = roman.entrySet().iterator();
//        Map.Entry<String, String> keyValue = iterator.next();

        String reqem = "";
        while (iterator.hasNext()) {

            Map.Entry<String, Integer> keyValue = iterator.next();
            for (int j = i - 1; j >= 0; j--) {
                Integer t = divided[j];
                if (divided[j].equals(keyValue.getValue()))
                    System.out.print(keyValue.getKey());
                else{
//                    while(t>keyValue.getValue()){
//                        t-= keyValue.getValue();
//                        reqem+= keyValue.getKey();
//                    }
//                    System.out.println(reqem);
                }
            }

        }

    }
}


//        Iterator<Map.Entry<String, Integer>> iterator = roman.entrySet().iterator();

//        for (int j = i - 1; j >= 0; j--) {
//            Map.Entry<String, Integer> keyValue = iterator.next();
//            for (int k = 0; k < 7; k++) {
//                String reqem = "";
//                Integer value = keyValue.getValue();
//                if (value == divided[j]) {
//                    reqem += keyValue.getKey();
//                    System.out.println(reqem);
//                } else if (value / divided[j] == 1) {
//                    System.out.println(value);
//                } else if (divided[j] > value) {
//                    int l = divided[j] / value;
//                    for (int m = 0; m < l; m++) {
//                        reqem += keyValue.getKey();
//                    }
//                    System.out.println(reqem);
//                }
//            }
//        }

