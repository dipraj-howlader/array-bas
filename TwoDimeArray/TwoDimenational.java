package TwoDimeArray;

public class TwoDimenational {
	public static void main(String[] args) {
		System.out.println("----Two Dimenational Array---");
		// first row and then colume
		int[][] numbers = new int[2][3];
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[1][0] = 40;
		numbers[1][1] = 50;
		numbers[1][2] = 60;
		
		for(int row = 0; row < 2; row++) {
			System.out.println("\n");
			for(int col = 0 ; col < 3; col++) {
				System.out.printf("%d ", numbers[row][col]);
			}
		}
	}
}
