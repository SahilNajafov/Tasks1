package az.company.task.recursion;

public class ReverseStringWithRecursion {
    public static void main(String[] args) {
        System.out.println(reverse("zaman"));
        //System.out.println("hello".substring(0,0).length()); //"" 0
    }
    static String reverse(String s){
        if(s.length()>0)
            return s.substring(s.length()-1)+reverse(s.substring(0,s.length()-1));
        return "";
    }
}
