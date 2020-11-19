
public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}

	public void fly() {
		System.out.println("Bat took off. -50 energy");
		energyLevel -= 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Bat ate Humman. +25 energy");
		energyLevel += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Bat attacked a town. -100 energy");
		energyLevel -= 100;
		displayEnergy();
	}
	
}
