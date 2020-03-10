package cs321_Project2;

import java.util.ArrayList;

public class tournament {
	
	ArrayList<subTournament> subTournaments = new ArrayList<subTournament>();
	String in;
	
	ArrayList<Fighter> winners = new ArrayList<Fighter>();
	
	int fIn;
	
	private void InitializaTournament(int numFighters, String input) {
		in = input;
		fIn = numFighters;
		if (in == "WILD" || in == "wild" || in == "Wild") {
			for (int i = 0; i < fIn; i = i + 2){
				//subTournaments.fighter(e)
			}
		}
		else if (in == "LONG" || in == "long" || in == "Long") {
			for (int i = 0; i < fIn; i = i + 2){
				
			}
		}
		else if (in == "SHORT" || in == "short" || in == "Short") {
			for (int i = 0; i < fIn; i = i + 2) {
				
			}
		}
		else if (subTournaments.numMatches <= 2){
			for (int i = 0; i < fIn; i = i + 2) {
				
			}
		}
	}
	
	private void DetermineWinner(ArrayList<subTournament> subTournaments) {
		for (int i = 0; i < fIn; i++) { 
			subTournament.DetermineWinner(subTournaments.get(i));
		}
	}
}

class subTournament extends tournament{
	
	public TournamentArchetype archetype;
	ArrayList<Match> matches = new ArrayList<Match>();
	int numMatches;
	
	fighter f1, f2;
	
	// ArrayList<Fighter> winners = new ArrayList<Fighter>();
	
	private void DetermineWinner(f1, f2) {
		if (f1.points == 10) {
			System.out.println("The winner is " + f1.name + "!");
			winners.add(f1);
		}
		else {
			System.out.println("The winner is " + f2.name + "!");
			winners.add(f2);
		}
	}
}
