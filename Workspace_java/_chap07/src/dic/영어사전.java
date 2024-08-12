package dic;

public class 영어사전 extends 사전 {
	String 영[] = new String[]{"Love","Friendship","none"};
//	영어사전() {
//		this.사전 = "한영사전";
//	}

	String a;
	@Override
	void 펼침(String a) {
		this.a = "한영사전";
		System.out.println("모르는 단어가 있어서 " + a + " 사전을 펼침");
	}

	String 찾기(String l) {
		for (int i = 0; i < 번역.length; i++) {
			if (l.equals(번역[i])) {
				System.out.println(영[i]);
			}
		}
		return l;

	}
//String 찾기1(String f) {
//	f=번역[1];
//	System.out.println(번역[1]);
//	return f;
//}
//
//String 찾기2(String non) {
//	non=번역[2];
//	System.out.println(번역[2]);
//	return non;
//}
//	
}
