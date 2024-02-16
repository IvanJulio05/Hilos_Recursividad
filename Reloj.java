import static java.lang.Thread.sleep;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reloj implements Runnable{

    @Override
    public void run() {
       
        LocalTime time=LocalTime.now();
        int hour=time.getHour();
        int minute=time.getMinute();
        int second=time.getSecond();
        String day;
        
        if(hour>12){
            day="PM";
        }
        else{
            day="am";
        }
        
        
        GraficoReloj gc=new GraficoReloj(day);
        gc.setVisible(true); 
        
        while(true){
            if(second>60){
                second=0;
                minute++;
            }
            if(minute>60){
                hour++;
                minute=0;
                second=0;
            }
            if(hour>12){
                day="PM";
            }
            else{
            day="am";
            }
            second++;
            gc.setSecond(second);
            gc.setMinute(minute);
            gc.setHours(hour);
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
}