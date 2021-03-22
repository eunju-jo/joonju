package days11;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 11:04:27 AM
 * @subject 182p 챕터5 배열
 * @content
 *
 */
public class Ex02_00 {
	public static void main(String[] args) {

		//[함수function]
		//메서드 : 클래스 안에 선언된 함수
		//이벤트 핸들러 : 이벤트가 발생할 때 호출되는 함수
		//프로시저(procedure) : 언어에 따라..
		
		//오버로딩 drawLine() : 같은 이름으로 중복 선언 )) drawLine(int n), drawLine(int n, char s)
		
		//3가지 알아야 함 - 기능, 매개변수, 리턴
		//## 재귀함수
//		1. 재귀 함수의 'recursive'는 ‘원래 자리로 되돌아가거나 되돌아옴'
//		2. 자기 자신을 참조하는 것.
		
		disp(); //함수호출부분
		
	}//main

	
	//재귀 함수 선언부분 (함수 선언부분안에 자기 자신함수를 호출하는걸 다시 선언)	
	private static void disp() {
		System.out.println(">disp() 메서드 호출됨.");
		
		disp(); //함수 호출부분 ---자기 자신을 출력하고 호출하고 무한루프
		
	}
	
}//class
