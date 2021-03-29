package days16;

import java.util.ArrayList;

public class Ex12 {

	public static void main(String[] args) {

		/* 시험(암기)
		[this 키워드] 객체의 주소를 참조하는 변수 우리가 만든적 없음 
		1. 정의 : 변수. 객체의 주소값을 갖는 참조 변수
				(클래스 자기 자신의 주소값을 갖는 참조 변수)
		2. 참조변수?
			int [] m ; //배열명 참조변수
			Car myCar; //객체명도 참조변수 --this는 이런 종류
			myCar.color = "";
			객체명.필드
			객체명.메서드()
			
		3. this가 사용되는 3가지 용도
			ㄱ. 클래스(객체)의 멤버(필드,메서드)를 가리킬 때의 this	
				this.필드
				this.메서드()
			ㄴ. 생성자에서 또다른 생성자를 호출할 때의 this
			ㄷ. 홀로 사용될 때의 this : 인자(argument), 리턴값
		*/
		
		Person p1 = new Person("kenik", 20, "서울", "010");
		//>20 constructor
		//>50 constructor
		//>20 constructor
		//> name : kenik, age : 20  --> 또다른 생성자들도 호출해서 초기화 되는 그런,,, 

		Person p2 = new Person("kenik", 20);
		p1.dispPerson();
		
		
		//Q. 가변인자를 생성자에 사용못하나?
		//생성자의 역할: 필드를 초기화 하는 목적.
		//Object...args
		//문법적으로 오류는 안나지만은.. 쓸일은 없을듯....함..
		
		
		
		
	}//mai

}//clas

class Bus{
	Person [] p = new Person[10];
	
	Bus(){
		
	}
	
	Bus(Person person){ //버스 생성자 안에 퍼슨 객체가 옴
		p[0] = person;
	}
}

class Person  {
	
	//fields
	String name;
	int age;
	
	String addr;
	String tel;
	//총 필드 엄청 많다고 가정 밑에 이십개 초기화했다고 가정 
	
	//constructor
	Person(){}
	public Person(String name, int age, String addr, String tel) {
//		this.name = name;
//		this.age = age;
//		
		this(name, age); //여기서 또다른 생성자를 호출하겠다 얘 -> Person(String name, int age){
		
		this.addr = addr;
		this.tel = tel;
		System.out.println(">50 constructor");
	}
	Person(String name, int age){ //kenik이 String n 에 할당됨.
		this(); //꼭 첫줄에 해야 에러 안남
		//The assignment to variable name has no effect (name = name; 시)
		this.name  = name;
		//명확하게 이 클래스	 필드 명의 네임이다 this	
		//앞에 네임은 위에 필드에 네임
		this.age = age;
		System.out.println(">20 constructor");
	}
	
	//method
	void dispPerson() {								//함수 호출한 그 객체의 네임
		System.out.printf("> name : %s, age : %d \n", this.name, this.age	);
		//여기선 this안써도 됨
		
//		this.//쳐서 목록 나오는건 멤버들임
		
	}
	
}


