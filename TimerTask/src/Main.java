import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer = a facility for threads to schedule tasks
        // for future execution in a background thread

        // TimerTask = A task that can be scheduled for one-time
        // or repeated execution by a Timer

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
        int counter = 10;

            @Override
            public void run() {
                if(counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy new year");
                    timer.cancel();
                }
            }
        };

//        timer.schedule(task, 3000);

        //above is how we delay the run task
        //the time is always in milliseconds (delay: )

//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR, 2024);
//        date.set(Calendar.MONTH, Calendar.MAY);
//        date.set(Calendar.DAY_OF_MONTH, 26);
//        date.set(Calendar.HOUR_OF_DAY, 17);
//        date.set(Calendar.MINUTE, 8);
//        date.set(Calendar.MILLISECOND, 0);
//
//        timer.schedule(task, date.getTime());

        //above is how we can make the task run time more specific
        // we have options to specify the year up to the millisecond


        timer.scheduleAtFixedRate(task, 0, 1000);


    }
}