
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("Gorilla threw something. -5 energy");
		energyLevel -= 5;
		displayEnergy();
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate Bananas. +10 energy");
		energyLevel += 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla climed a tree. -10 energy");
		energyLevel -= 10;
		displayEnergy();
	}
}
