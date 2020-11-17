
public class Main {

//	public static int factorial(int number) {
//		int sum = 1;
//		for(int i = 2; i <= number; i++) {
//			sum *= i;
//		}
//		return sum;
//	}
	
	public static int recFactorial(int number) {
		if(number == 1) {
			return 1;
		} else {
			return number * recFactorial(number -1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(factorial(10));
		System.out.println(recFactorial(10));
	}

}
