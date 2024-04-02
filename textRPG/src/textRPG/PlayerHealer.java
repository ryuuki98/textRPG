package textRPG;

import java.util.ArrayList;

public class PlayerHealer extends Player{

	public PlayerHealer(String name, int hp, int power) {
		super(name, hp, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skill(ArrayList<Unit> mob_List) {
		System.out.println("[스킬] 자신의 체력을 20 회복합니다.");
		this.setHp(getHp() + 20);
	}

}
