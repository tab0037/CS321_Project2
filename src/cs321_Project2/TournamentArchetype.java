package cs321_Project2;

public enum TournamentArchetype {
	LONG, MEDIUM, SHORT, WILD;
	
	public WeaponArchetype getWeaponArchetype(TournamentArchetype tournamentArchetype) {
		WeaponArchetype returnValue;
		switch(tournamentArchetype) {
		case LONG:
			returnValue =  WeaponArchetype.LONG;
			break;
		case MEDIUM:
			returnValue =  WeaponArchetype.MEDIUM;
			break;
		case SHORT:
			returnValue =  WeaponArchetype.SHORT;
			break;
		default: //assumes wild card scenario
			returnValue =  null;
		}
		return returnValue;
	}
};