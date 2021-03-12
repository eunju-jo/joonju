package days05;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오후 2:33:19
 * @subject return문
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {

		int number;
		
		System.out.print("정수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		if (number==0) {
			System.out.println("프로그램 종료.");
			return; //main 함수를 빠져나간다 --> 프로그램 종료.
		}
	
	System.out.println("잘못된 번호");
	
	
	}

	
	
	
}
