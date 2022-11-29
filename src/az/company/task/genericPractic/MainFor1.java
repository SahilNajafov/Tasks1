package az.company.task.genericPractic;

public class MainFor1 {
    public static void main(String[] args) {
        Box<String> icindeki1 = new Box<>("Top");
        Box<String> icindeki2 = new Box<>("Oyuncaq");
        Box<String> icindeki3 = new Box<>("Shar");

        String[] array=new String[3];
        array[0]= String.valueOf(icindeki1);
        array[1]= String.valueOf(icindeki2);
        array[2]= String.valueOf(icindeki3);

        for (String b:array) {
            System.out.println(b);
        }
    }
}
