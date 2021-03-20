package days10;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 3:25:42 PM
 * @subject 책 172쪽
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean flag = true;

	int num;
	int sum = 0;
	
	while(flag) {//true라 무한루프 -> false가 되면 총합을 찍을 것
		System.out.println("> 합계 처리할 정수를 입력하세요(0 입력시 프로그램 종료): ");
		num = scanner.nextInt();

		if(num == 0 ) flag = false; // 0 입력하면 그만 뜨고멈춰서 밖에서 합계출력할 것 	
		else {
			sum += num;
		}
		
	}
	System.out.printf("\n* 합계: %d\n", sum);
	System.out.println(" = END =");
	}

	
}
