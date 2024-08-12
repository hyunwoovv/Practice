package quiz;

public class Student {

	// 값
	// 이름, 나이, 주소, 성별, 전공,

	String name;
	int age;
	String address;
	int gender;
	String major;
	boolean hasGlasses;

	int intel = 0;// 지식
	int stress = 0;// 스트레스 수치
	int hp = 100;// 체력
	int hungry = 0;// 공복감
	// 행동
	// 공부, 식사, 수면, 게임

	// 공부
	// 공부한 내용을 출력하고
	// 지식이 높아지고
	// 스트레스 높아지고
	// 체력이 떨어지고
	// 공복감 높아지고

	// 전달인자 : String 공부한 내용(과목)
	// 리턴타입 : 없음
	int study(String subject) {
		System.out.println(subject + "을(를) 공부했다.");
		intel += 5;
		stress += 10;
		hp--;
		hungry++;

		// intel을 리턴하는 코드를 완성하세요
		return intel;
	}

	int study(String subject, int a) { // 오버로딩
		System.out.println(subject + "을(를) 공부했다.");
		intel += 5;
		stress += a;
		hp--;
		hungry++;

		// intel을 리턴하는 코드를 완성하세요
		return stress;
	}

	// 식사
	// 먹은 음식을 출력하고
	// 체력 올라가고
	// 스트레스 조금 낮아지고
	// 공복감 많이 낮아지고
	// 전달인자 : String 음식
	// 리턴타입 : int 공복감

	int meal(String food) {
		System.out.println(food + "을(를) 먹었다.");
		hp += 3;
		hungry -= 10;
		stress -= 10;
		return hungry;
	}
	// 수면 메소드 완성

	// 전달인자 : 없음
	// 리턴타입 : 없음
	void sleep() {
		System.out.println("잠듦");
		hp += 30;
		stress -= 20;
		hungry += 10;
	}
	// 단, 게임하면서 게임 공부도 했다 치고
	// study메소드 활용

	int game(String play) {
		System.out.println(play + "을(를) 했다");
		hp += 5;
		hungry -= 5;
		study(play, 10);// 게임할때 받을 스트레스 값 지정(지금은 10)
		return stress;
	}

//	double doGame(String title, double hour) {
//		System.out.println(title + "시작!" + hour + "시간만 하자");
//		if (hour <= 0) {
//			System.out.println("다시 입력해주세요.");
//		}
//		for (double i = 0.5; i <= hour; i+=0.5) {
//			System.out.println("한번만 더 하자");
//			stress-=15;
//			
//		}
//		study(title);
//		return hour;
//		// 방어 코딩
//		// hour가 0 이하인 경우 다시 입력해달라고
//		// 시간이 정상인 경우
//		// 시간당 한번씩 "한번만 더 하자" 출력
//		// 난이도 2 : 30분에 한번씩 출력(단 syso두번 쓰지 말고)
//		// 증감식에서 0.5씩 더하기로 풀어보자.
//
//		// 조건문
//		// 2시간 이하 : 오늘 좀 안됐다 그만하자, 스트레스 +5
//		// 4시간 이하 : 간단하게 한게임 했다, 스트레스 -10
//		// 4시간 초과 : 오늘 신났다, 스트레스 -20
//
//	}

	// 공부할 때랑 게임할 때 받는 스트레스가 다르니까
	// 스트레스를 전달할 수 있는 study를 오버로딩한 메소드 만들기

	/* 생성자 */
	// 이름과 나이를 입력받지 않으면 생성 못하게 만들기
	// 나이는 중요하지 않아서 이름 있어도 생성할 수 있게 만들기
	// 단, 두번째 생성자에서는 이름과 나이를 전달받는 생성자 호출하기.

	double doGame(String title, double hour) {
		System.out.println(title + "시작!" + hour + "시간만 하자");
		if (hour <= 2) {
			System.out.println("오늘 좀 안됐다 그만하자");
			stress += 5;
		} else if (hour <= 4) {
			System.out.println("간단하게 한게임 했다.");
			stress -= 10;
		} else {
			System.out.println("오늘 신났다");
			stress -= 20;
		}
		return stress;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + ", major="
				+ major + ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp
				+ ", hungry=" + hungry + "]";
	}
	Student(String inputName, int inputAge){
		name=inputName;
		age=inputAge;
	};
	Student(String inputName){
		this(inputName,50);
	}
	static void view(Student s) {
		int stress = s.game("오버워치");
		System.out.println("이 학생의 스트레스 수치는 : "+ stress);
	}

}
