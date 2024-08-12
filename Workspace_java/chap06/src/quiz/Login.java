package quiz;

public class Login {
//	로그인
//	생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
//	login(아이디, 패스워드) 실행하면
//	login메소드 안에서...
//	만약 같으면 "메인페이지" 출력하고 true 돌려줌
//	다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	String id;
	String pw;
	boolean check = false;

	Login(String a, String b) {
		id = a;
		pw = b;
	}
	void 실행(String a, String b) {
		if(a == id &&pw==b) {
			System.out.println("MainPage");
			check = true;
		}else {
			System.out.println("로그인 화면으로 돌아감");
			check = false;
		}
}
	
}
