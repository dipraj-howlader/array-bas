package ArrayList1;

import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("---Array List Out---\n\n");
		// Average of a Array data
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please Enter Array Length");
		int arrayLength = input.nextInt(); 
		int[] num = new int[arrayLength];
		System.out.println("Please Enter array Values:");
		
		for(int i = 0; i < arrayLength ; i++) {
			System.out.printf("Index -%d :", i );		
			num[i] = input.nextInt();
		}
		int sum = 0;
		float avg;
		
		for(int j = 0; j < arrayLength ; j++) {
			System.out.printf("Index-%d = %d\n",j , num[j]);
			sum = sum + num[j];
		}
		System.out.println("Sum of ArrayList is :"+ sum);
		avg = (float) sum / arrayLength;
		System.out.println("Avg is :" + avg);
		
	}
}
