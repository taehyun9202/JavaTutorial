
public class Samurai extends Human{
	public static int counter = 0;
	public Samurai() {
		this.health = 200;
        counter++;
    }
	public void deathBlow(Human target) {
		System.out.println("instant kill! health decreased by half");
		target.health = 0;
		System.out.println("target health: " + target.health);
		showHealth();
	}
	
	public void meditate() {
		System.out.println("Meditation");
		health += health / 2;
		showHealth();
	}
	

	public void howMany() {
		System.out.println("Other samurai: " + counter);
	}
}
