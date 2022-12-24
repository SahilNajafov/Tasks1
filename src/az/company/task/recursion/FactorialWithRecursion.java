package az.company.task.recursion;

public class FactorialWithRecursion {
    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
    static Integer factorial(Integer i) {
        if (i > 1)
            return i * factorial(i - 1);
        return i;
    }

}
