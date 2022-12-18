package az.company.task.MapHomeWork;

public class Dictionary<T,S> {
    Integer T;
    String S;

    public Dictionary(Integer t, String s) {
        T = t;
        S = s;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "T=" + T +
                ", S='" + S + '\'' +
                '}';
    }
}
