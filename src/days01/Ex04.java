package days01;

/**
 * @author 조은주
 * @date 2021. 3. 8 - 오후 9:33:26
 * @subject 1일-4번 : 자료형(String, int, char)
 * @content 자료형 변수명 [=초기값]; 형태로 정의 
 * 						[ ]는 생략가능
 *
 */
public class Ex04 {
 
	public static void main(String[] args) {

		//String = 문자열 자료형
		//int 자료형 - 정수 자료형
		
		//국어 점수 = 숫자(0 ~ 100 정수값)
		//국어 점수 저장할 변수 선언
		//실수 : 소수표현형
		
		//자바 변수 선언 형식 초기값은 생략가능
		//자료형 변수명[=초기값];
		
		int kor = 98;
		String name = "조은주";
		//자바에서 "" = 문자열String을 나타냄.
		//학점 : A, B, C, D, F 한 문자 (char)
		
		char grade = 'F';
		//char(한 문자)에는 ''붙임 ("" 붙이면 에러)
		
		System.out.println(name);
		System.out.println(grade);
		System.out.println(kor);
	}

}
