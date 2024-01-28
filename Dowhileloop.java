package assignment1;

public class Dowhileloop {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int i=0;
		
		System.out.println(n1);
		System.out.println(n2);
		do {
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			i++;
		}
		while(i<8);
		
		
		
		
		
	}

}
