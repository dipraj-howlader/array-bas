package ArrayList1;

import java.util.Scanner;

public class FindMaxiAndMini {
	public static void main(String[] args) {
		System.out.println("--Finding Maximun and Minimum value--\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Array Length");
		int arrayLength = input.nextInt(); 
		int[] num = new int[arrayLength];
		System.out.println("Please Enter array Values:");
		
		for(int i = 0; i < arrayLength ; i++) {
			System.out.printf("Index -%d :", i );		
			num[i] = input.nextInt();
		}
		int Max = num[0];
		int min = num[0];
		for(int y = 1 ; y < arrayLength ; y++) {
		
			if(Max < num[y]) {
				Max = num[y];
			}
			if(min > num[y]) {
				min = num[y];
			}
	
		}
		System.out.println("Maximum  value:" + Max);
		System.out.println("Minimun  value:" + min);
	}
}
