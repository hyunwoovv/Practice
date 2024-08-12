package quiz;

public class Charactor {

	private String name; //캐릭터 이름
	private int hp;		// 체력
	private int def;
	
	
	Charactor(String name){
		this.name = name;
		this.hp=100;
		this.def=(int)(Math.random()*5)+3;//3~7
	}
	/*
	 *  체력 100에서 시작
	 *  방어력 : 특정 범위 안에서 random
	 *  메소드
	 *  attack(%또는 수치)
	 *  heal(%또는 수치)
	 */
	/**
	 * attack : 내가 공격할 수치를 돌려줌
	 * @param 없음
	 * @return boolean 살아 있는지 여부
	 */
	int attack() {
		int damege =10+(int)(Math.random()*5);//10~14
		System.out.println(this.name+"이(가) " + damege + "만큼 공격합니다 " );
	return damege;
	}
	
	/**
	 * hit : 내가 맞아서 체력이 줄어듦
	 * @param int 공격당한 수치
	 * @return 없음
	 * 
	 */
	boolean hit (int damege) {
		System.out.println(this.name+"이(가) "+(damege -def)+"만큼 공격을 받았습니다.");
		boolean isAlive = true;
		hp -=hp- (damege -def); //공격받은 수치에서 방어력을 제외한 만큼hp에서 뺌
		if(hp<=0) {
			System.out.println(this.name +"이(가) 죽었습니다.");
			isAlive = false;
		}
		return isAlive;
	}
	/**
	 * heal : hp를 일정량 회복
	 * @param 없음
	 * @return int hp
	 */
	int heal() {
		int heal = 5 + (int)(Math.random()*5);//5~9
		this.hp=+heal;
		System.out.println(this.name+"이(가) "+ heal+"만큼 회복했습니다.");
		return this.hp;
	}
	int getHp() {
		return this.hp;
	}
	
}
