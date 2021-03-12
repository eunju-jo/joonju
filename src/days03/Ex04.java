package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 2:19:16
 * @subject 3일-4번: 실수의 2진수 변환
 * @content 정석 p48
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//정수 -> 메모리저장
		// byte 10 =  0000 1010
		//'A' -> 65에 해당하는 정수값 저장 -> 0000 0000 0100 0001
		
		// byte -10 -> 2의 보수법 취함 -> 1111 0111
		
		//3.14 = 실수. float(4)/double(8) 
		//실수값또한 0,1 값(이진수)로 변환되어 들어가야함(48쪽)
		//11 + 0.14
		
		
		//아래는 70p 예제
		
		
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d =9.12345678901234567890f;
		
		System.out.printf("     123456789012345678901234%n");
		System.out.printf("f : %f%n", f);
		System.out.printf("f : %24.20f%n", f);
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d : %24.20f%n", d);
		 
		
		//double을 주로 쓰지만(정밀도가 높아서) 더블 또한 오차가 있다는 것 정도 알아두기
		
	}//main

} //class
