package textRPG;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class BattleManager {
	private final int ATTACK_MOB = 1;
	private final int SKILL = 2;

	private Random random = new Random();
	
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
		while (playerAllDead() && mobsAllDead()) {
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
			Player player = players.get(i);
			if (player.isDead() || !mobsAllDead()) {
				continue;
			}

			int targetIndex = searchTargetIndex();
			printPlayerMenu(player);
			int select = GameManager.inputNumber("select");
			if (select == ATTACK_MOB) {
				player.attack(mob_List.get(targetIndex));
			}else if (select == SKILL) {
				player.skill();
			}
		
			printUnitState();
		}
	}


	private int searchTargetIndex() {
		int index = -1;
		while (true) {
			int ranIdx = random.nextInt(mob_List.size());
			if (!mob_List.get(ranIdx).isDead()) {
				index = ranIdx;
				break;
			}
		}
		return index;
	}


	private void runPlayerAttack(int select) {
		
	}


	private void printPlayerMenu(Player player) {
		System.out.println("======[MENU]======");
		System.out.printf("[%s] [1.공격] [2.스킬]\n",player.getName());
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
			if (!mob_List.get(i).isDead()) {
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
