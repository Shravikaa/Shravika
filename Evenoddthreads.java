package threadsassignment;

public class Evenoddthreads{

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());
        evenThread.start();
        oddThread.start();
    }
static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
