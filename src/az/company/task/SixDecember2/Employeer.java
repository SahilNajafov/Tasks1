package az.company.task.SixDecember2;

public abstract class Employeer<T,S> {
    T name;
    T surname;
    S salary;
    public Employeer(T name,T surname,S salary){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name=" + name +
                ", surname=" + surname +
                ", salary=" + salary +
                '}';
    }
}
