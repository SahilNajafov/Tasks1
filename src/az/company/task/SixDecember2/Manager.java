package az.company.task.SixDecember2;

public class Manager extends Employeer{
    public Manager(Object name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + name +
                '}';
    }
}
