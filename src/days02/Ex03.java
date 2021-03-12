package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오전 11:26:12
 * @subject 2일-3번 : 표준 출력 함수
 * @content System.out. print() /println() / printf() 
 *			%s 문자열 출력서식 
 *			%c 한 문자 출력서식 
 *			%d 정수 출력서식
 *			%f 실수 출력서식(기본:소수점 6자리까지 출력)
 */
public class Ex03 {

	public static void main(String[] args) {

		System.out.print("조은주\n"); 
			// ("조은주" +'\n')으로 안해도됨
		System.out.print("이소정\n");
		System.out.print("김두란");
		System.out.println(); //개행만 하겠다
		System.out.printf("김두란"); //이렇게도(printf) 가능은 함
		
		/*
		 * [결과] 
		 * 조은주 
		 * 이소정 
		 * 김두란 
		 * 김두란
		 */
		
		//println() 과 print()의 차이점 : 줄바꿈(개행) 여부
		//println() = print() + 줄바꿈(\n)
		
		//printf("출력형식(%s, %d 등)" [,출력값...])
		
		// println에서 ln 삭제
		// alt + shift + a : 한번에 블록처리해서 지우고, 쓸 수 있는 툴! 
		//그대로 다시 누르면 하면 풀림
		
		// 이클립스 단축키 서치/정리해서 메일로 과제 제출
		
	}//main

}//class
