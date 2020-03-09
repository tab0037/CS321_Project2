
public class Match {
	Fighter fighter1;
	Fighter fighter2;
	Jester jester = new Jester();
	
	void SignalMiddleToJester(Fighter F)
	{
		jester.CommentOnMiddle(F);
	}
	
	Fighter PlayMatch(Fighter F1, Fighter F2)
	{
		fighter1 = F1;
		int f1hp = 0;
		boolean j1 = false;
		int att1 = 0;
		int def1 = 0;
		fighter2 = F2;
		int f2hp = 0;
		boolean j2 = false;
		int att2 = 0;
		int def2 = 0;
		
		//If tournament Archetype is wild
		/*
		if (FasterThan(fighter1, fighter2) == true)
		def1 += 1;
		att1 += 1;
		else if (FasterThan(fighter2, fighter1) == true)
		def2 += 1;
		att2 += 1;
		*/
		if (LongerReachedThan(fighter1, fighter2) == true)
			def1 += 1;
		else if (LongerReachedThan(fighter2, fighter1) == true)
			def2 += 1;
		if (StrongerThan(fighter1, fighter2) == true)
			att1 += 1;
		else if (StrongerThan(fighter2, fighter1) == true)
			att2 += 1;
		
		jester.CommentOnStart(fighter1, fighter2);
		
		while(f1hp < 10 || f2hp < 10)
		{
			f1hp += GetAttackPerformance(fighter2) + at2 - GetDefensePerformance(fighter1) - def1;
			f2hp += GetAttackPerformance(fighter1) + at1 - GetDefensePerformance(fighter2) - def2;

			
			if (f1hp > 4 && j1 == false)
				SignalMiddleToJester(fighter1);
			
			if (f1hp > 4 && j1 == false)
				SignalMiddleToJester(fighter1);
		}
		if (f1hp > 10 && f2hp > 10)
			{
				System.out.println("Well, that's something you don't see everyday. It appears our two contestants have tied, so we're gonna have to redo the fight! Get ready everyone, next round is starting in 3... 2... 1...")
				PlayMatch(fighter1, fighter2);
			}
		else if (f1hp > 10)
			jester.CommentOnEnd(fighter2);
		else if (f2hp > 10)
			jester.CommentOnEnd(fighter1);
		
		
	}
	
}
