import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
   public static void main(String[] args) {

      new Thread(new Runnable() {
         public void run() {
            while(true) { //бесконечно крутим

               try {
                  Thread.sleep(1000); //секунды в милисекундах

                     Date date = new Date();
                     SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
                     System.out.println(formatForDateNow.format(date));
                  }
               catch (InterruptedException e) {
                  e.printStackTrace();
               }
            }
         }
      }).start();


   }
}