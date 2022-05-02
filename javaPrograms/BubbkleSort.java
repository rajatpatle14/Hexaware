package Hexaware.programs;

import java.util.Arrays;

public class BubbkleSort {

	public static void main(String[] args) {
		int[]arr= {};
		System.out.println(Arrays.toString(sort(arr)));

	}

	private static int[] sort(int[] arr) {
		boolean swapped=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				System.out.println("Already Soreted");
				break;
			}
		}
		return arr;	
	}
}
