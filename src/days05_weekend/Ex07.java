package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 11:22:53 PM
 * @subject 5일 : return;
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {

		int number;

		System.out.println("정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();

		if (number==0) {
			System.out.println("프로그램을 종료합니다.");
			return; //main 함수를 빠져나감 == 프로그램 종료.
		}


		System.out.println("!! 0을 입력하셔야 합니다 !!");



	}//main

}
