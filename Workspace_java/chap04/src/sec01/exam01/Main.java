package sec01.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		long s=scan.nextLong();
//				
//		for(int i=1; i<=s; i++) {
//		for (int j=s-1; j>=i; j--) {
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++) {
//			System.out.print("*");
//		}
//		System.out.println();}

//		for(int i=s; i>=1; i--) {
//			System.out.println(i);
//		}

//		int a=1;
//		for(int i=1; i<=s; i++) {
//			a*=i;
//		}System.out.println(a);

//		long a= 1;
//		for(long i=1; i<=s; i++) {
//			a*=i;
//		}System.out.println(a);
//
//		int[] array = {1,2,3,4,5,6,7,8,9,10};
//		
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] < array[8]) {
//				System.out.println(array[i]);
//			}
//		}
//		
//	int[] array = new int[3];
//	
//	int a = scan.nextInt();
//	int b = scan.nextInt();
//	int c = scan.nextInt();
//	
//	
//	for(int i = 0; i<array.length; i++) {
//		
//		array[i]=scan.nextInt();
//	}
	
//		int sum =1;
//		for(int i = 1; i<=10; i++) {
//			sum*=i;
//		}System.out.println(sum);
//	
//	}
		
int[]array=new int[] {1,20,44,80,21,90,93,70,33};
int max =0;
int index=0;
for(int i = 1 ; i<array.length; i++) {
	if(array[i]>max) {
		max=array[i];
		index=i;
	}
	
	
	
}System.out.println(max);

System.out.println(index);

}
}