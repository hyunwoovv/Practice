package quiz;

public class Academy {
//  필드
	// 학원생student 배열 [10] 또는 ArrayList
	// 학원 이름 : "천안"또는 "수원"

	// 생성자 학원이름 필수

	// 메소드
	// join(학원생) : 필드에 등록
	// viewList() : 등록된 학원생들의 이름과 나이 출력
	String name;

	Academy(String aca) {
		name = aca;
	};

	Student[] student = new Student[10];

	void join(Student a) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				student[i] = a;
				break;
			}

		}

	}

	//학원 안에 있는 학생을 for문을 사용해서
	// 출력
	void viewList() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				break;
			}
			System.out.println(student[i].name);
		}
	}
}
