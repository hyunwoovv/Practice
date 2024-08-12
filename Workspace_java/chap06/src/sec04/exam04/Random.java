package sec04.exam04;

import java.util.Scanner;

public class Random {
	// 문제 2
	// 임의의 수
	// 0~9에서 하나 결정 //ex)7
	// 정답(3)
	// >>up(시도회수 : 1)
	// >>정답(8)(시도 회수:2)
	// >>정답 (7)(시도회수:3)

	
int a = (int)(Math.random()*10);
int count=0;
boolean now = false;
	void rand(int n) {

			
		if(n==a) {
			System.out.println("정답 입니다. " + " 시도횟수 : "+ ++count);
			now = true;
		}else if(n>a){
			System.out.println("오답 입니다. "+"DOWN"+" 시도횟수 : " + ++count);
		}else if(n<a) {
			System.out.println("오답 입니다. "+" UP "+" 시도횟수 : "+ ++count);
		}
	}

	
}
