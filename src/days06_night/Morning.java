package days06_night;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 7:57:43 PM
 * @subject 6일: 입력된 두 정수 사이의 짝수들의 합을 출력하기 	
 * @content
 *
 */
public class Morning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력된 두 정수사이 짝수만	출력하는 것 	
		
		int n,m;
		
		System.out.println("두 정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int sum=0;
		
		for (int i = min; i <=max; i++) {
			if (i%2!=0) {
				continue;
			}
			sum += i;
			System.out.printf("%d+",i);
		}
		
		System.out.printf("\b=%d\n",sum);
	}

}
