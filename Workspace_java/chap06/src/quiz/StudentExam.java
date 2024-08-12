package quiz;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student("남현우",28);
		// 필드의 초기화 없는 경우 0,null, false로
		// new 하는 순간 자동 초기화 됨
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);

		s1.name = "남현우";
		s1.age = 28;
		s1.hasGlasses = false;

		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		// s1.name과 내 지역변수 name은 아무 관계 없음.
		String name;

		// 지역변수는 초기화 없이 사용 불가능
//		int a;
//		System.out.println(a); 
//		
//		Student s2 = new Student();
//		System.out.println(s2.name);
//		System.out.println("-------------------");
//		s2.name = "박춘보";
//		s2.age=50;
//		System.out.println(s2.name);
//		System.out.println(s2.age);
//		
//		System.out.println(s1);
//		System.out.println("--------------------");
////		int intel = s1.study("java 클래스");
//		System.out.println("공부했더니 지식 : "+ intel);
//		System.out.println(s1);
		int a = s1.meal("고기");
		System.out.println(a);
		System.out.println(s1);

//		
		System.out.println("--------------------------");
		int b = s1.game("css dinner");
		System.out.println("stress : " + b);
		System.out.println(s1);
		System.out.println("s1.stress" + s1.stress);
		System.out.println("========================");
		int d = s1.study("경민아카이브", 5);
		System.out.println("stress : " + d);
		System.out.println(s1);
		System.out.println("s1.stress" + s1.stress);
		System.out.println("--------------------------");
//		double c = s1.doGame("메이플", 3);
//		System.out.println("이만큼 했다 :" + c);
//		System.out.println(s1);
//		System.out.println("s1.stress" + s1.stress);
//		
		System.out.println("==================================");
		Student s3=new Student("남현우");
		System.out.println(s3);
System.out.println("-----------------------------");

	}

}
