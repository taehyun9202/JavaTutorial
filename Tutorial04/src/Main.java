
public class Main {
//	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int minute = SECOND / 60;
//		int second = SECOND % 60;
//		
//		System.out.println(minute + " minute " + second + " seconds");
		
//		int a = 10;
//		System.out.println("current a:" + a);
//		a++;
//		System.out.println("current a:" + a);
//		System.out.println("current a:" + ++a);
//		System.out.println("current a:" + a++);
//		System.out.println("current a:" + a);
		
//		int a = 50;
//		int b = 50;
//		
//		System.out.println(a == b);
//		System.out.println(!(a == b));
//		System.out.println(a > b);
//		System.out.println((a == b) && (a > b));
		
		int i = 20;
		i = i + 1;  
		i++;
		i += 1;
		System.out.println(i);
		
		
		int x = 50;
		int y = 60;
		System.out.println(max(x, y));
		
		double a = Math.pow(3.0, 20.0);
		System.out.println((int) a);
		
		
	}
	
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
	
	

}
