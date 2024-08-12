package expert;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MentoQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]array=new int[10]; 

//array[0]=1;
//
//
//// 출력
for(int i=0; i<array.length; i++) {
		array[i]=i+1;
	System.out.print(array[i]+" ");
}
//		
//역순찍기
//for(int i=array.length-1; i>=0; i--) {
//
//	System.out.print(array[i]+ " ");
//}
//
		// 최댓값 구하기
//Scanner scan= new Scanner(System.in);
////int max=0;
//int []array1=new int[5];
//for(int i=0; i<array1.length; i++) {
//array1[i]=scan.nextInt();
//} 
//for(int i=0; i<array1.length; i++) {
//	if(array1[i]>max) {
//		max=array1[i];
//	}
//}System.out.println(max);

//char[] lorem="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.".toCharArray();
//char a='a';
//int count=0;
//for(int i =0; i<lorem.length; i++) {
//	if(a==(lorem[i])) {
//		count++;
//	}
//}System.out.println(count);
		Scanner scan = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		boolean same = false;
		for (int i = 0; i < array1.length; i++) {
			int num = scan.nextInt();
			array1[i] = num;
			array2[num]++;
		}

//		for (int i = 0; i < array1.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (array1[i] == array1[j]) {
//					same = true;
//				}
//			}
//			if (same == false) {
//				System.out.println(array1[i]);
//			
//			}
//			same=false;}
		int count = 0;
		for (int i = 0; i < array2.length; i++) {
			if(array2[i]>0)
				count++;

		}
		System.out.println(count);
	}

}
