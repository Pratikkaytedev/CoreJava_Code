package MultiThreading;

public class Join_Method implements Runnable{
    @Override
    public void run() {
        String ref = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(ref);
        }
    }
}
class Ba {
    public static void main(String[] args) {
        Join_Method r=new Join_Method();
        Thread t1 = new Thread(r);
        t1.setName("thread t1");
        Thread t2 = new Thread(r);
        t2.setName("thread t2");
        Thread t3 = new Thread(r);
        t3.setName("thread t3");
        t1.start();{
            try {
                t1.join();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }

        }
        t2.start();
        t3.start();

    }
}
