package days15;

public class Ex03 {

	public static void main(String[] args) {
		// 클래스, 객체, 인스턴스 구분
//		클래스 : 객체의 설계도
//		객체 : 클래스 타입으로 '선언된' 참조 변수
//		인스턴스 :  (new 연산자로 인해 힙 영역에 생겨난,) **'생성된'** 객체 
//		인스턴스화 : new 클래스() -> 객체를 생성하는 과정 
	
		
		//days15.Car 클래스 선언하고 오는 길
		// 이 설계도면을 가지고 객체를 생성해야 함 , 집을 지어야 사니까,,,,
		
		//자료형 변수명;
		Car myCar = null; // 스택영역에 myCar 가 만들어지고 주소를 담을거임
//		myCar를 변수라고 해도 틀린 말 아님 / 참조변수도 ㅇ / 지역변수도 ㅇ / [객체명]이 제일 커렉트
		
		
//		new 클래스명()	; // 객체 생성하는 코딩
		myCar = new Car();

//		myCar 멤버들(필드,메서드) 사용 시  .멤버(영역)연산자 사용
//		myCar.name = "그랜저2020"; // name 등등 주소값이 myCar에 저장됨 
//		- The local variable myCar may not have been initialized (Car myCar;만 해서 발생)	
		//java.lang.NullPointerException : 널포인터예외 발생
		
		System.out.println("=END=");
		
		//m : 지역변수라고 해도 틀린말 아님 / 변수도 맞음/ 참조변수도 맞음 / [배열명]이 가장 정확한 용어
		int [] m =null; //스택영역에 주소를 참조할 참조변수인데 null을 주면 참조 못함 (배열 선언만 되있음)
//		= new int[5];//가 되어야
		m[0]=100; //null이라 힙영역에 0같은 자리 만들어지지도 않았음 // new연산자로 heap(동적)영역 만들지 않았음

		
		//널포인터 익셉션 언제 발생? - 실제힙영역에 참조하려는 곳이 없을 때 발생 
		
		
	}//mai

}//clas
