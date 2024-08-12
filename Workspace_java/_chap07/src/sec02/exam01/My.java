package sec02.exam01;

public class My {

	void buyCoffee(Cafe shop) {

		if (shop.isDt() == true) {
			System.out.println("드라이브 스루를 이용합니다");
			shop.order("따아");
		} else {
			System.out.println("드라이브 스루를 지원하지 않습니다. ");
			shop.order("아이스아메리카노");
		}
	}
//	void order(String menu) {
//		if(cafe.isDt();==true) {
//			System.out.println("드라이브 스루를 이용한다.");
//			cafe.order(menu);
//		}else {System.out.println("드라이브 스루를 지원하지 않습니다.");}
//	}

}
