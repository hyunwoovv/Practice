package expert;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for( ; ; ){}
		

	 int a = 1;//a를 초기화 했다
	 
	 
	 System.out.println(a);
	 
	 //첫번째 실행
	 a= a+10;
	 System.out.println(a);
	 
	 //첫번째와 같은 코드를 두번째 실행
	 a= a+10;
	 System.out.println(a);
	 
	 //계속 같은 코드를 세번째 실행
	 a= a+10;
	 System.out.println(a);
	
//첫번째 장소 : 초기화식 : 처음에 딱 한번만 실행.
// 두번째 장소 : 조건식 : 거짓이 아닐 때 반복 조건
//             : 처음부터 조건이 맞아야 실행됨.
// 세번째 장소 : 증감식 : 사실은 그냥 실행문 끝에 무조건 실행해야 하는 
//             : 코드를 넣는 곳.
	 for(int b=1; b<=31; b+=10) {
		 System.out.println(b);
	 }
	
	 for(int i=0; i<3; i++) {
		 System.out.println(i);
	 }
	 
	 System.out.println("-------------------");
	 
	int eig=8;
	 for(int i=1; i<eig; i++) {
		 System.out.println(i);
	 }
//	 1~10 사의 숫자를 이용해서 짝수만 출력
	 System.out.println("---------------------");
	 int sum=0;
	 for(int i=1; i<=10; i++) {
		 if(i%2==0) {
			 
			 sum=sum+i;
		 }
	 }System.out.println(sum);
	 
	 int x=10;
	 int z=2;
	 System.out.println("---------------");
	 for(int i=z; i<=x; i+=z) {
		 System.out.println(i);
	 }
System.out.println("============");
		int sum2=0;
	 	 for(int i=2; i<=10; i+=2) {
	 		sum2+=i;
	 		//sum2 = 0+2 2
	 		//sum2 = 2+4
	 		//sum 2 = 6+6
	 		//sum 2 = 12 + 8
	 		//sum 2 = 20+10
	 	 }System.out.println(sum2);
	 	 
	 	 for(int i=0;i<5;i++) {
	 		 for(int j=0; j<i+1; j++) {
	 			 System.out.print("*");
	 		 }
	 		 for(int k=4; k>i; k--) {
	 			 System.out.print(".");
	 		 }
	 		 System.out.println();
	 	 }
	 	
	System.out.println("---------------------"); 	
	for(int i=1; i<=5; i++) {
 		for(int j=5-i; j>0; j--) {
 			System.out.print('.');
 		}
 		for(int k=1; k<=i; k++) {
 			System.out.print("*");
 		}
 		System.out.println();
	}
	
	System.out.println("----------------------");
	int count = 0;
	//3~100까지 짝수의 갯수
	// if문 활용
	// 2로 나누었을 때 나머지가 0인것을
	//변수에 값을 담아서 조건을 만족 할 때 값이 하나씩 증가
	for(int i=3; i<=100; i++) {
		if(i%2==0) {
			count++;
			}	
		}System.out.println("짝수의 갯수 : "+ count);
		System.out.println("------------------------");
		//구구단 2단 출력하는 법
		//고정 값 2를 놔두고 숫자 하나씩만 더해서 바꿔가면서 곱하기
		// 2*1
		// 2*2
		// 2*3
		// 2*4
		// 2*5
		
		// 변수 i가 2보다 작거나 같으면 실행이 되는 것이기 때문에
		// i++는 다음식에 실행되지 않고 처음 한번만 실행된 후 종료.
		// 2단까지 나옴
		for(int i=2; i<=2; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println("2 * " + j + " = " + (i*j));
			}
		}
		
		
		//체력이 100
		// 한대 맞으면 17씩 깎임
		// 몇대 맞으면 죽을까?
		//100 - 17
		//-17-17 에서 100이 0이 될 때 까지
//		for(int i =17; i<=h; i+=17) {
//			if(h>0) {
//				h++;
//				System.out.println(i);}
//		}\
	System.out.println("---------------------");
	
int hit=0;
		for(int i=100;i>=0;i-=17) {
						hit++;
		}System.out.println(hit);
		
	// 6만원씩 해서 4000000을 채우기 위해 몇주가 걸릴까?\
	// 60000+60000 
int day=0;
for(int i=0 ; i<=4000000; i+=60000) {
	day++;
}System.out.println("복구 기간까지 : " + day);

String name = "남현우";
int age = 28;
System.out.println(name+age);

	}
	
	
}
