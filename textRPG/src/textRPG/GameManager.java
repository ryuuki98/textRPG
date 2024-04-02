package textRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
	
	private  final int BATTLE = 1;
	private final int END_GAME = 2;
	
	private String lastStage;
	private String curStage;
	
	private BattleManager battleManager;
	
	
	private boolean isRun;
	
	public GameManager() {
		isRun = true;
		
		lastStage = "TITLE";
		curStage = "LOBBY";
		
		battleManager = new BattleManager();
		
	}
	

	public void run() {
		while (isRun) {
			printMenu();
			int select = inputNumber("menu");
			runMenu(select); 
		}
		
	}

	private void runMenu(int select) {
		if (select == BATTLE) {
			battleManager.battle();
		}else if (select == END_GAME) {
			endGame();
		}
	}

	private void endGame() {
		System.out.println("게임 종료");
		isRun = false;
	}


	private int inputNumber(String message) {
		int number = 0;
		System.out.println(message + " : ");
		try {
			String numberString = new Scanner(System.in).next();
			number = Integer.parseInt(numberString);
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
			return inputNumber(message);
		}
		return number;
	}

	private void printMenu() {
		System.out.println("lastStage : " + lastStage);
		System.out.println("curStage : " + curStage);
		System.out.println("======[" + curStage + "]======");
		System.out.println("[1.전투] [2.종료]");
	}

}
