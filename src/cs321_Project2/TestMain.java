package cs321_Project2;

public class TestMain {
	public static void main(String[] args) {
		/**
		//create a new weapon
		System.out.println("Creating weapon...");
		Weapon test = new Weapon();
		test.archetype = WeaponArchetype.MEDIUM;
		test.attackRating = 5;
		test.defenseRating = 3;
		System.out.println("Weapon created!");
		System.out.println(test.archetype.toString());
		
		//test thing
		TournamentArchetype test2 = TournamentArchetype.SHORT;
		WeaponArchetype test3 = test2.getWeaponArchetype(test2);
		System.out.println(test3);
		**/
		
		//test weapon factory and creation
		
		//create some test stuff
		WeaponFactory test4;
		Weapon test5;
		
		//test each one
		for (TournamentArchetype t : TournamentArchetype.values()) {
			//loop over so we can tell if it works
			for (int i = 0; i < 5; i++) {
				test4 = new WeaponFactory(t); //create a new factory using type
				test5 = test4.MakeWeapon(); //make a new weapon
				
				//print out data
				System.out.println("Name: " + test5.name);
				System.out.println("Attack: " + test5.attackRating);
				System.out.println("Defense: " + test5.defenseRating);
				System.out.println("Archetype: " + test5.archetype);
				System.out.println("");
			}
		}
	}
}