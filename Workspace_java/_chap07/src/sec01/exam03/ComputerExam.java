package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calc calc = new Calc();
		System.out.println("원 면적 : "+calc.areaCircle(r));
		System.out.println();
		
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+ computer.areaCircle(r));
		
		System.out.println("-------------------------------------");
		System.out.println("Math.PI : "+Math.PI);
		double area=0;
		
		System.out.println("----------------------------");
		Calc calc1=new Calc();
		area = calc1.areaCircle(10);
		System.out.println(area);
		
		System.out.println("------------------------");
		Computer computer1 = new Computer();
		area = computer1.areaCircle(10);
		System.out.println(area);
		

	}

}
