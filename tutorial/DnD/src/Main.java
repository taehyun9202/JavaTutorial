
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human();
		Human b = new Human();
		a.attack(b);
		a.showHealth();
		b.showHealth();
		
		Wizard wizard1 = new Wizard();
		wizard1.fireBall(a);
		wizard1.heal(wizard1);
		wizard1.showHealth();
		
		Samurai s1 = new Samurai();
		s1.howMany();
		Samurai s2 = new Samurai();
		s1.howMany();
		s2.howMany();
	}

}
