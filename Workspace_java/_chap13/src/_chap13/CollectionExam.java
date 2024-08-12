package _chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new  ArrayList();
		System.out.println(list.isEmpty());
		
		list.add("10");
		int a = 20;
		list.add(a);
		list.add(true);
		System.out.println(list.isEmpty());
	
		list.add(1, 123);
		
		int b =(Integer)list.get(1);
		System.out.println(b);
		System.out.println(list.size());
		System.out.println(list.toString());
//		list.get(1);
		//초기화 
		list.clear();
		list= new ArrayList();
		
		Map map = new HashMap();
		//추가
		map.put("k1", 10);
		map.put("abc", list);
		
		int k1 = (int)map.get("k1");
		System.out.println(k1);
		
		//키가 없으면 null
		System.out.println(map.get("k2:"));
		
		map = new HashMap();
		map.put("제목", "사건의 지평선");
		map.put("가수", "윤하");
		map.put("가수", "yoon ha");
		list.add(map);
		System.out.println(list);
		
		map = new HashMap();
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");
		map.put("가사", "바람이...");
		list.add(map);
		System.out.println(list);
		
		//제네릭 generic
		//추가할 자료형을 제한하는 용도로 쓰인다.
		//리턴 타입이나 전달인자의 타입을
		//선언 할 때 변경할 수 있게 하는 기술
		List<String> list2 = new ArrayList<String>();
		list2.add("글씨");
		//list2.add
		//제네릭이 있는 경우 꺼낼 때 형 변환을 알아서 해준다
		//제네릭이 있는 경우 꺼낼 때 형변환을 알아서 해준다.
		String str = list2.get(0);
		
		//제네릭에는 int는 사용할 수 없음. 클래스만 가능
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("키값", 1);
		int a2 = map2.get("키값");
	}
	


}
