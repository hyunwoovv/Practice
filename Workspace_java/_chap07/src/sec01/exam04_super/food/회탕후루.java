package sec01.exam04_super.food;

public class 회탕후루 {
	
		/*
		 * 이름 name
		 * 가격 price
		 * 주재료 recipe
		 * 종류 type
		 */
		
		/*
		 * 먹는다 eat()
		 * 주문한다order()
		 * 요리한다cook();
		 */
		String name;
		int price;
		String recipe;
		String type;
		
		회탕후루(){
			this.name="회탕후루";
			this.price=20000;
			this.recipe="회+설탕";
			this.type="간식";
		}
		
		int eat() {
			System.out.println(this.name+"먹는다.");
			return (int)(Math.random()*5)+1;
		}
	
		/**
		 * 주문 기능
		 * @param int money
		 * @return int 거스름돈
		 */
		
		int order(int money) {
			int change=0;
			System.out.println(this.name+"주문한다");
			if(money<this.price) {
				System.out.println("금액부족으로 주문 취소합니다.");
			}else {
				System.out.println(this.name+"주문한다");
				change=money-price;
			}
			return change;
		
		}
		/**
		 * 
		 * @param int master 요리 숙련도
		 * @return String 조리 결과.
		 */
	 String cook(int master) {
		if(master>7) {
			return "기가 막히게 잘됨";
		}else if(master>4) {
			return "먹을만하게 됨";
		}else { 
			return "최악";
		}
	}
	 void goGarbage() {
		 System.out.println("에잇 버리자");
	 }
		
}


