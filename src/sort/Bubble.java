package sort;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		long beforeTime = System.currentTimeMillis();
		
		bubbleSort(input);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
		long afterTime = System.currentTimeMillis();
		long time = (afterTime-beforeTime);
		System.out.println("실행시간 : " + time);
		
		
		
		
	}// end of main
	
	private static void bubbleSort(int[] input) {
		
		int tmp;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length -i -1; j++) {
				if (input[j] > input[j+1]) {
					tmp = input[j];
					input[j] = input[j+1];
					input[j+1] = tmp;
				}
			}
		}
		
		
	}
	
	
	
}//end of class
