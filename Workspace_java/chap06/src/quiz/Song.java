package quiz;

public class Song {
//	class Song
//	필드 : 제목, 가수명, 장르, 가사, 곡 길이
//	메소드
//	 
//	각각의 값을 지정하는 것(제목바꾸기 같이)
//	모든 정보 표시
//	class SongExam
//	3곡 이상의 노래를 등록해서 관리
	
	String title= "곡제목";
	String singer= "가수";
	String category= "장르";
	String lyics="가사";
	String length="길이";
	void setTitle(String a) {
		title = a;
	}
	void setSinger(String a) {	
		singer = a;
		}
	void setCategory(String a) {
		category=a;
	}
	void setLyics(String a) {
		lyics=a;
	}
	void setLength(String a) {
		length=a;
	}

	void 곡정보(){
		System.out.println("곡 제목 : "+title);
		System.out.println("가수 : "+singer);
		System.out.println("장르 : "+category);
		System.out.println("가사 : "+lyics);
		System.out.println("곡 길이 : " + length);
		System.out.println("-----------------------");
	}
}
