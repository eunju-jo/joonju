package days12;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 4:13:40 PM
 * @subject 책 예제 5-13 16진수 표만 있으면 출력 가능하다
 * @content
 *
 */
public class Ex05_bookEx {

	public static void main(String[] args) {

//		char [] hex = { '1', '2', 'C', 'A', 'F', 'E', '0' };

		System.out.print("16진수 형태로 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String hexString = sc.next().toUpperCase(); //소문자로 들어와도 대문자로 처리해서 에러 안나게
		char [] hex = hexString.toCharArray(); //String ->char[]배열로 바꾸기(오전에 한거)	
		
		// [결과]
//		16진수 형태로 입력하세요: 12AF
//		hex:12AF
//		binary:0001001010101111

		
		// 0      1        2      3
		String [] binary = { "0000", "0001", "0010", "0011", 
							"0100", "0101", "0110", "0111",   // 4 5 6 7  
							"1000", "1001", "1010", "1011",   // 8 9 A(10) B(11)
							"1100", "1101", "1110", "1111" }; // C(12) D(13) E(14) F(15)
		
		String result ="";
		
		for (int i = 0; i < hex.length; i++) {
			if (hex[i]>='0' && hex[i] <='9') {
				result += binary[hex[i] -'0']; //'8'-'0'의 결과는 8	
			} else {			//-48 대신에 '0'하는게 더 편하겠음
				result += binary[hex[i] -'A'+10]; //'C'-'A'의 결과는 2	
			}								//A가 10부터니까 알파벳 가라고
		}
									//String(char[] value)
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);
	}

}
