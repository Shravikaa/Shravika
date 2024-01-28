package exceptionassingment;

import java.util.Scanner;

public class StringException {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		try {
			vowelfunction(str);
		}
		catch(VowelException e) {
			e.printStackTrace();
		}	
	}
	public static void vowelfunction(String str)throws VowelException{
		String a[]=str.split("");
		for(String i:a) {
			if((i.equals("a"))||(i.equals("e"))||(i.equals("o"))||(i.equals("i"))||(i.equals("u"))) {
				System.out.println("string contains vowels");
				return;
			}
		}
		throw new VowelException("no vowels");
	}
}
class VowelException extends Exception{
	VowelException(String msg){
		super(msg);
	}
}
