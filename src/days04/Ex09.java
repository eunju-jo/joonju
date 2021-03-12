package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 3:31:48
 * @subject 4일-9번: 128쪽 예제3-31
 * @content >>쉬프트 연산자 설명 예제(다시 봐서 헷갈리면 129쪽 보면 이해감)
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF; //10진수로 15
		
		System.out.printf("hex=%X%n", hex); //대문자 16진수 형태 그대로 찍겠다
		System.out.printf("%X%n", hex & mask);// &비트논리연산자 알어??
		// \n = %n 둘다 개행하는 같은 코드
		//int 32비트
		// hex =>1010 (10진수 10)
		// hex   = 10101011 11001101(ABCD)
		// mask = 00000000 00001111  ///이 두개 &하겠다
		//mask = F =15값(10진수로)
		
		
		//뒤에부터 네 비트씩 읽어오겠다
		hex = hex >>4; //오른쪽으로 네칸씩 미니까
		System.out.printf("%X%n", hex & mask);

		hex = hex >>4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >>4;
		System.out.printf("%X%n", hex & mask);
		
		//hex 변수의 뒤에서부터 13번째 비트값이 0 or 1?
		
//		(hex >> 12) & 0x1 //하면 마지막 비트값 끌고 옴???
		System.out.println((hex >> 12) & 0x1);
	}

}
