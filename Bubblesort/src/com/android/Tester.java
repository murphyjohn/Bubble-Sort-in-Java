package com.android;

public class Tester {
	//the sorting method
	public static int[] bubbleSort(int[] numbers){
		boolean swapped;
		do{
			swapped=false;
			for (int i=0; i<numbers.length-1; i++){
				if (numbers[i] > numbers [i+1]){
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
					swapped=true;
				}
			}
		} while (swapped == true);
		return numbers;
	}

}
