package quiz;

public class Calc {
	//계산기 만들기
	//+,-,*,/,%
	//두 수를 받아 연상 결과를 돌려줌
	//
int cal(int x, int y){
	System.out.println("x : " + x);
	System.out.println("y : " + y);

	return x + y;
}
int cal1(int x, int y) {
	System.out.println("x : " + x);
	System.out.println("y : " + y);

	return x-y;
}
int cal2(int x, int y) {
	System.out.println("x : " + x);
	System.out.println("y : " + y);
	return x*y;
	}

int cal3(int x, int y) {
	System.out.println("x : " + x);
	System.out.println("y : " + y);
return x/y;	
}

int cal4(int x, int y) {
	System.out.println("x : " + x);
	System.out.println("y : " + y);
	return x%y;
}

int 계산기(int x, String a, int y) {
	if(a.equals("+")) {
		System.out.println(x+y);
		return x+y;
	}else if(a.equals("-")) {
		System.out.println(x-y);
		return x-y;
	}else if(a.equals("*")) {
		System.out.println(x*y);
		return x*y;
	}else if(a.equals("/")) {
		System.out.println((double)x/y);
		return x/y;
	}else if(a.equals("%")) {
		System.out.println(x%y);
		return x%y;
	}else {
		System.out.println("정확한 기호를 입력해주세요");
	}
	return 0;
}


//TV만들기
//전원, 볼륨 up/down 0~10 볼륨의 범위를 벗어나지 못하게
//채널 up/down/직접입력
//정보보기 : 현재 전원상태, 볼륨, 채널 정보출력

//노래 관리db
//class song
// 필드 : 제목, 가수명, 장르, 가사, 곡 길이
// 메소드
// 각각의 값을 지정하는 것(제목 바꾸기 같이)
// 모든 정보 표시
//class Song Exam 3곡 이상의 노래를 등록해서 관리
}
