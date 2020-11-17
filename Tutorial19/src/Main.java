
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero[] heroes = new Hero[3];
		heroes[0] = new Warrior("Aragorn");
		heroes[1] = new Archer("Regolas");
		heroes[2] = new Wizard("Gandalf");
		
		for(int i = 0; i < heroes.length; i++) {
			heroes[i].attack();
			
			if(heroes[i] instanceof Warrior) {
				Warrior temp = (Warrior) heroes[i];
				temp.slice();
			} else if(heroes[i] instanceof Archer) {
				Archer temp = (Archer) heroes[i];
				temp.fireArrow();
			} else if(heroes[i] instanceof Wizard) {
				Wizard temp = (Wizard) heroes[i];
				temp.freeze();
			} 
		}
	}
	
}
