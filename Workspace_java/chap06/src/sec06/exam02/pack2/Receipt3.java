package sec06.exam02.pack2;

public class Receipt3 {

	
	//생성자 없을 때 pack1 에서 new 가능했음
//	Receipt3(){
		//default 접근 제한자라고 읽는
		//아무런 접근 제한자를 거지 않은 경우
		//다른 패키지에서는 접근이 불가능 함.
		//not visible 이라는 오류 발생
//	};
	
	public Receipt3() {
		//public 접근 제한자는 다른 패키지에서 접근 가능.
	}
	
	void test() {
		donation();
	}
	
	// private 접근 제한자는
	// 내 클래스 외에는 못쓰게 막아준다.
	private void donation() {
		
	}
}
