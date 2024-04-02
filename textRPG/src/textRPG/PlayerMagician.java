package textRPG;

import java.util.ArrayList;

public class PlayerMagician extends Player{
	

	public PlayerMagician(String name, int hp, int power) {
		super(name, hp, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skill(ArrayList<Unit> mob_List) {
		for (int i = 0; i < mob_List.size(); i++) {
			Unit target = mob_List.get(i);
			target.setPower(target.getPower()-1);
		}
		System.out.println("[스킬] 허약의 효과로 인해 몬스터들의 power가 1씩 감소합니다.");
	}


}
