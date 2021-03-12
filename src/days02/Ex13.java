package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 4:47:02
 * @subject
 * @content 정석 p57
 * 					특수문자(\t, \n, \', \" 등)
 *
 */
public class Ex13 {
 
	public static void main(String[] args) {

		// p55 문자형 : char(유니코드 2바이트) 
		// '역슬래시 u 16진수값 2바이트' 
		// '역슬래시u' = 유니코드 2바이트 문자값이라는 뜻
		// 넘긴다고요? '\u0FFA' 뭐게,,
		
		// p59-61 인코딩과 디코딩(encoding & decoding)
		
		char ch = 'A';
		System.out.printf("%d \n", (int) ch);
		System.out.printf("%c", ch);
		//ch = '\u0041'  도 A
		//메모리상 저장 0/1 2진수
		//8비트로 찍힐 규칙이 있어야 할 것 같음
		// -> '문자코드표'
		// 'A'       코드값(65)           0000 0000
		// 인코딩encoding: 문자('A')를 코드로 변환
		// 디코딩decodind: 코드를 문자('A')로 변환
		
		//유니코드(2바이트) : 전세계말 다들어가 있음
		//아스키코드ASCII : 미국 체계라 한글 없고 A B C 에 대한,,
		// ㄴ> 128개에서 256개로 확장됨
		
		
		//실수
		//형변환
		//책 84까지 나갔꼬 낼은 chap03?2? 연산자부터하고 제어문도 조금 할듯
	}

}
