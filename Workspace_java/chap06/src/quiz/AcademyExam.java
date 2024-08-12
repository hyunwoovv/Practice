package quiz;

public class AcademyExam {

	public static void main(String[] args) {
		Academy academy = new Academy("천안");
		Student s1=new Student("남현우",28);
		Student s2=new Student("남현우1",28);
		Student s3=new Student("남현우2",28);
		academy.join(s1);
		academy.join(s2);
		academy.join(s3);
		academy.viewList();
	}

}
