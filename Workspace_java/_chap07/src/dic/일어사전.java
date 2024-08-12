package dic;

public class 일어사전 extends 사전 {

	String[] 일 = new String[] { "あいしてる", "友情", "ふかち" };



	@Override
	void 펼침1(String b) {
		b = "한일사전";
		System.out.println("모르는 단어가 있어서 " + b + " 사전을 펼침");
	}

	String 찾기(String l) {
		for (int i = 0; i < 번역.length; i++) {
			if (l.equals(번역[i]))
				System.out.println(일[i]);
		}
		return l;
	}

}
