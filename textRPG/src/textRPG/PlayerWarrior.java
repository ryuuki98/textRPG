package textRPG;

import java.util.ArrayList;

public class PlayerWarrior extends Player{

	public PlayerWarrior(String name, int hp, int power) {
		super(name, hp, power);
	}

	@Override
	public void skill(ArrayList<Unit> mob_List) {
		for (int i = 0; i < mob_List.size(); i++) {
			this.attack(mob_List.get(i));
		} 
		System.out.println("[스킬]전체 베기로 모든 몬스터에게 " + this.getPower() + "만큼 피해를 주었습니다.");
	}


}
