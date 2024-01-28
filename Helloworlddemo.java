package threadsassignment;

public class Helloworlddemo extends Thread{
	@Override
	public void run() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Helloworlddemo o=new Helloworlddemo();
		o.start();
	}
}

