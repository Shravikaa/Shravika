package exceptionassingment;

public class Oddexception {

    public static void main(String[] args) {
        int number = 5; 
        try {
            checkEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (OddNumberException e) {
        	e.printStackTrace();
        }
    }
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is odd.");
        }
    }
}
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
