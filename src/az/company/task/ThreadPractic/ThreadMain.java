package az.company.task.ThreadPractic;


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("First Thread: "+ i);
        }
    }
}
public class ThreadMain {
    public static void main(String[] args) {


        Thread thread1 = new Thread(()->{
                for (int i = 100; i>=0; i--) {
                    System.out.println("Second Tread: "+i);
                }
        }
      );
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

    }
}
