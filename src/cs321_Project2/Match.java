
public class Match {
	Fighter fighter1;

	Fighter fighter2;
	Jester jester = new Jester();
	
	void SignalMiddleToJester(Fighter F)
	{
		jester.CommendOnMiddle(F);
	}
	
	Fighter PlayMatch(Fighter F1, Fighter F2)
	{
		fighter1 = F1;
		int f1hp = 10;
		fighter2 = F2;
		int f2hp = 10;
		
	}
	
}
