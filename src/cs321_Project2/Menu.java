package cs321_Project2;

import java.util.Scanner;

public class Menu {
	private int entrants;
	private Scanner s = new Scanner(System.in);
	
	public Menu() {
		System.out.println("Welcome to the Tournament of Champions!");
		entrants = EnterFighterCount();
		System.out.println("Excellent! Onward to the tournament!");
		RunTournament();
	}
	
	public void RunTournament() {
		Tournament tournament = new Tournament(entrants);
		tournament.InitializeTournament();
	}
	
	private int EnterFighterCount() {
		System.out.print("Please enter the total number of fighters: ");
		int i = s.nextInt();
		
		//dirty but who cares
		if (i != 4 && i != 8 && i != 16 && i != 32 && i != 64 && i != 128 && i != 256 && i != 512) {
			System.out.println("Sorry! The number of fighters must be a power of two! Try again!");
			return EnterFighterCount();
		}
		else return i;
	}
}