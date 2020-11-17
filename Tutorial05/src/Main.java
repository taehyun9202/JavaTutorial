
public class Main {
	final static int N = 15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "I Love You.";
//		if(a.contains("Love")) {
//			System.out.println("Me Too.");
//		} else {
//			System.out.println("I Hate You.");
//		}
		
//		String a = "Man";
//		int b = 0;
//		
//		// java use equal() to compare string
//		if(a.equals("Man")) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		
//		if(b == 3) {
//			System.out.println(false);
//		} else {
//			System.out.println("Not sure");
//		}
//		
//		if(a.equalsIgnoreCase("man")) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		
//		int i = 1, sum = 0;
//		while(i <= 1000) {
//			sum += i++;
//		}
//		System.out.println(sum);
		
//		for(int i = N; i > 0; i--) {
//			for(int j = i; j > 0; j--) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		
//		for(int i = -N; i <= N; i++) {
//			for(int j = -N; j <= N; j++) {
//				if(i * i + j * j <= N * N) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//				System.out.println();
//			}
//		}
		
		int count = 0;
//		infinite for loop
		for(;;) {
			System.out.println(count+1 + ".print");
			count ++;
			if(count == 10) {
				break;
			}
		}
	
	}

}
