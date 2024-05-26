public class Main {
    public static void main(String[] args) throws InterruptedException {

       //thread of execution in a program (similar to a virtiual computer)
        // The JVM allows an application to have multiple threads running concurrently
        // Each thread can execute parts of your code in parallel with the main threads
        // Each thread has a priority.
        // Threads with higher priority are executed in preference compared to threads
        // with a lower priority
        //
        // The Java Virtual Machine continues to execute threads until either of the
        // following occurs:

        // 1. The exit method of class Runtime has been called
        // 2. All user threads have died
        //
        // When the JVM starts up, there is a thread which calls the main method.
        // This thread is called "main"

        // Daemon thread is a low priority thread that runs in background to perform

        //JVM terminates itself when all user threads (non-daemon threads) finish


        Thread.currentThread().setName("Mainn Man");
        //above is how we can change the thread's name. If not specified the default
        // name will be printed: "main"
        System.out.println(Thread.activeCount());

        //above is how we can see how many threads are active

        System.out.println(Thread.currentThread().getName());

        //above is how we can see specifically which thread(s) are being used


        Thread.currentThread().setPriority(10);

        // we set a specific thread priority of 10 and the line after checks that priority


        System.out.println(Thread.currentThread().getPriority());

        //priority is on a scale of 1 to 10 higher the number the higher priority


        System.out.println(Thread.currentThread().isAlive());

        //line above checks to see whether current thread is alive (bool)

        for (int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done");

        // the above loop, is used to sleep a thread
        // for each loop, the position is printed, 3..2..1
        // as long as the counter is above 0, the print statement wont be executed
        // the thread is being set to sleep after each loop, after a 1 second delay
        // this makes the counter print:
        // 3
        // 2
        // 1
        // you are done




    }
}