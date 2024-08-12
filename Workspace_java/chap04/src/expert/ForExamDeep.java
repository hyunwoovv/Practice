package expert;

import java.util.ArrayList;
import java.util.List;

public class ForExamDeep {

	public static void main(String[] args) {

//		for(int i=1; i<=10; i++) {
//			System.out.print(i+" ");
//		}

//		for(int i=1; i<=9; i++) {
//			System.out.print(i);
//		if(i%3==0) {
//			System.out.println();
//		}
//		
//		}
		// 피보나치 수열
		// (1,1,2, 3, 5, 8, 13, 21)
		// 변수 3개 사용
		System.out.println("aaaaaaaaaaaaaaa----------------");
//		List<Integer> arr = new ArrayList();
//		arr.add(1);
//		arr.add(1);
//		for(int i =0; i<10; i++ ) {
//		  int a = arr.get(i);
//		}
//		나중에 따로해봄
		
//		int[] array = new int[15];
//		array[0] = 1;
//		for (int i = 0; i <= arr.size()- 3; i++) {
//			array[i + 2] = array[i] + array[i + 1];
//			if(i>=2) {System.out.print(array[i] + " ");}
//		}
//		System.out.println();
		System.out.println("aaaaaaaaaaaaaaaaa------------------------------");

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("---------------------");
		int count = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("------------------------------");
//		int a = 0;
//		int b = 1;
//		for (int i = 0; i <= 6; i++) {
//			if (i < 1) {
//				System.out.print(1 + " ");
//			}
//			int next = a + b;
//			// 0+1
//			// 1+1
//			// 1+2
//			// 2+3
//			System.out.print(next + " ");// 1 //2 //3 //5
//			a = b;// 1 //1 //2 //3
//			b = next;// 1 //2 //3 //5
//
//		}

		/*
		 * 1+1=2 1+x=y x+y=3 3(x)+2(y)=5 5(x)+3(y)=8
		 */

		// 피보나치 변수 2개 사용.
		int b = 1;
		int next = 0;
		for (int i = 1; i <= 8; i++) {
//			next=b+next;//2//3//4//5
//			System.out.print(next + " ");
//			b=next+b;
//			System.out.println("XX"+b);
			if (i % 2 == 1) {
				b += next;
				System.out.print(b + " ");
			} else {
				next += b;
				System.out.print(next + " ");
			}
		}

	}

}
