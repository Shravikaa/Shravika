package datastructures;

import java.util.Arrays;

public class Binarysearch {
	public static void binary(int[] arr,int left,int right,int k) {
		while(left<=right) {
			int mid=(left+right)/2;
			if (arr[mid]==k) {
				System.out.println("element is found at position "+mid);
				return;
			}
			else if(k>arr[mid]){
				binary(arr,mid+1,right,k);
				return;
			}
			else {
				binary(arr,left,mid-1,k);
				return;
			}
		}
		System.out.println("element not found");
		return;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,8,6,5,3,4,10,2};
		Arrays.sort(arr);
		binary(arr,0,arr.length,5);	
	}

}
