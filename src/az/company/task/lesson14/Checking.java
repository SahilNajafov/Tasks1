package az.company.task.lesson14;

import java.util.List;

public class Checking {
    public static void main(String[] args) {
        String s = "cars";
        String[] arr = new String[]{"car","ca","rs"};
//        System.out.println(first(s,arr));

    }
    static boolean first(String s, List<String> wordDict) {
        String[] arr = new String[wordDict.size()];
        int t = 0;
        for (String sd : wordDict) {
            arr[t] = sd;
            t++;
        }


        for(int i = -1; i<arr.length-2;i++) {
            String a = s;
            for (int j = i+1; j < arr.length; j++) {
                if(a.contains(arr[j])){
                    a=a.replace(arr[j],"");
                }
            }
            if(a.equals("")){
                return true;
            }
        }
        return false;
    }

}
