package sec04.exam03;

public class Car {

	int gas = 5;
	
	//필드== 맴버변수
	//클래스 생성(new하는 순간에)과 함께 생성되고
	//클래스 소멸 시 까지 생존
	//메모리를 차지함
	//계속 저장된다.
	//메소드에서 변경하는 경우
	//다음 번 실행까지 저장해둠.
	//그래서 계속 초기화 해야하는 상황이 있을 수 있다.
	//클래스 안의 모든 곳에서 사용 가능하다.
	
	//gas의 값이 0이면 false;
	// 그렇지 않으면 true
	boolean isLeftGas() {
		if (gas==0) {
			System.out.println("gas가 없습니다");
			return false;
		}else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}
	//주행
	//gas가 없을 때까지 달리기
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("주행중...잔량 : "+gas);
				gas--;
			}else {
				System.out.println("주행 종료...잔량 : "+gas);
				//리턴 타입이 void이므로
				//아무 값도 돌려주면 안된다
				//return을 만나면 그 즉시
				//메소드 종료
				return;
			}
		}
	}
	
	boolean isLeftGas3() {
		return gas!=0;
	}
	String name;
	
	//name의 값을 변경
	//name의 길이가 0인 경우 변경하지 않음
	// 전달인자 : String
	//리턴타입 : 없음
	void setName(String nick) {
		System.out.println(nick.length());
		if(nick.length()!=0) {
		name= nick;
		}else {
			System.out.println("이름은 필수입니다.");
		}
		
	}
}
