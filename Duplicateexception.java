package exceptionassingment;
import java.util.*;

public class Duplicateexception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        
        try {
            checkDuplicate(numbers);
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            e.printStackTrace();
        }       
        scanner.close();
    }
    public static void checkDuplicate(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            set.add(num);
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}