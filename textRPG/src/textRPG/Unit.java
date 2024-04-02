package textRPG;

import java.util.Random;

public abstract class Unit {
	Random random = new Random();
	
	private String name;
	private int maxHp;
	private int hp;
	private int power;
	
	public Unit(String name) {
		this.name = name;
		this.hp = 100 + random.nextInt(100);
		this.maxHp = hp;
		this.power = 10 + random.nextInt(10);
	}
	
	public Unit(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.power = power;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	

	public void attack(Unit target) {
		
	}
	
	abstract public void skill();
	@Override
	public String toString() {
		return String.format("[%s] [%d/%d] [%d]", name,hp,maxHp,power);
	}
	
}
