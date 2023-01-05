package az.company.task.MethodReferencePractic;

public class MtdRfrnc {
    public static void main(String[] args) {


        A a = s->{
            return s.length();
        };
        System.out.println(a.a1("hello"));


        A a2 = String::length;
        System.out.println(a2.a1("hello"));

        A a3 = new B()::b1;
        System.out.println(a3.a1("hello"));

        A a4 = B::b2;
        System.out.println(a4.a1("hello"));

    }
}

class B{
    Integer b1(String s){
        return s.length();
    }
    static Integer b2(String s){
        return s.length();
    }
}
interface A{
    Integer a1(String s);
}