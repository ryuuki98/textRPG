package textRPG;

public abstract class Unit {
	private String name;
	private int maxHp;
	private int hp;
	private int power;
	
	public Unit(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}
}
