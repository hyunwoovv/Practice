package expert;

import java.util.Scanner;

public class ifExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		boolean b = a < 5;

		// else if 로 묶을 시 실행된 값이 참이면 멈춤
		if (b) {
			System.out.println(a + "는 5보다 작습니다.");
			System.out.println(b);
		} else if (a < 15) {
			System.out.println(a + "는 15보다 작습니다");
		} else if (a < 25) {
			System.out.println(a + "는 25보다 작습니다");
		}

		if (b) {
			System.out.println(a + "는 5보다 작습니다.");
			System.out.println(b);
		}
		if (a >= 5 && a < 15) {
			System.out.println(a + "는 15보다 작습니다");
		}
		if (a >= 15 && a < 25) {
			System.out.println(a + "는 25보다 작습니다");
		}

		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;

		// &&만 있는 경우 false가 나오면 그 뒤는 쳐다도 안본다.
		System.out.println(a1 && a3 && a2);
//		String b1="치킨";
		String b1 = null;
		if (b1 != null) {
			System.out.println(123);
			if (b1.length() > 4) {
				System.out.println(b1);
			}
		}

		// &&는 false를 만나면 끝남.
		if (b1 != null && b1.length() > 4) {
			System.out.println(b1);
		}
//		System.out.println(b1.length());

		// ||는 true를 만나면 더이상 실행하지 않음
		System.out.println(a1 || a3 || a2);

		// &&연산자 먼저 실행.
		System.out.println(false || true && true);
//		if(3<a<5)  3<a에서 true로 바뀌기 때문에 연산 불가능.
		if (3 < a && a < 5) {
			System.out.println(1234);
		}
		double rand = Math.random();
		double 답1 = rand * 100;

		System.out.println((int) -3.5);

//	5~7까지 랜덤으로 뽑고 싶을 때
		// 5+(0~2)
//	int a02 = (int)(rand*3);
//	int 결과 = a02+5;
		int 결과 = (int) (Math.random() * 3) + 5;

		int b02 = (int) Math.random() * 6849684 % 3;

		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		lotto = (int) (Math.random() * 45) + 1;
		System.out.println(lotto);

		for (int i = 0; i < 6; i++) {
			System.out.println((int) (Math.random() * 45) + 1);
		}
//내 주머니에 10000원
// 술을 마시고 싶다
// 소주 : 5000
		// 과자 : 2000
		// 컵라면 : 1500
		// 족발 : 35000
		int month = -7;
		if (month < 0) {
			System.out.println("영하입니다.");
		} else {
			System.out.println("영상입니다");
		}
		month = 30;
		if (month > 0) {
			System.out.println("영상입니다");
		} else {
			System.out.println("영하입니다.");
		}

		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
	if(month<0) {
		System.out.println("영하" +(month*-1) +"도 입니다");
	}else {
		System.out.println("영상"+month+" 도입니다");
	}
		// 1500이 2000~3000 사이 의 값인가
		// 2000<1500<300;
//		int c1 = 1500;
//		if (c1 > 2000 && c1 < 3000) {
//			System.out.println(c1 + "은 2000과 3000 사이의 수 입니다");
//		} else {
//			System.out.println(c1 + "은 2000과 3000 사이의 수가 아닙니다");
//		}
//3,4,5 봄 , 6 7 8 여름 9,10 11,가을 12 1 2겨울
		

		System.out.println("--------------------");
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄 입니다.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름 입니다.");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을 입니다");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울 입니다");
			}else {System.out.println("다시 입력 ㄱㄱ");}
		
		
		
	}
}
