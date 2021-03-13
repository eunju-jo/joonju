package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 11:38:41 PM
 * @subject
 * @content
 *
 */
public class Ex09 {
	public static void main(String[] args) {

		//두 정수를 입력받아서 두 정수 사이의 합을 출력
		// n, m을 입력받고 2,5 엔터
		// > 2+3+4+5=14
		
		int n,m;
		
		System.out.print("두 정수를 입력하세요(스페이스로 구분) : ");
		Scanner scanner = new Scanner(System.in);
		
		n= scanner.nextInt();
		m= scanner.nextInt();
		
/*이렇게 굳이 한번에 받아서 쓰려면 bufferedreader 쓰는게 나음
//scanner 쓰는게 scanner.nextInt();로 바로 쓰려는 것
				
		String str = scanner.next(); //*.nextLine();으로 잘못씀
		String [] strarr = str.split("\\*s,\\*s"); 
				
		n = Integer.parseInt(strarr[0]);
		m = Integer.parseInt(strarr[1]); */ 
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			sum +=i;
			System.out.printf("%d+",i);
		}
		System.out.printf("\b=%d\n",sum);
				
		

		


	}//main
}
