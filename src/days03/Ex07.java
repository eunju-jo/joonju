package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 3:25:40
 * @subject 3일-7번: ch03 연산자(operator) 86p
 * @content
 *
 */

public class Ex07 {

	public static void main(String[] args) {
		//메인함수부터 프로그램이 시작되서 메인함수에 쓰는 거

		//연산자operator: 연산을 수행하는 기호(+. /등)
		//피연산자operand : 연산이 되는 작업대상(변수, 상수, 리터럴, 수식)

// [1] 산술연산자 : + - * /
		System.out.println(3+5); //산술연산자이자 이항연산자
		int x=3, y=5;
		System.out.println(x+y);
		
		//System.out.println(3+true);
		//ERR:The operator + is undefined for the argument type(s) int, boolean
		//얘네 둘은 못더한단 소리

//		System.out.println(3 *5); //15
//		System.out.println(3 / 5); //int/int = int(0)정수값으로 나옴
//		// 몫 연산자라고 흔히 함. 3.54면 결과로 몫 3이 나오니까
//		System.out.println(3%5); //나머지 연산자(%)

//		산술연산자 주의사항*
//		/나누기나 %나머지 구할 때 '0'으로 나누기 하거나 나머지 구하면 오류나거나 에러 생김
	
//		System.out.println(3 / 0);
//		ERR: Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at days03.Ex07.main(Ex07.java:36)
		
		System.out.println(3.14 / 0);
		//[결과] Infinity (라는 리터럴값이 나옴)
		System.out.println(3.14 % 0);
		//[결과] NaN (Not a Number라는 리터럴값이 나옴)

	}//main

}//class