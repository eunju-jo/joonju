package days01;

/**
 * @author 조은주
 * @date 2021. 3. 8 - 오후 8:46:13
 * @subject 1일-3번 : 변수의 정의 및 선언, 로컬변수(지역변수)
 * @content 자바의 정석 Ch02 19쪽 변수(variable) 
 * 						-변수 초기화, 변수 재선언
 *					에러메시지 노랑이 복붙해서 주석화해서 달기(질문,피드백 받기 전)
 */ 
public class Ex03 {
	 
	public static void main(String[] args) {
	
		/* 교재 20쪽
		 * 1. 변수(variable)와 상수
		 * 		ㄱ.수학에서의 변수: 변하는 수.
		 * 		ㄴ.프로그램 언어 안에서의 변수: 메모리 공간(값을 저장하기 위한 공간)
		 *	 	(상수: 한번 정하면 다시 바꿀 수 없는 수)
		 * 
		 * 2. 자바에서 변수 [선언 형식]
		 * 		시험칠 때 [접근지정자] 이 대괄호랑 {} 중괄호 명확히 써야 함~!
		 * 		클래스명 = 자바는 대문자로 꼭 시작
		 * 		클래스명 == 파일명
		 * 
		 */
			
		// 이름 저장하는 자료형 : String(문자열)
		// 이름을 저장할 변수 선언 (자료형 변수명;)
		//식별자: 개발자가 마음대로 부여하는 이름
		//개발자가 임의로 부여하는 식별자 종류: 함수명, 변수명, 클래스명
			//변수명도 식별자라고 불러도됨!
			
		String name = "조은주";
		
		//에러메시지: The local variable name may not have been initialized
		// name = 로컬(지역) 변수 => 지역변수는 반드시 초기화 되어야 사용가능함
		
		// 원래 =는 같다지만, 프로그래밍 언어에서의 = '우측에 있는 값을 좌측 기억공간에 할당하겠다(초기화, 대입)'
		// 문자열을 저장할 msg 변수를 선언하고 "hello world"라고 초기화하세요.(문제 예시)
		
		System.out.println(name);
		
		name = "강현구";
		System.out.println(name);
		//새로 강현구 할당하고 출력
		
		String name2 = "권희준";
		// Duplicate local variable name (동일변수명 썼을 때 에러메시지)
		System.out.println(name2);
			
}//main
	
}//class
