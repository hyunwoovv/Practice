package quiz;

public class UpDownExam {

	public static void main(String[] args) {
	
		UpDown ud= new UpDown();
		ud.initNumber();
		ud.hint();
		ud.answer(5);
		//return이 있었다면 저 재미있고 정교하게 가능.
		ud.answer(7);
		ud.answer(9);
		ud.answer(3);

	}

}
