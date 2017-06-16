package com.android;

public class Main {

	public static void main(String[] args) {
		int[] myArray = { 2,3,6,5,65,43,22,4};
		
		System.out.println("Before sorting");
		for(int i=0; i < myArray.length; i++){
			System.out.print(" "+myArray[i]);
		}
		
		int[] myArray2 = new int[myArray.length];
		myArray2=Tester.bubbleSort(myArray);
		
		System.out.println("\nAfter Sorting");
		for(int i =0; i < myArray2.length; i++){
			System.out.print(" "+myArray2[i]);
		}
		
		System.out.println("\nCompleted");
		

	}

}
