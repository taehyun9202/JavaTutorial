
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archer archer1 = new Archer("archer1", "High");
		Archer archer2 = new Archer("archer1", "High");
		
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));
	}

}
