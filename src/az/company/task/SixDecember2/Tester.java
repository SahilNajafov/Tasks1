package az.company.task.SixDecember2;

public class Tester extends Employeer{
    public Tester(Object name,Object surname,Object salary) {
        super(name,surname,salary);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name=" + name +
                ", surname=" + surname +
                ", salary=" + salary +
                '}';
    }
}
