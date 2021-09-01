package TwoDimeArray;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] number = {10,-8,45,100,-69,0,58,-785};
		Arrays.sort(number);
		System.out.println("Assending: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		int len = number.length;
		System.out.println("\n");
		System.out.println("Decending :");
		for (int i = 0; i < number.length; i++) {
			
			System.out.print(number[len-1]+" ");
			len--;
		}
	}
}
