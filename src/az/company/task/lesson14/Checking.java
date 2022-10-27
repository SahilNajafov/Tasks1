package az.company.task.lesson14;

public class Checking {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] arr = new String[]{"cats","dog","sand","and","cat"};
        System.out.println(first(s,arr));

    }
    static boolean first(String s,String[] arr) {
        for(int i = 0; i<arr.length;i++) {
            if(s.contains(arr[i])) {
                s=s.replace(arr[i], "");
            }
        }
        if(s.equals("")) {
            return true;
        }
        else {
            return false;
        }
    }

}
