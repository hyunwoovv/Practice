package sec05.exam02_static;

public class Calc {

//	static double pi = 3.141592;
	static double pi;
	String color;
	
	//지역변수 : 해당 블럭에서만 사용 가능, 블럭이 끝나면 사라짐
	//필드변수 : new가 된 순간(인스턴스)부터 사용 가능, 클래스 소멸시 사라짐.
	//static 변수 == 클래스변수 == 공용변수
	//			java 실행 시 사용 가능
	//			java 종료 시 사라짐
	
	Calc(){
		System.out.println(pi);
	}
	
	//static 안에서는
	//static만 쓸 수 있다.
	//this 사용 불가능.
	static int test() {
		System.out.println(pi);
		//this. color="흰색";
		//color="흰색"
		return 1;
	}
	
	//static이 아닌 것은 마음대로 쓸 수 있다.
	void test2() {
		test();
	}
}