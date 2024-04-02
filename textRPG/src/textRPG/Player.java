package textRPG;

import java.util.ArrayList;

public abstract class Player extends Unit{
	
	

	public Player(String name, int hp, int power) {
		super(name, hp, power);
	}
	
	abstract public void skill(ArrayList<Unit> mob_List);
	
}
