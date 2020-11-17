import java.util.Scanner;

public class Main {
//	public static int max(int a, int b) {
//		return (a > b) ? a : b;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter size of Array:");
//		int number = scanner.nextInt();
//		int[] array = new int[number];
//		for(int i = 0; i < number; i++) {
//			System.out.print("Enter number for " + i + ":");
//			array[i] = scanner.nextInt();
//		}
//		int result = -1;
//		for(int i = 0; i < number; i++) {
//			result = max(result, array[i]);
//		}
//		System.out.println("Max is " + result);
		
//		int[] array = new int[100];
//		int sum = 0;
//		for(int i = 0; i < 100; i++) {
//			array[i] = (int) (Math.random() * 100 + 1);	
//			sum += array[i];
//		}
//		System.out.println(sum / 100);
		
		int N = 50;
		int[][] array = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				array[i][j] = (int)(Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
