package days06_night;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//두 정수의 합을 구해서 반환하는 함수(메서드)를 선언하고 호출하는 예제
		// 1. 기능: 두 정수의 합을 계산해서 반환하는 함수
		// 2. 매개변수: 두 정수 int a, int b
		// 3. 리턴자료형(리턴값): int
		
		//함수 선언 -> 후 호출하는게 편함
		int n = getNum();
		
		System.out.println("결과값: " +n);


		
	}

	private static int getNum() {
		System.out.print("두 정수의 합: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = a + b;
		return result;
	}

}
