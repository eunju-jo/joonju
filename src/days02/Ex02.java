package days02;
 
/**
 * @author 조은주
 * @date 2021. 3. 9 - 오전 10:39:29
 * @subject 2일-2번 : 문자열 연결 출력
 * @content 자바정석 22p
 *					문자열 + 변수 연결 출력 예시
 *					" ",   ' ' 출력하기
 *					개행(줄바꿈)
 *					printf 형식 출력
 */
public class Ex02 {

	public static void main(String[] args) {

		String name = "조은주";
		int age = 20;
		char grade = 'A';
		
		//문자열 + 문자열 = 문자열 연결
		System.out.println("이름은 \""+ name + "\"이고, 나이는 " + age + "이고, 학점은 '" + grade + "'이고, 몸무게는 " + 65.7  + "입니다.");

		//실행결과:   이름은 "조은주"이고, 나이는 20이고, 학점은 'A'입니다.
		//  \"  : " 출력
		//  \'   : ' 출력
		//	\n  : 줄바꿈(개행)

		//" "랑 ' ' 출력하기
		//자바에서 "문자"열
		
		System.out.printf(" 이름은 \"%s\"이고, 나이는 %d이고, 학점은 '%c'이고, 몸무게는 %f 입니다.", 
												name, age, grade, 65.7);
		
		//printf : 형식대로 출력. 훨씬 가독성 좋음
		// 실수 f : 소수점 6자리까지 출력이 기본. 소수점 이후 설정은 나중에!
		// args = 매개변수
		
	}//main

} //class