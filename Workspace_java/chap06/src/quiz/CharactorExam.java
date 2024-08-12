package quiz;

public class CharactorExam {

	public static void main(String[] args) {
		Charactor nam = new Charactor("남현우");
		Charactor park = new Charactor("박경민");
		
//		park.hit(nam.attack());
		
//		int dam = nam.attack();
		boolean isAlive = park.hit(nam.attack());
		if(isAlive) {
			park.hit(nam.attack());
		}
		
	}

}
