package days06;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 2:12:52 PM
 * @subject 6일: 두 정수의 합을 구해서 반환하는 함수(메서드)를 선언하고 호출하는 예제
 * @content
 *
 */
public class Ex03_00 {

	public static void main(String[] args) {

		//두 정수의 합을 구해서 반환하는 함수(메서드)를 선언하고 호출하는 예제
		// 1. 기능: 두 정수의 합을 계산해서 반환하는 함수
		// 2. 매개변수: 두 정수 int a, int b
		// 3. 리턴자료형(리턴값): int
		
		//함수 선언 -> 후 호출하는게 편함
		
		int a = 10, b = 20;
//		int result = a + b ;
		int result = hap(a, b); //하고 노란창 누름 메소드 틀 자동으로 만들어짐
		//윗줄은 함수 호출부분(여기에는 값만. int 이렇게 선언할필요x)
		System.out.printf("%d+%d=%d\n",a,b,result);
		int n = getNumber();
		System.out.println(n);
		n = getNumber();
		System.out.println(n);
		n = getNumber();
		System.out.println(n);
		
	}//main

	
	public static int getNumber() {
		System.out.println("정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return  num;
	}


	//함수 선언부분(자동으로 틀 생기면 Return 뒤에 원하는것만 넣으면 됨
	private static int hap(int a, int b) {
		return a+b	;
	}
	
	
	//함수명: getNumber
	//
	
	
	
	
	

}//class	
