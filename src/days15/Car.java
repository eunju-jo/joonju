package days15;

//신형 차를 만들기 위한 클래스 선언(설계)	
public class Car { 


//abstract 는 클래스 앞에 위치
	//Illegal modifier for the class Car; only public, abstract & final are permitted
	
	//이 안의 모든 것 : 멤버
	//멤버 : 변수(필드) & 함수(메서드)	

	// 필드
	int speed;
	String name;
	boolean flag;
}
	
//중첩클래스 
//	protected class{	
//	private static final class Point{ 접근지정자 뒤에 여러개 올수 있고 기타제어자 순서는 상관없음
//	private final static class Point{ 
		

//}	


	/*
class Point{
//public class Point{ [ERR] The public type Point must be defined in its own file
//한 파일에는 public이 한개만 가능함. 자바 파일명 Car와 똑같은 거 한개=Car 클래스만 가능함
//얘는 퍼블릭 주면 안됨
	
} */
