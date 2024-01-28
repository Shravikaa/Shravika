package assignment1;

public class Whileloop {
	public String palindrome(int n) {
		
		String original = Integer.toString(n);
        int length = original.length();
        int i = 0;

        while (i < length / 2) {
            if (original.charAt(i) != original.charAt(length - i - 1)) {
                return "not palindrome";
            }
            i++;
        }
        return "palindrome";
		
	}

	public static void main(String[] args) {
		Whileloop o=new Whileloop();
		System.out.println(o.palindrome(1213));
		
	}

}
