package sec01.exam13;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "영일이삼사오육칠팔구";
		
		char c = s1.charAt(3);
		System.out.println("c : "+ c);
		int i = s1.length();
		System.out.println("길이  : "+ i);
		
		int i2 = s1.indexOf("이");
		System.out.println("i2 : " + i2);
		//정확하게 일치하는게 없으면 -1
		//왼쪽에서부터 첫번째 일치하는 것의 인덱스를 돌려줌
		System.out.println("없는 것  : "+s1.indexOf("아"));
		
		i2 = s1.indexOf("사오");
		System.out.println("i2 : "+ i2);
		
		String blog = "blog.naver.com";
		String cafe="cafe.naver.com";
		if(blog.indexOf("blog")!=-1) {
			System.out.println("블로그 주소");
		}else {
			System.out.println("블로그 아님");
		}
		if(cafe.indexOf("blog")!=-1) {
			System.out.println("블로그 주소");
		}else {
			System.out.println("블로그 아님");
		}
		//@와.이 없으면 이메일 주소 형식이 아님을 판단
		String email = "todair@naver.com";
		if(email.indexOf("@")>=0&& email.indexOf(".")!= -1) {
			System.out.println("이메일 주소를 입력받았습니다.");
		}else {
		System.out.println("정확한 이메일을 적어주세요");
		}
		
		char c3 = 'd';
		boolean flag=false;
		for(int i3=0; i3<email.length(); i3++) {
			char c2 = email.charAt(i3);
			if(c2==c3) {
				flag=true;
				System.out.println(i3);
				break;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		//첫번째 전달인자를 두번째 전달인자로 "모두" 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+s2);
		
		String s3 = "123123123";
		System.out.println(s3.replace("12", "다른글씨"));
		
		String s4= s1.substring(1,4);
		System.out.println("s4 :"+ s4);
		
		String ssn = "213456-3123694";
		String s5 = ssn.substring(7,8);
		if(s5.equals("1")||s5.equals("3")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		//전달인자가 하나인 경우 끝까지 
		//범위가 너무 크면 오류
	System.out.println(ssn.substring(7));
	
	String oldStr="  글씨    중간     띄어쓰기";
	System.out.println("["+oldStr.trim() + "]");
	
	String id="            ";
	String trim_id= id.trim();
	if(id.trim().length()==0) {
		System.out.println("아이디를 입력해주세요");
	}
	String menu = "돼지국밥, 마라탕, 제육, 냉면";
	String[]menus = menu.split(",");
	for(String m : menus) {
		System.out.println(m);
	}
	
	//정규 표현식으로 글시를 잘라서 배열로 만들어준다
	//.은 정규 표현식에서 사용하는 예약 문자
	String[]urls =blog.split(".");
	System.out.println(urls.length);
	System.out.println(urls[1]);
	
	String search="https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=%EC%95%84%EC%82%B0+cgv&oquery=%EC%BD%94%EB%82%9C&tqi=iqrX0lqo1LVssnjldehssssst58-366661";
	String[] params =search.split("&");
	System.out.println(params[2].split("=")[0]+" : "+params[2].split("=")[1]);
	
	}

}
