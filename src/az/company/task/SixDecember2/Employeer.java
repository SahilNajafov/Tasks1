package az.company.task.SixDecember2;

public abstract class Employeer<T> {
    T name;
    public Employeer(T name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name=" + name +
                '}';
    }
}
