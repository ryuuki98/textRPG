package textRPG;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

public class UnitManager {
	private String[] mobs = {"UnitBat","UnitOrc","UnitWolf"};
	private String path = "textRPG.";

	public void createPlayers(ArrayList<Player> players) {
		players.add(new PlayerWarrior("전사", 1000, 45));
		players.add(new PlayerMagician("마법사", 800, 60));
		players.add(new PlayerHealer("힐러", 500, 70));
	}

	public void createMobs(ArrayList<Unit> mob_List,int mobCount) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Random random = new Random();
		for (int i = 0; i < mobCount; i++) {
			int ranNum = random.nextInt(mobs.length);
			try {
				Class<?> clazz = Class.forName(path + mobs[ranNum]);
				Object mob = clazz.getDeclaredConstructor().newInstance();
				Unit temp = (Unit) mob;
				mob_List.add(temp);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
