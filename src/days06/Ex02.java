package days06;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 12:10:38 PM
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		//(시험4)	 선 긋는 작업 반복적으로 코딩. 50줄 정도 있다고 가정 -함수(function, procedure)
		//함수 : 반복되는 명령어,코딩들의 묶음을 함수로 만들고 나중에도 처리하기 위함
		//클래스 안에 선언된 함수 : "멤버함수" or "메서드method"라고 부름
		//선 긋는 함수를 선언 + 함수 선언 형식을 알아야 함 


		//구분선 추가
		drawLine(); //dr + 컨스 // 함수 호출
		System.out.println("부서원 : 사원명");
		drawLine();
		drawLine(30);
		System.out.println("생산부 : 강현구");
		System.out.println("총무부 : 권희준");
		System.out.println("영업부 : 김나린");
		System.out.println("생산부 : 김민희");
		drawLine();
		drawLine(20, '#');

	}//main

	//함수 선언 :돌려주는 리턴값 없으면 void. 매개변수도 없다고 가정

	//함수선언부 + 함수호출부분 필요함
	//[접근지정자][기타제어자][리턴자료형] [함수명-기능에 맞게](){
	public static void drawLine() { //함수 선언부
		System.out.println("************"); //50줄

	}

	//ERR:Duplicate method drawLine() in type Ex02 (중복선언)
	//int n 매개변수만 넣어도 에러 안남
	public static void drawLine(int n) { 

		for (int i = 0; i < n; i++) {
			System.out.print("-"); //main에 선언한 n개수만큼 선길이 만들어짐
		}
		System.out.println();
	}

	//매개변수 2개인 중복함수(원하는 모양, 원하는 길이)	 --오버로딩하기 
	public static void drawLine(int n, char style) { 

		for (int i = 0; i < n; i++) {
			System.out.print(style);
 //main에 선언한 n개수만큼 선길이 만들어짐
		}
	}
	
}//class
