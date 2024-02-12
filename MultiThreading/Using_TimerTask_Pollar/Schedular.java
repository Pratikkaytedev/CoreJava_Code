package MultiThreading.Using_TimerTask_Pollar;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Schedular {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new SmsPollar(),new Date(),1000);
    }


}

 class SmsPollar extends TimerTask {

     @Override
     public void run() {


         System.out.println("Sms Pollar Start");

     }
 }
