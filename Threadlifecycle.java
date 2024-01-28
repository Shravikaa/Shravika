package threadsassignment;

public class Threadlifecycle {

    static Object o = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(new MyRunnable());    
        System.out.println("Thread is in New state.");
        t1.start();
        System.out.println("Thread is in Runnable state.");
        Thread.sleep(500); 
        synchronized (o) {
            System.out.println("Thread is in Blocked state.");
            o.notify();
        }
        Thread.sleep(500); 
        synchronized (o) {
            System.out.println("Thread is in Waiting state.");
            o.wait();
        }
        Thread.sleep(1500); 
        System.out.println("Thread is in Terminated state.");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
           System.out.println("Thread is in running state");
        }
    }
}
