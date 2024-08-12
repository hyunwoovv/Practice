package quiz;

public class SongExam {

	public static void main(String[] args) {
		Song song =new Song();
		Song song2 =new Song();
		Song song3=new Song();
		
		song.setTitle("Orange");
		song.setSinger("7!!");
		song.setCategory("J-pop");
		song.setLyics("너무 긺");
		song.setLength("5:14");
		song.곡정보();
		
		song2.setTitle("블루아카이브");
		song2.setSinger("박경민");
		song2.setCategory("H-pop");
		song2.setLyics("하레가 좋아");
		song2.setLength("14:22");
		song2.곡정보();
		
		song3.setTitle("슬리프");
		song3.setSinger("정다올");
		song3.setCategory("H-pop");
		song3.setLyics("슬리~ 슬리슬리 슬리~");
		song3.setLength("33:51");
		song3.곡정보();
		
	}

}
