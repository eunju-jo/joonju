package days05_weekend;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice_4 {

	public static void main(String[] args) {
		//두 정수를 입력받아서 두 정수 사이의 합을 출력
		// n, m을 입력받고 2,5 엔터
		// > 2+3+4+5=14
		
		int n, m;
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요: ");
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int sum = 0;
		
		for (int i = min; i <=max; i++) {
			sum+=i;
			System.out.printf("%d+",i);
		}
		
		System.out.printf("\b=%d\n", sum);
	
	}

}
