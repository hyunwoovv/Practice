package quiz;

public class Martin extends Car {

	Martin(){
		this.brand="마틴";
	}
	@Override
	public void drive() {
		System.out.println("마틴 부릉부릉");
	}
	@Override
	int accel(int press) {
		System.out.println(press + "만큼 마틴이 빨라집니다.");
		return press*4;
	}
	
	@Override
	int breaking(int press) {
		System.out.println(press + "만큼 마틴이 느려집니다.");
		return press*5;
	}
	
	void shoot() {
		System.out.println("탕탕 총");
	}
}
