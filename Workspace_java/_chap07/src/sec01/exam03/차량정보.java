package sec01.exam03;

public class 차량정보 extends Car {

	String 차종;
	String 색깔;
	String 크기;

	차량정보() {
		this.차종="xm3";
		this.색깔="클라우드 펄";
		this.크기="4인승";
		System.out.println("");

	}

	void carinfor(String s1, String s2, String s3) {
		this.차종 = s1;
		this.색깔 = s2;
		this.크기 = s3;
		System.out.println("설정이 완료 되었습니다.");
	}

}
