package sec04.exam04;

public class Fan {
	// 선풍기 fan
	// 전원 상태를 저장
	// 전원 켜기 기능
	// 전원 끄기 기능
	// --각각 전원상태 값을 변경
	// 약풍 기능
	// 강풍 기능
	// 전원이 켜진 상태에서만 바람 나옴
	boolean turn = false;
	int wind;

	void powerOff() {
		System.out.println("전원을 끕니다.");
		turn = false;
		return;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
		turn = true;
		if (turn == false) {
			System.out.println("전원을 켜주세요.");
		}

	}

	void 약풍() {
		wind = 1;
		System.out.println("약풍 켬");
	}
	void 강풍() {
		wind = 2;
		System.out.println("강풍 켬");
	}

	void check() {
		System.out.println("선풍기상태를 체크합니다.");
		if (turn == true && wind == 1) {
			System.out.println("약풍입니다");
		} else if (turn == true && wind == 2) {
			System.out.println("강풍입니다");
		} else {
			System.out.println("꺼져있음");
		}
	}

}




