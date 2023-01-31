package az.company.task.AnnotationPractic;

import java.lang.reflect.Field;

public class AnnoMain {
    public static void main(String[] args) {
        Field[] fields = ExpClass.class.getDeclaredFields();

        for (Field f:fields) {
            if(ExpClass.class.isAnnotationPresent(OnlyStringField.class)){
                Class<?> type = f.getType();
                if(!type.getTypeName().contains("String")){
                    throw new OnlyString();
                }
            }
        }

        ExpClass expClass =new ExpClass("hi");
        System.out.println(expClass);
    }
}
