package textRPG;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class BattleManager {
	
	
	private ArrayList<Player> players;
	private ArrayList<Unit> mob_List;
	
	private UnitManager unitManager;
	
	public BattleManager() {
		players = new ArrayList<Player>();
		mob_List = new ArrayList<Unit>();
		
		unitManager = new UnitManager();
		unitManager.createPlayers(players);
		
	
	}


	public void battle() {
		mobSetting();
//		runBattle();
	}


	private void mobSetting() {
		try {
			unitManager.createMobs(mob_List,4);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	






}
