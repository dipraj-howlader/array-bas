package TwoDimeArray;

import java.util.Scanner;

public class SerialArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Array row number:");
		int row= input.nextInt();
		System.out.println("Please enter Array Col number:");
		int col = input.nextInt();
		int[][] series = new int[row][col];
		int z = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				z++;
				series[i][j] = z;
			}
		}
		for (int i = 0; i < row; i++) {
			System.out.println("\n");
			for (int j = 0; j < col; j++) {
				System.out.printf("%d ",series[i][j]);
			}
		}
	}
}
