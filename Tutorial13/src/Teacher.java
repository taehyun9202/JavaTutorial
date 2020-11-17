
public class Teacher extends Person{
	private String teacherID;
	private String subject;
	private int year;
	
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Teacher(String name, int age, int height, int weight, String teacherID, String subject, int year) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.subject = subject;
		this.year = year;
	}
	
	public void show() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Height: " + getHeight());
		System.out.println("Weight: " + getWeight());
		System.out.println("ID: " + getTeacherID());
		System.out.println("Subject: " + getSubject());
		System.out.println("Year : " + getYear());
	}
	
}
