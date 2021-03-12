package days04_prac;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//5의 배수
		
		System.out.print("정수값을 하나 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		
		int y = scanner.nextInt();
		
		switch (y%5) {
		case 0:
			System.out.println("입력값은 5의 배수입니다.");
			break;

		default:
			System.out.println("입력값은 5의 배수가 아닙니다.");
			break;
		}
		
		
	}
}
