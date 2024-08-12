package sec01.exam03;

public class CarChild extends 차량정보 {

	String gas;
	int speed;
	CarChild(String gass){
		this.gas=gass;
	}
	@Override
	void drivespeed(int go) {
		if (gas.equals("하이브리드")) {
			this.speed = go * 2;
			
		} else if (gas.equals("터보")) {
			this.speed = go * 3;

		} else {
			super.drivespeed(go);

		}
		System.out.println(this.speed+"로 주행을 시작합니다.");
	}

	void drive() {
		super.drive();
		System.out.println();
	}

}
