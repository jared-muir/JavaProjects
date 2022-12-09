package optionTwo;

import java.util.Scanner;

//this program accepts five different numbers and calculates the sum
//the program calls the array recursively
public class SumOfNum {
	
	
	public static double RecursiveSum(double x [], int index) {
		
//return 0 when index of array reaches 0 (base case)	
		if (index < 0) {
			return 0;
		}
//return index input plus previously input numbers (recursive function)		
		return x[index] + RecursiveSum (x, --index);	
	}
	
	public static void main (String [] args) {
//initialize array to hold 5 numbers		
		double [] Array = new double [5];
		Scanner in = new Scanner (System.in);
		
		System.out.println("Entering five numbers...");
//loop through array from index 0 to index 4 (5 times) until array is filled 
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter #" + (i+1) + " then press the 'ENTER' key:");
			Array[i] = in.nextDouble();
		}
		in.close();
//print the sum of the array		
		System.out.println("The sum of your entered numbers is: " + RecursiveSum(Array, 4));
	}

}
