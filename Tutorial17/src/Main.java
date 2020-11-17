import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fruit fruit = new Peach();
//		fruit.show();
//		Fruit fruit2 = new Banana();
//		fruit2.show();
		
		Scanner scanner = new Scanner(System.in);
		Fruit fruit;
		System.out.print("Banana : 1, Peach : 2");
		int input = scanner.nextInt();
		if(input == 1) {
			fruit = new Banana();
			fruit.show(); 
		} else if (input == 2) {
			fruit = new Peach();
			fruit.show();
		}
	}
		
}
