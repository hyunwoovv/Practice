package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = a + 1;
		
		a = a + 1; // a = 1 + a
		
		a += 1; // a = a + 1과 같은 식
		
		a++; // a +=과 같다.
		++a;
		
		a = 10;
		a++;
		System.out.println("a : "+ a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--; // a = a - 1과 같다.
		--a;
		
		a = 10;
		a--;
		System.out.println("a : "+a);
		//현재 a가 9
		
		System.out.println("++a :  "+ ++a);//출력 : 10
		//현재 a가 10
		
		System.out.println("a++ :  "+ a++);
		
		System.out.println("a :  "+ a); //출력 : 11
		//현재 a가 11
		
		System.out.println(a++ + ++a);
		//11+(a가 12가 된 상태)에다가 1더하기
		//위 내용을 풀어쓰기
		a = 11; 
		int result = a;//a
		a = a + 1; //a다음에오는 ++
		a = a + 1; // 두번째 a 앞에오는 ++
		result =  result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : " + c);
		c = !c;
		System.out.println("!c : " + c);
		
		double d = 4;
		System.out.println(d / 3);
		System.out.println(d / 0); //double 일 때는 infinity, int일 때는 /by zero
		
		int f = 14;
		int p = 5 ; 
		System.out.println("몫 : " + (f / p));
		System.out.println("나머지 : " + (f % p));
		
		// 돈 10000
		// 커피 4500짜리 몇잔?
		
		int money = 10000;
		int coffee = 4500;
		int count = money /  coffee;
		System.out.println(count + "잔");
		int change =  money % coffee;
		System.out.println("잔돈 :" + change);
		
		//올리브영 전품목 15% 행사.
		// 1. 꿀 홍차 5000을 샀을 때 얼마를 내야 하나?
		// 2. 꿀 홍차 5000과 립스틱 10000을 샀다 얼마를 내야 하나?
		
		double percent = 0.15;
		int tea = 5000;
		int lipstick = 10000;
		double discount = (tea + lipstick)*percent;
		System.out.println("할인 금액 : "+discount);
		double pay = tea + lipstick - discount;
		System.out.println("지불 금액 : "+ pay);
		
		// 7234원이 있다.
		// 5000원, 1000원, 500원, 100원, 50원, 10원, 1원
		
		int money2;
		money2 = 7234;
		System.out.println("오천원 : " + money2/5000);
		System.out.println("천원  : "+(money2%5000)/1000);
		System.out.println("오백원 : "+(money2%5000%1000)/500);
		System.out.println("백원 : " +(money2%5000%1000%500)/100);
		System.out.println("오십원 : "+(money2%5000%1000%500%100)/50);
		System.out.println("십원 : "+(money2%5000%1000%500%100%50)/10);
		System.out.println("일원 : "+(money2%5000%1000%500%100%50%10)/1);
		
		
		 String left = "수박";
		 String right = "멜론";
		 				
	String temp = left;
	left = right ; 
	right = temp;
	
		  
		System.out.println(left);
		System.out.println(right);
		
	}

}
