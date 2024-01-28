package exceptionassingment;

public class Dividebyzero {

	public static void main(String[] args) {
		Dividebyzero o=new Dividebyzero();
		try {
			System.out.println(o.divide(2,0));
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Dont divide by zero");
		}
	}
	public int divide(int i,int j) {
		return i/j;
	}

}
