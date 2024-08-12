package sec01.exam04_super.food;

public class 제육 extends Food {

	제육(){
		//super();  생략
		System.out.println("제육 생성자 실행");
	
	
		this.name="제육";
		this.price=8000;
		this.recipe = "돼지고기 앞다리";
		this.type="한식";
		
		
	}
	void setSpicy(String spicy) {
		this.name+="-"+spicy;
		
	}
}
