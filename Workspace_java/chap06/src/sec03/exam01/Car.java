package sec03.exam01;

public class Car {
String name;
String color;
int cc;
	//생성자 : new 할때 무조건 실행되는 메소드
	//return은 쓰지 않음 : 무조건 생성된 주소를 돌려주기 때문.

	//만약에 생성자를 적지 않으면
	//기본 생성자가 자동으로 만들어진다.
	//Car(){}기본 생성자
	// 생성자는 java에게는 중요해서 무조건 있어야 함.

//내가 생성자를 적은 경우
//기본 생성자는 만들어지지 않음.

//생성자 사용 이유 : 귀찮으니까 무조건 실행하게 만들어둠.
//
	Car(){
		this("회색",1000);//오버로딩 된 다른 생성자호출, 단 생성자의 첫줄에 적어야 한다.
		System.out.println("생성자 실행");
		name = "자동차";
		System.out.println(name);
//		color="회색";
//		cc= 1000;
//		this("회색",1000); 무조건 첫줄에 적어줘야함
	}
Car(String color2, int cc2){
	System.out.println(" color : "+color2);
	System.out.println("cc : "+ cc2);
	color=color2;
	cc=cc2;
}
	void test() {
		System.out.println("테스트");
	}
	void print() {
		System.out.println("---------------------");
		System.out.println("color : "+color);
		System.out.println("cc : " + cc);
		System.out.println("---------------------");
	}
}
