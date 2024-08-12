package sec01.exam03;

public class CarExam {

	public static void main(String[] args) {
		
	
		 CarChild car = new CarChild("하이브리드");
		 car.drivespeed(20);
		 System.out.println(car.speed);
		 
		 CarChild car1 = new CarChild("터보");
		 car1.carinfor("xm3","클라우드 펄","4인승");
		 car1.drive();
		 car1.drivespeed(30);
		
		 
	}

}
