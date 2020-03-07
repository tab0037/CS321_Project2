package cs321_Project2;

public class Main {
	public static void main(String[] args) {
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
		WeaponArchetype test3 = TournamentArchetype.getWeaponArchetype(test2);
		System.out.println(test3);
	}
}