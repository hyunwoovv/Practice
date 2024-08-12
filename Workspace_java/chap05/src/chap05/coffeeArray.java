package chap05;

import java.util.Scanner;
import java.util.ArrayList;

public class coffeeArray {

	public static void main(String[] args) {
		// 커피 종류
		// 종류에 따른 가격
		// 종류별 토핑
		String[] coffee = { "아메리카노", "청포도에이드", "카페라떼", "헤이즐넛 라떼" };
		int[] price = { 2000, 3500, 2500, 3000 };
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> orderList = new ArrayList<>();
		int total = 0;
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("메뉴를 선택해주세요.(0. 결제하기)");
			System.out.println("아메리카노\t 2000원");
			System.out.println("청포도 에이드\t 3500원");
			System.out.println("카페 라떼 \t 2500");
			System.out.println("헤이즐넛 라떼 \t 3000원");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			int choice = scan.nextInt();
			if (choice != 0) {
				total += price[choice - 1];
			System.out.println(coffee[choice - 1] + " " + price[choice - 1]);
				System.out.println("합계"+total + "원");
			} else{
				System.out.println("결제하겠습니다");
				System.out.println("-----------------------------");
				System.out.println("주문 목록\n"); 
				for (String order : orderList) {
                    System.out.println(order);
                }
				System.out.println("-----------------------------");
				System.out.println("결제금액 : " + total);break;
			}
		}
	}

}
