package az.company.task.SixDecember2;

public class Manager extends Employeer{
    public Manager(Object name,Object surname,Object salary) {
        super(name,surname,salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + name +
                ", surname=" + surname +
                ", salary=" + salary +
                '}';
    }
}
