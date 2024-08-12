package dic;

public class 사전Exam {

	public static void main(String[] args) {
		
		영어사전 eng= new 영어사전();
		일어사전 jap=new 일어사전();

		
		
		
		eng.펼침("한영사전");
		
		eng.찾기("우정");
		jap.찾기("사랑");
		eng.찾기("꿻");
	}

}
