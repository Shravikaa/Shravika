package assignment1;
import java.util.Scanner;

public class BeerBottleGame {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int bottles = 21;

		        System.out.println("There are 21 beer bottles...");
		        System.out.println("There are 2 players - Computer and you.");
		        System.out.println("At a time, each one can pick up any no. of bottles between 1 and 4 (inclusive)");
		        System.out.print("Will you like to play first? (Yes/No): ");
		        String response = scanner.nextLine();

		        if (response.equals("Yes")) {
		            while (bottles>0) {
		                int userPick;
		                System.out.print("How many you would like to pick up? ");
		                userPick = scanner.nextInt();

		                if (userPick < 1 || userPick > 4 || userPick > bottles) {
		                    System.out.println("Invalid input. Please pick between 1 and 4 bottles.");
		                    continue;
		                }

		                bottles -= userPick;
		                System.out.println("The bottles remaining are: " + bottles);

//		                if (bottles==1) {
//		                    System.out.println("You will have to pick up the last..you are the loser.");
//		                    break;
//		                }

		                int computerPick = 5 - userPick;
		                bottles -= computerPick;
		                System.out.println("Computer has picked " + computerPick);
		                System.out.println("The bottles remaining are: " + bottles);
		                if (bottles==1) {
		                    System.out.println("You will have to pick up the last..you are the loser.");
		                    break;
		                }


//		                if (bottles == 0) {
//		                    System.out.println("Computer wins! You have to pay the bill.");
//		                }
		            }
		        } 
		        
		        
		    }
	}

