package days16;

public class Ex09 {
	public static void main(String[] args) {
		//p291 생성자 constructor	
/*		((암기))
 		1. 메서드명이 클래스명과 동일하다
		2. [객체 생성될 때 new 클래스명()] 자동으로 호출된다(임의적으로 호출불가)
		3. 매개변수가 없는 생성자를 디폴트 생성자라고 부름.
		4. 오버로딩이 가능함
		5. 역할 : 필드 초기화 
		6. 상속되지 않는다
		7. 리턴자료형 X인 함수의 일종 --void란 말조차도 안붙임
		8. 접근지정자 4가지 종류 모두 사용 가능
*/		
		//p1 객체생성 필드 초기화 1,2
		//p2 객체생성  3,4
		//p3 객체생성  5,6

		//객체 생성과 동시에 초기화도 하고 싶다 --> 생성자의 역할
		
		
/*
 	  	MyPoint.p1 = new MyPoint();
		p1.x = 1;
		px.y = 2;
	
		MyPoint.p2 = new MyPoint();
		p2.x = 3;
		p2.y = 4;
		
		MyPoint.p3 = new MyPoint();
		p3.x = 5;
		p3.y = 6;
		
		p1.dispPoint();
		p2.dispPoint();
		p3.dispPoint();
	
		*/
		
		MyPoint p1 = new MyPoint(1,2);
		p1.dispPoint();
		
		
		//The constructor MyPoint(int) is undefined
		MyPoint p2 = new MyPoint(100);
		p2.dispPoint();
		
	}
	

}
