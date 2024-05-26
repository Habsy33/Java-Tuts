public class MyThread extends Thread{

    @Override
    public void run () {

        if (this.isDaemon()) {
            System.out.println("This is a daemonthread that is running");

        } else {
            System.out.println("This is a user thread is running");
        }
    }
}

