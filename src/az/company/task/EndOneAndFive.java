package az.company.task;

public class EndOneAndFive {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (i % 10 == 1 || i % 10 == 5) {
                System.out.println(i);
            }
        }
    }
}
