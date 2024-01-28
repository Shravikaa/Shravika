package threadsassignment;

public class Threads2 extends MyBaseClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                performTask();
            }
        });
        t.start();
    }
}

class MyBaseClass {
    public static void performTask() {
        System.out.println("Task performed by MyBaseClass");
    }
}


