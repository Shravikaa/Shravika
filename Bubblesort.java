package datastructures;

import java.util.Arrays;

public class Bubblesort {
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	}

	public static void main(String[] args) {
		int a[]= {3,4,9,15,2,5,71,43};
		Selectionsort o=new Selectionsort();
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			  }
			o.printArray(a);
			System.out.println();
		   }
		System.out.println(Arrays.toString(a));
	}
		
}


