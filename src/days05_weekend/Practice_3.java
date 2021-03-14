package days05_weekend;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {

		//1부터 n까지 합 출력하는 함수 for문으로 출력
		//양수 입력 안하면 잘못해서 프로그램 종료한다고 띄우기
		
		
		System.out.print("임의의 양의 숫자를 입력하세요. 1부터 숫자(n)까지의 합이 출력됩니다. :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		int sum = 0;

		for (int i = 1; i <=n; i++) {
			System.out.printf("%d+",i);
			sum +=i;
		}
		
		if(n <=0) {
			System.out.println("프로그램 종료: 양의 정수를 입력하세요.");
			return;
		}
		
		System.out.printf("\b=%d",sum);
		
		
	}//main

}
