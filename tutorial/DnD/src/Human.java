
public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public void attack(Human target) {
		System.out.println("Attacked " + target + "decreased target's health by" + strength);
		target.health -= this.strength;
	}
	
	public void showHealth() {
		System.out.println("Current Health: " + health);
	}
//	public void showStats() {
//		System.out.println("---------------------------");
//		System.out.println("Current strength: " + strength);
//		System.out.println("Current stealth: " + stealth);
//		System.out.println("Current intelligence: " + intelligence);
//		System.out.println("---------------------------");
//	}
}
