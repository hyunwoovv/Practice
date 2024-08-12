package chap05;

import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {

		int select = -1;
		int y = 0;
		boolean run = true;
		String menu="";

		
		//저장
		//주문 목록 
		Scanner scan = new Scanner(System.in);
		int total = 0;
		System.out.println("1.매장 2. 포장");
		int a = scan.nextInt();
		while (run) {
			boolean run2 = true;
			System.out.println("-------------------------------------");
//			System.out.println("1.아메리카노 2.라떼  3.복숭아 아이스티 4.결제");
			System.out.println("1. 아메리카노 \t \t 2000원");
			System.out.println("2. 라떼       \t \t 2500원");
			System.out.println("3. 아이스티   \t \t 3000원");
//			System.out.println("    2000        2500        3000");
			System.out.println("-------------------------------------");

			System.out.println("선택>");
			select = scan.nextInt();
			System.out.println();
			if (select == 1) {
				total += 2000;
				
				while (run2) {
					System.out.println("옵션 선택");
					System.out.println("--------------------------");
					System.out.println("1. 샷추가 500원 2. 사이즈 업 1000원 3. 기본 4. 결제 5. 처음으로");
					y = scan.nextInt();
					if (y == 1) {
						total += 500;
						System.out.println("샷 추가");
						System.out.println("--------------------------");
						continue;

					} else if (y == 2) {
						total += 1000;
						System.out.println("사이즈 업");
						System.out.println("--------------------------");
						continue;
					} else if (y == 3) {
						total += 0;
						System.out.println("기본");
						System.out.println("--------------------------");
						continue;
					} else if (y == 4) {
						System.out.println(total + "원 결제가 완료되었습니다.");
						run = false;
						break;
					} else {
						run2 = false;
						continue;
					}

				}
			} else if (select == 2) {
				total += 2500;
				while (run2) {
					System.out.println("옵션 선택");
					System.out.println("--------------------------");
					System.out.println("1. 샷추가 500원 2. 사이즈 업 1000원 3.기본 4.우유 추가 500원 5. 결제 6. 처음으로");
					y = scan.nextInt();

					if (y == 1) {
						total += 500;
						System.out.println("샷 추가 ");
						System.out.println("--------------------------");
						continue;

					} else if (y == 2) {
						total += 1000;
						System.out.println("사이즈 업");
						System.out.println("--------------------------");
						continue;
					} else if (y == 3) {
						total += 0;
						System.out.println("기본");
						System.out.println("--------------------------");
						continue;
					} else if (y == 4) {
						total += 500;
						System.out.println("우유 추가");
						System.out.println("--------------------------");
						continue;
					} else if (y == 5) {
						System.out.println(total + "원 결제가 완료되었습니다.");
						run = false;
						break;
					} else {
						run2 = false;
						continue;
					}
				}

			} else if (select == 3) {
				total += 3000;
				while (run2) {
					System.out.println(" 옵션 선택");
					System.out.println("--------------------------");
					System.out.println("1. 샷추가 500원 2. 사이즈업 1000원 3. 기본 4. 결제 5. 처음으로");
					y = scan.nextInt();

					if (y == 1) {
						total += 500;
						System.out.println("샷 추가");
						System.out.println("--------------------------");
						continue;

					} else if (y == 2) {
						total += 1000;
						System.out.println("사이즈 업");
						System.out.println("--------------------------");
						continue;
					} else if (y == 3) {
						System.out.println("기본");
						System.out.println("--------------------------");
						total += 0;
						continue;
					} else if (y == 4) {
						System.out.println(total + "원 결제가 완료되었습니다.");
						run = false;
						break;
					} else {
						run2 = false;
						continue;
					}
				}
			} else if (select == 4) {
				System.out.println("--------------------------");
				System.out.println("총 " + total + "원 결제가 완료되었습니다.");
				run = false;
				break;

			}
		}
	}
}
