package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		
		Avante avante =new Avante();
		HandMadeCar handmade=new HandMadeCar();
		
		
		
		Driver driver = new Driver();
		Car car =(Car)avante;
		driver.run(car);
		
		Car car1=(Car)handmade;
		driver.run(car1);
		
		Spark spark = new Spark();
		driver.run(spark);
		
		
		
	}

}
