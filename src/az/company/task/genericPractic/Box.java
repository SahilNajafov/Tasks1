package az.company.task.genericPractic;

public class Box <T>{
    T a;

    public Box(T a) {
        this.a = a;
    }

    public Box() {
    }

    public T getBox() {
        return a;
    }

    @Override
    public String toString() {
        return a.toString();
    }
}
