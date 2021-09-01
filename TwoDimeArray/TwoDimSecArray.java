package TwoDimeArray;

import java.util.Scanner;

public class TwoDimSecArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		System.out.println("A Matrix");
		for(int row = 0; row<2; row++) {
			for(int col = 0 ; col <3 ; col ++) {
			A[row][col] = input.nextInt();
			}
		}
		
		System.out.println("B Matrix");
		for(int row = 0; row<2; row++) {
			for(int col = 0 ; col <3 ; col ++) {
			B[row][col] = input.nextInt();
			}
		}

		System.out.println("Value of A Matrix");
		for(int row = 0; row<2; row++) {
			System.out.println("\n");
			for(int col = 0 ; col <3 ; col ++) {
				System.out.printf("%d ", A[row][col]);
			}
		}
		System.out.println("\nValue of B Matrix");
		for(int row = 0; row<2; row++) {
			System.out.println("\n");
			for(int col = 0 ; col <3 ; col ++) {
				System.out.printf("%d ", B[row][col]);
			}
		}
		
		//Init MUL ARRAY VALUES
		
		int[][] mul = new int[2][3];
		for( int row = 0; row<2 ; row++) {
			for(int col = 0; col < 3; col++) {
				mul[row][col] = A[row][col]*B[row][col];
				
			}
		}
		//MULPILE OF 2D ARRAY
		
		System.out.println("\nValue of MUL Matrix");
		for(int row = 0; row<2; row++) {
			System.out.println("\n");
			for(int col = 0 ; col <3 ; col ++) {
				System.out.printf("%d ", mul[row][col]);
			}
		}
		
		
	}
}
