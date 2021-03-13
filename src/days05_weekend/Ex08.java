package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 11:28:14 PM
 * @subject 5일: return문 통해 제시 조건 외의 값이 들어올 때 프로그램 종료시키기 
 * @content
 *
 */
public class Ex08 {
public static void main(String[] args) {
	
	//1부터 n까지 합 출력하는 함수 for문으로 출력
	//양수 입력 안하면 잘못해서 프로그램 종료한다고 띄우기
	
	int n;
	int sum = 0;
	
	System.out.print("양수를 입력하세요 : ");
	Scanner scanner = new Scanner(System.in);
	
	n = scanner.nextInt();
	
	if (n <= 0) {
		System.out.println("프로그램 종료: 양수를 입력해야 합니다. ");
	return;
	}
	
	for (int i = 1; i <=n; i++) {
		sum+=i;
		System.out.printf("%d+", i);
	}
	System.out.printf("\b=%d\n",sum);
	
	
	
}
}
