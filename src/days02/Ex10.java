package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 3:39:33
 * @subject 리터럴 타입(type)의 접미사
 * @content 정석 32p
 *
 */
public class Ex10 {
 
	public static void main(String[] args) {
		/*
		  논리형 리터럴: true, false
		  정수형 리터럴: 100, 0xFF(16진수 정수)
		  실수형 리터럴: 3.14,    3.0e8      0F
		  문  자  리터럴: 'A'     '\n'-제어문자     '\u0112'-유니코드    // '1'  문자1 둘이 완전히 다름
		  문자열 리터럴: "A" "조은주"										  // "1" 문자열1
		  					ㄴ쌍따는 문자열임. "A" = 'A' + '\0'-끝에 null문자포함 -씨언어내용(이해하라고)
		 */
		
		int i = 0; 	   //4바이트 0
		long l = 0L; //8바이트 0(크기가 다름) 
						  //정수 리터럴 뒤에 +접미사(L)
		float f = 0F; //float(4)
		double d = 0D; // d는 꼭 안붙여도 됨
		//int j = 0F; //float(4) 실수형이라는 소리
	}
}
