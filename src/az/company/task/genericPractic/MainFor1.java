package az.company.task.genericPractic;

public class MainFor1 {
    public static void main(String[] args) {
          Box<Top> icindeki1 = new Box<>();
          Box<Shar> icindeki2 = new Box<>();
          Box<Oyuncaq> icindeki3 = new Box<>();


        Box[] array=new Box[3];
        array[0]=icindeki1;
        array[1]= icindeki2;
        array[2]= icindeki3;

        for (Box b:array) {
            System.out.println(b);
        }
    }
}
