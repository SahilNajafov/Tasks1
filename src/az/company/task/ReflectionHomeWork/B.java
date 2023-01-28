package az.company.task.ReflectionHomeWork;

import java.lang.reflect.Constructor;

public class B {
    public static void main(String[] args) throws Exception {

        Constructor<A> d = A.class.getDeclaredConstructor(Integer.class);
//        Constructor<A> d = A.class.getDeclaredConstructors()[0];
        d.setAccessible(true);
        System.out.println(d.newInstance(2));

    }
}
