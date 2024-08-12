package quiz;

public class Car {
String brand = null;
int speed;

	void drive() {
		System.out.println("운전 시작");
	}
	
	int accel(int press) {
		System.out.println(press + "만큼 밟습니다.");
		return press*2;
	}
	int breaking(int press) {
		System.out.println(press + "만큼 브레이크를 밟습니다.");
		return press*3;
	}
	
	
}
