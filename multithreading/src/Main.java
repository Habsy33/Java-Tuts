public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Multithreading = process of executing multiple threads simultaneously
        // Helps maximumise utilisation of CPU
        // Threads are independent, they don't affect the execution of other threads
        // An exception in one thread won't interrupt other threads
        // useful for serving multiple clients, multiplayer games, or other mutually independent tasks


        //These are different ways of creating threads:
        // 1:
        MyThread thread1 = new MyThread();




        //2:
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);


        thread1.start();
        thread1.join(3000);
        //.join method means the main thread will wait for thread1 to finish before
        //continuing with the rest of the program

        //if you specify the time, the 2nd thread wont start until the time has been met

        thread2.start();

        System.out.println(1/0);


        //benefit of threads are that;
        // if one thread encounters an exception the other thread is
        // unaffected and will still run

        // in this example we actually have 3 threads


    }
}