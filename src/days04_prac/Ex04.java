package days04_prac;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		
		int x = 10;
		
		System.out.print("정수값을 하나 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if (x==y) {
			System.out.println("기존값과 입력 값은 일치합니다.");
		} 
		if (x!=y) {
			System.out.println("기존값과 입력 값은 일치하지 않습니다.");
		}
		
	
	}
}
