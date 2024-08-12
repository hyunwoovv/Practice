package sec01.exam03;

public class Car {

	int speed;
	double 연비;

	Car() {
		this.speed = 190;
		this.연비 = 13.5;
		System.out.println("조부모실행");
	}

	// 다음의 클래스를 상속받은 클래스 2개 이상 만드시오
	// 단 drive()메소드는 필수.
	void drive() {
		System.out.println("운전을 시작합니다");
	}

	void drivespeed(int go) {
		
		this.speed = go;

	}
}
