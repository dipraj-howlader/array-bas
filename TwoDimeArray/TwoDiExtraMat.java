package TwoDimeArray;

import java.util.Scanner;


public class TwoDiExtraMat {
	//Diagonal Matrix, Upper Matrix, Lower Matrix
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] A = new int[3][3];
		System.out.println("Please Enter A Number: ");
		
		for (int row = 0; row < A.length; row++) {
			for (int col = 0; col < A.length; col++) {
				A[row][col] = input.nextInt();
			}
		}
		
		int sumOfDig = 0;
		int Upper = 0;
		int lower = 0;
		
		for (int row = 0; row < A.length; row++) {
			for (int col = 0; col < A.length; col++) {
				if(row == col) {
					sumOfDig = sumOfDig + A[row][col];
				}
				if(row < col) {
					Upper =Upper + A[row][col];
				}
				if(row> col) {
					lower = lower + A[row][col];
				}
			}
		}
		
		System.out.println("Sum Of Diagonal: "+sumOfDig);
		System.out.println("Sum Of Upper Element: "+Upper);
		System.out.println("Sum Of Lower Element: "+lower);
			
	}
}
