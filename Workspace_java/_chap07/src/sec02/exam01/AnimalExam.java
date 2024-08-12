package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
	
 Dog dog=new Dog();
 Cat cat=new Cat();
 
// dog =cat; 미스매치
 
 Animal a1 = (Animal)new Dog();
 Animal a2 = new Cat();

 //a1 = a2; 같은 타입이니까 가능
		
a1.sound();
//a1.walk();
//dog.walk();
// walk를 사용하려면
//dog.walk();를 사용해야 하거나, 애니멀 클래스에 walk메소드를 만들고 오버라이드를 해야 함.
//이렇게 불러오면 부모에 있는 메소드 자체만 사용가능.
a2.sound();

Animal a3= new Animal();
a3.sound();

 

	}

}
