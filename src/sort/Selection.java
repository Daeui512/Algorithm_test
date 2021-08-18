package sort;
import java.util.Scanner;

public class Selection {
	
	private static int[] input = new int[10];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		// 선택 정렬
		//selectionSortMin(input, input.length);
		
		
		selectionSortMax(input, input.length);
		for (int a : input) {
			System.out.println(a + ", ");
		}
		
		
	}// end of main
	
	private static void selectionSortMin(int[] input, int length) {
		int min;
		int tmp;
		
		for (int i = 0; i < length-1; i++) {
			min = i;
			
			for (int j = i+1; j < length; j++) {
				if (input[j] < input[min]) {
					min = j;
				}
			}
			
			tmp = input[i];
			input[i] = input[min];
			input[min] = tmp;
		}
	}// end of selectionSortMin
	
	private static void selectionSortMax(int[] input, int length) {
		int max;
		int tmp;
		
		for (int i = length-1; i > 0; i--) {
			max = i;
			
			for (int j = i-1; j > 0; j--) {
				if (input[j] > input[max]) {
					max = j;
				}
			}
			
			tmp = input[i];
			input[i] = input[max];
			input[max] = tmp;
		}
	}
	
	
	
}// end of class
