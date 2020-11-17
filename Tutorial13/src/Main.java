import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student("Tyler", 29, 175, 62, "905552657", 1, 4.5);
//		
//		Teacher teacher = new Teacher("Lena", 25, 160, 48, "754321547", "Health", 4);
//		
//		student.show();
//		teacher.show();
//		
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			students[i] = new Student("Tyler", 29, 175, 62, i + "905552657", 1, 4.5);
//			students[i].show();
//		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Total Students :");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("Name: ");
			name = scan.next();
			System.out.print("Age: ");
			age = scan.nextInt();
			System.out.print("Height: ");
			height = scan.nextInt();
			System.out.print("Weight: ");
			weight = scan.nextInt();
			System.out.print("ID: ");
			studentID = scan.next();
			System.out.print("Grade: ");
			grade = scan.nextInt();
			System.out.print("GPA: ");
			gPA = scan.nextDouble();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
			students[i].show();
		}
	}

}
