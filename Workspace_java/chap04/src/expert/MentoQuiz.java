package expert;

import java.util.Scanner;

public class MentoQuiz {

	public static void main(String[] args) {

//		Q6. 정수를 하나 입력받고, 아래의 형태처럼 출력하는 프로그램을 작성하세요.
//		입력 값은 1 이상의 int 정수입니다.
//		ex1) 입력 : 1 -> 출력 :
//		AB
//		BA
//		ex2) 입력 : 2 -> 출력 :
//		AABB
//		AABB
//		BBAA
//		BBAA
//		ex3) 입력 : 3 -> 출력 :
//		AAABBB
//		AAABBB
//		AAABBB
//		BBBAAA
//		BBBAAA
//		BBBAAA

//		Scanner scan = new Scanner(System.in);
//		int a=scan.nextInt();
//		for (int i = 0; i <a; i++) {
//			for (int j = 0; j <a; j++) {
//				System.out.print("A");}
//			
//			for(int k=0; k<a; k++) {
//				System.out.print("B");
//				
//			}
//			System.out.println();
//		}
//		for (int i = 0; i <a; i++) {
//			for (int j = 0; j <a; j++) {
//				System.out.print("B");}
//			
//			for(int k=0; k<a; k++) {
//				System.out.print("A");
//				
//			}
//			System.out.println();
//		}

//		Q7. 정수를 하나 입력받고, 아래의 형태처럼 출력하는 프로그램을 작성하세요.
//		입력 값은 1 이상 26 이하의 정수입니다.
//		ex1) 입력 : 1 -> 출력 :
//		A
//		ex2) 입력 : 2 -> 출력 :
//		AB
//		BB
//		ex3) 입력 : 3 -> 출력 :
//		ABC
//		BBC
//		CCC
//		ex4) 입력 : 6 -> 출력 :
//		ABCDEF
//		BBCDEF
//		CCCDEF
//		DDDDEF
//		EEEEEF
//		FFFFFF

//		int h = scan.nextInt();
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j <h; j++) {
//				if (j < i) {
//					System.out.printf("%c", 'A' + i);
//				System.out.print(".");} else {
//					System.out.printf("%c", 'A' + j);
//				System.out.print("-");}
//			}
//			System.out.println();
//		}
//		System.out.println("------------------");
//	for(int i=h; i>=h; i--) {
//		for(int j=i; j>=h; j--)
//		{
//			System.out.print(j);
//		}
//	System.out.println();	
//	}
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <= a; j++) {
//				if (j == 1 || j == a||i==1||i==a) {
//					System.out.print("*");
//				}else {System.out.print(" ");}
//			}
//			System.out.println();
//		}

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}

//		for(int i=1; i<=5; i++) {
//		for(int j=1; j<=i; j++) {
//			System.out.print("ㅋ");
//		}System.out.println();
//	}
//	
//		int[] a = new int[1000];
//		a[0] = 1;
//		a[1] = 1;
//		a[2] = 1;
//		for(int i=0;i<a.length;i++){
//			a[i] = i;
//			System.out.println(a[i]);
//		}
	// String[] a= new String[3]
		
		
		String[] array = new String[] { "김", "성", "령", "뒤", "졌", "다" };
		for (int i = 1; i <= array.length * 3; i++) {
			for (int j = 0; j < i; j++) {
				if (j > 11) {
					System.out.print(array[j - 12]);
				} else if (j > 5) {
					System.out.print(array[j - 6]);
				} else {
					System.out.print(array[j]);
				}
			}

			System.out.println();
		}
	}
}
