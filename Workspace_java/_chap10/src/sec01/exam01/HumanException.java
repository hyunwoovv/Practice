package sec01.exam01;

public class HumanException extends Exception {

	
	HumanException(){
		System.out.println("HumanException 생성자 실행");
	}
	HumanException(String message){
		super(message);
		System.out.println("HumanException String 전달인자 생성자 실행");
	}
	
	void human(int e) throws HumanException,Exception{
		System.out.println("human 실행 : e "+e);
		if(e<5) {
		throw new HumanException("EC05");}
		else if(e>10) {
			throw new HumanException("EC10");
		}else{System.out.println("5이상 10이하로 정상입니다.");}
	}
}
