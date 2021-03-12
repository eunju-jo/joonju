package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오전 10:22:06
 * @subject 2일-1번: 변수 선언 및 초기화
 * @content 자바의 정석 p22~
 *				 	플러스(+) 연산자 역할
 *					(덧셈 / 문자열 연결 )
 */
public class Ex01 {

	public static void main(String[] args) {

		//년도를 저장할 변수 year라고 선언 후 올해 년도를 초기화
		int year = 2021;
		year = year + 1; // 정수 + 정수 => 정수(덧셈)
		// '=' : 저장공간에 대입하겠다
	
		System.out.println(year);
		
		//메시지라는 문자열을 저장할 msg 변수 선언
		String name = "조은주";
		String msg = "안녕하세요.";
		String result = name + msg;  

		System.out.println(result);
		//문자열 + 문자열 => 문자열 연이어 출력  "조은주안녕하세요."
		
		
//		 4+3                    +연산자 : 덧셈연산자
//		"문자열"+"문자열"     +연산자 : 문자열 연결 연산자
//		형태는 +로 동일하지만 둘이 다른거라는 소리
		
		
		//문자열 + 숫자?
		System.out.println(name+year);
		// -> "조은주2022"  문자열 연결 연산자로 사용되지더라!
	}

}
