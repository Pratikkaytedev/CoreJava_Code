package MultiThreading;

import MultiThreading.Using_ThreadSchedular.A;

public class Sleep_Method extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 1; i < 55; i++) {
                System.out.println(n);
                Thread.sleep(1000);
            }
       } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class B {
    public static void main(String[] args) {
        MultiThreading.Using_ThreadSchedular.A r = new MultiThreading.Using_ThreadSchedular.A();
        Thread t1 = new Thread(r);
        t1.setName("thread 1");
        Thread t2 = new Thread(r);
        t2.setName("thread 2");
        Thread t3 = new Thread(r);
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();

        for (int i = 1; i < 3; i++) {
            System.out.println("main method calls");
        }
    }
}


