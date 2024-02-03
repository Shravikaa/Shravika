package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Greedywater {

    public static int maxFilledBottles(int n, int x, int[] bottleCapacities) {
        Arrays.sort(bottleCapacities); 
        int filledBottles = 0;
        for (int i : bottleCapacities) {
            if (x >= i) {
                x -= i;
                filledBottles++;
            } else {
                break;
            }
        }
        return filledBottles;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of test cases ");
        int t = scanner.nextInt(); 
        for (int i = 0; i < t; i++) {
        	System.out.println("enter no of bottles ");
            int bottles = scanner.nextInt();
            System.out.println("enter the total capacity ");
            int capacity = scanner.nextInt(); 
            int[] bottleCapacities = new int[bottles];
            for (int j = 0; j < bottles; j++) {
            	System.out.println("enter the bottle capacity of "+(j+1));
                bottleCapacities[j] = scanner.nextInt(); 
            }
            int result = maxFilledBottles(bottles, capacity, bottleCapacities);
            System.out.println(result);
        }
    }
}
