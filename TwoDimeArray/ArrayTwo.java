package TwoDimeArray;

import java.util.Scanner;

public class ArrayTwo {
	public static void main(String[] args) {
//		0
//		12
//		345
//		78910
		
		System.out.println("Welcome to Java :");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter rows value:");
		int row = input.nextInt();
		int[][] num = new int[row][row];
		
		int  m = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				num[i][j] = m;
				m++;
				
			}
			
		}
		
		for (int i = 0; i < row; i++) {
				for (int j = 0; j < i+1; j++) {
					System.out.printf("%d ",num[i][j]);
				}
				System.out.println("\n");
			
		}
			
		
	}
}

