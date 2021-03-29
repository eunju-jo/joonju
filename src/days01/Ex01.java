package days01;

import days16.MyPoint;

//import days15.Car;
//The type(클래스도 참조타입 자료형) days15.Car is not visible
//not visible = 은닉화. 숨겨놨다

/**
 * @author 조은주
 * @date 2021. 3. 8 - 오후 9:18:20
 * @subject 수업1일차 첫번째 예제(이후 '1일-1번'형태)  
 * @content 이름 출력
 * 					코드 전체 들여쓰기 세팅( ctrl + i ) 
 * 					main, class 뒷괄호 주석
 *    
 */
public class Ex01 {
	
	public static void main(String[] args) {
//		Car my;
		// Car class가 default시:
		//Car cannot be resolved to a type 
		//같은 패키지내에서는 오류떨어지지 않음
		
		MyPoint p1 = new MyPoint(); // 클래스 자체는 만들어짐 public이니까
		
		p1.x = 10; // public : 어디서든 접근가능
//		p1.y ; // default : 패키지 내에서만 참조/접근가능
//		p1.z ; // private : 그 클래스 내에서만 참조/접근 가
//		p1.z = 100; //The field MyPoint.z is not visible : 접근지정자때매 접근못해서 뜨는거임 

		p1.setZ(100); //이렇게 간접적으로 z값을 끌어올 수 있음
		System.out.println(p1.getZ());
		
		
		System.out.println("END"); 
		
		
		
		System.out.println("조은주");
		
		//ctrl + i : 전체선택 후 적용하면 들여쓰기 자동완성!
		
	}//main

} //class 괄호 잘 못 닫거나 지워서 에러나니 주석처리해놓기