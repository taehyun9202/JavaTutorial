
public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		System.out.println("Healed" + target +" health by " + intelligence);
		target.health += intelligence;
		System.out.println("target health: " + target.health);
	}
	
	public void fireBall(Human target) {
		System.out.println("Damaged " + intelligence * 3 + " to " + target);
		target.health -= intelligence * 3;
		System.out.println("target health: " + target.health);
	}
	
}
