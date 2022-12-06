package az.company.task.SixDecember2;

public class Developer extends Employeer{

    public Developer(Object name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name=" + name +
                '}';
    }
}
