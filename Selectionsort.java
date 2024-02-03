package datastructures;

import java.util.Arrays;

public class Selectionsort {
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	}

	public static void main(String[] args) {
		int a[]= {66,44,99,11,33};
		Selectionsort o=new Selectionsort();
		for(int i=0;i<3;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			o.printArray(a);
			System.out.println();
		  }
		
	  System.out.println("final array is ");
	  o.printArray(a);
	}

}
