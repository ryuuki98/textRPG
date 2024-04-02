# Console battle


>소개

자바 리플렉션을 이용하여 만든 유닛들을 가지고 전투하는 게임

## 유닛 소개

> player

플레이어는 총 3개의 캐릭터 파티로 구성되어 있다. 
각 캐릭터는 서로 다른 스텟(체력,공격력)과 스킬을 가지고 있다.
 - warrior <br>
   HP - 1000 <br>
   POWER - 45 <br>
   SKILL - 전체공격 (45데미지로 모든 적에게 공격) <br>
   <br>
 - magician <br>
   HP - 800 <br>
   POWER - 60 <br>
   SKILL - 허약 (모든 적의 POWER를 1 감소시킴) <br>
   <br>
 
 - healer <br>
   HP - 500 <br>
   POWER - 70 <br>
   SKILL - 자가치유 (자신의 체력을 20 회복) <br>
   <br>

> mobs

적은 총 4마리가 한 파티로 구성되어 있으며 3가지의 몬스터중에서 무작위로 스폰된다. <br>
적 몬스터 종류에 따른 각각의 특성은 후에 추가할 예정이다.<br>


 - mob <br>
   HP - 100 + (0 ~ 99) <br>
   POWER - 10 + (0 ~ 9) <br>
   <br>

>demo
<img src = "" width = 300>
