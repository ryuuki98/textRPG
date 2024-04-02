package textRPG;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit {
	Random random = new Random();
	
	private String name;
	private int maxHp;
	private int hp;
	private int power;
	private boolean isDead;
	
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
	public void setHp(int hp) {
		this.hp = hp;
		if (this.hp <=0) {
			this.hp = 0;
			isDead = true;
		}
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public boolean isDead() {
		return isDead;
	}

	public void attack(Unit unit) {
		unit.setHp(unit.getHp() - this.power);
		System.out.printf("%s는 %s에게 %d 데미지를 입혔다. \n",this.name ,unit.name,this.power );
	}
	
	@Override
	public String toString() {
		return String.format("[%s] [%d/%d] [%d]", name,hp,maxHp,power);
	}
	
}
