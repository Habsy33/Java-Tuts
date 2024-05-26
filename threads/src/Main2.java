public class Main2 {
    public static void main(String[] args) {

        MyThread thread2 = new MyThread();
        //instantiating a thread2 object of the MyThread class


        thread2.setDaemon(true);


        thread2.start();
        //without the .start method the thread (thread2) will return as false
        // for the isAlive method

        System.out.println(thread2.isAlive());

        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        System.out.println(thread2.getPriority());

        thread2.setPriority(4);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());



        System.out.println(thread2.isDaemon());

    }
}
