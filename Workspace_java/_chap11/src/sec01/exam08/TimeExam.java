package sec01.exam08;

public class TimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time = System.currentTimeMillis();

			System.out.println(time);
			
			for(int i=0; i<1000000000; i++) {}
			
			System.out.println(System.currentTimeMillis()-time);
	}

}
