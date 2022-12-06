package az.company.task.SixDecember2;

public class Developer extends Employeer{

    public Developer(Object name,Object surname,Object salary) {
        super(name,surname,salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name=" + name +
                ", surname=" + surname +
                ", salary=" + salary +
                '}';
    }
}
