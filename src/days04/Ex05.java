package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 2:09:45
 * @subject 4일-5번: >> << shift 연산자(산술연산자 중)
 * @content
 *
 */
public class Ex05 {
	public static void main(String[] args) {

		// 산술 연산자(기능) >> <<
		// 비트 연산자인 "쉬프트shift 연산자"

		System.out.println(10 >> 2); //결과값: 2
		System.out.println(10 << 2); //결과값: 40
		
		//2진수로 표현해서 비트 앞뒤로 미는 것
		
		
		System.out.println(10 >>>2); 
		//오른쪽은 세개짜리도 있음
		//다 0으로 채움
		
	}
}
