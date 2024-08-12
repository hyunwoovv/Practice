package expert;

import java.util.Scanner;

public class Mento {

	public static void main(String[] args) {

//		double a = 1000;
//		double b= 457;
//		double c = a/b;
//		System.out.println(c);
//		c= c*1000;
//		System.out.println(c);
//		c=(int)c;
//		System.out.println(c);
//		double d= (c/1000);
//		System.out.println(d);

//		String scan3;
//		int scan2;
//		Scanner scan=new Scanner(System.in);
//		
//		scan3=scan.nextLine();
//		scan2=scan.nextInt();
//		System.out.println("Hello, my name is \""+scan3+"\" and I'm "+scan2+" years old.");
//		

//		double a = 3.14;
//		double b=5;
//		
//		System.out.println(a*b*b);

//		int a = 1500000000;
//		int b = 1500000000;
//		int c = a+b;
//		System.out.println(c);


//		m = scan.nextInt();
//		System.out.println((char)scan1);
//		for(int i=0; i<4; i++) {
//			System.out.println((char)(scan1+i));

//		switch(scan1) {
//		
//		case 1 :
//				System.out.println("one");
//			
//			break;
//		case 2 :
//				System.out.println("two");
//			break;
//		case 3 : 
//				System.out.println("three");
//			break;
//			
//		default:
//		System.out.println("other");
//		
//		}
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		int a=10;
//	while(true) {
//		if(a>=1) {
//			System.out.println(a--);
//			}else {
//				break;
//			}
//	
//		}
//		if (h >= 0 && h <= 23&& m >= 0 && m <= 59) {
//			 
//				m = m + 35;
//				if (m > 59) {
//					h = h + 1;
//					m -= 60;
//				}
//	
//			if (h >= 24) {
//				h -= 24;
//			}
//			System.out.println(h + " " + m);
//		} else {
//			System.out.println("0 0");
//		}

//		for(int i=h;i<=3;i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");}
//			System.out.println();}

//		for(int i=1; i<=h; i++) {
//			for(int j=1;j<=i; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}

//		for (int i = 1; i <= h; i += 2) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
		
		
		
////		int m;
				
		
//		int x=3;
//		for(int i=1;i<=h; i++ ) {
//			System.out.println(h);
//		}
//		
		
//		for(int i=1; i<=h;i++) {
//			int a = scan.nextInt();
//			sum+=a;
//		}
//		System.out.println(sum);
		Scanner scan = new Scanner(System.in);
	int h = scan.nextInt(); 
//		int n = scan.nextInt();
//		int dev=1;
//		for(int i = 1; i<=n; i++) {
//			dev *= h;
//			
//		}
//		System.out.println(dev);
		
//		Q3. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 행렬을 출력하는 프로그램을 작성하세요.
//		"같은 줄"에서 "글자 사이 공백"은 반드시 한 칸이어야 합니다(맨 앞 또는 맨 뒤의 공백은 상관없음).
//		입력 값은 1 이상의 int 정수입니다.
//		ex1) 입력 3 -> 출력 :
//		00 01 02
//		10 11 12
//		20 21 22
//		ex2) 입력 4 -> 출력 :
//		00 01 02 03
//		10 11 12 13
//		20 21 22 23
//		30 31 32 33
		
	//마지막 공백 삭제
//	for(int i=0; i<h; i++) {
//		for(int j=0; j<h; j++) {
//			
//			if(j==h-1) {
//			System.out.print(i+""+j+"");
//			}else{System.out.print(i+""+j+" ");}
//		}
//		System.out.println();
//	}
//	for(int i=0; i<h; i++) {
//		for(int j=0; j<h; j++) {
//			System.out.print(i+""+j+" ");
//		}System.out.println("");
//	}
	
//	Q4. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 별을 찍는 프로그램을 작성하세요
//	입력 값은 1 이상의 int 정수입니다.
//	ex1) 입력 3 -> 출력 :
//	* * *
//	*   *
//	* * *
//	ex2) 입력 4 -> 출력 :
//	* * * *
//	*     *
//	*     *
//	* * * *
//	ex3) 입력 1 -> 출력 :
//	*
//	ex4) 입력 2 -> 출력 :
//	* *
//	* *
//	for(int i = 0; i<h; i++) {
//		for(int j=0; j<h; j++) {
//		if(j==0||j==h-1||i==0||i==h-1) {
//			System.out.print("*");
//		}else {System.out.print(" ");}
//		}
//		System.out.println();
//	}

		
//	Q5. 정수 값을 하나 입력받으세요. 그리고 1 * 2 * 3 * ... 순으로 곱했을 때, 그 곱이 입력 값을 넘게하는 순간, 마지막에 곱한 수를 출력하는 프로그램을 작성하세요.
//	입력 값은 2 이상의 int 정수입니다.
//	예를 들어 입력이 20일 때 그 값을 넘게 하는 마지막 곱한 수는 4입니다. (1 * 2 * 3 * 4 = 24)
//	ex1) 입력 :  20 -> 출력 : 4  (1 * 2 * 3 * 4 = 24)
//	ex2) 입력 : 100 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//	ex3) 입력 : 120 -> 출력 : 5  (1 * 2 * 3 * 4 * 5 = 120)
//	ex4) 입력 : 121 -> 출력 : 6  (1 * 2 * 3 * 4 * 5 * 6 = 720)
	
//	int sum = 1;
//	int sum1=1;
//while(h>sum) {
//	sum=sum*sum1++;
//}
//	System.out.println(sum1);
   // 입력값
    int i = 1; // 1부터 곱하기
    int sum = 1; // 계산 값 저장
    while (true) {
       sum *= i;
       if(sum>h) {
          System.out.println(i + " = " + sum);
          break;
       }
       System.out.print(i + " * ");
       

       i++;
    }System.out.println(i);
    
    System.out.println("--------------------------------");
    sum = 1;

    for (i = 1; sum < h; i++) {
       sum *= i;
       System.out.print(i + " ");
    }
    System.out.println("");
    System.out.println(h);
    System.out.println(sum);
    System.out.println(i);

	}
}
