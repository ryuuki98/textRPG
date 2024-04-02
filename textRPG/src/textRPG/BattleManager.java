package textRPG;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
		runBattle();
	}


	private void runBattle() {
		while (playerAllDead() || mobsAllDead()) {
			System.out.println("======[battle]======");
			printUnitState();
			attack();
			
		}
	}


	private void attack() {
		playerAttack();
		monsterAttack();
	}


	private void monsterAttack() {
		// TODO Auto-generated method stub
		
	}


	private void playerAttack() {
		for (int i = 0; i < players.size(); i++) {
			printPlayerMenu(i);
			int select = GameManager.inputNumber("select");
			printUnitState();
		}
	}


	private void printPlayerMenu(int i) {
		System.out.println("======[MENU]======");
		System.out.printf("[%s] [1.공격] [2.스킬]\n",players.get(i).getName());
	}


	private void printUnitState() {
		printPlayers();
		printMobs();
	}


	private void printMobs() {
		System.out.println("======[MONSTER]======");
		for (int i = 0; i < mob_List.size(); i++) {
			System.out.println(mob_List.get(i));
		}
	}


	private void printPlayers() {
		System.out.println("======[player]======");
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}
	}


	private boolean playerAllDead() {
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getHp()>0) {
				return true;
			}
		}
			return false;
	}


	private boolean mobsAllDead() {
		for (int i = 0; i < mob_List.size(); i++) {
			if (mob_List.get(i).getHp()>0) {
				return true;
			}
		}
		
		mob_List.clear();
	    return false;
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
