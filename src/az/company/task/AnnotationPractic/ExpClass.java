package az.company.task.AnnotationPractic;

@OnlyStringField
public class ExpClass {
    String name;

    public ExpClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExpClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
