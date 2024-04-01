package textRPG;

public class GameManager {
	private String lastStage;
	private String curStage;
	
	public GameManager() {
		lastStage = "TITLE";
		curStage = "LOBBY";
	}
	

	public void run() {
		while (true) {
			printMenu();
		}
		
	}

	private void printMenu() {
		System.out.println("lastStage : " + lastStage);
		System.out.println("curStage : " + curStage);
		System.out.println("======[" + curStage + "]======");
		System.out.println("[1.전투] [2.종료]");
	}

}
