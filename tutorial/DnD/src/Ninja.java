
public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Human target) {
		System.out.println("Stole" + target +" health by " + stealth);
		target.health += stealth;
		health += stealth;
		System.out.println("target health: " + target.health);
		showHealth();
	}
	
	public void runAway() {
		System.out.println("ran away. -5 health");
		health -= 10;
		showHealth();
	}
}
