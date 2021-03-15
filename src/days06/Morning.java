package days06;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 10:18:16 AM
 * @subject 입력된 두 정수사이 짝수만	출력하는 것 	
 * @content
 *
 */
public class Morning {

	public static void main(String[] args) {
		
		
		
		int n, m;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요: ");
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int sum=0;
		
		
		//요 식이 추가되서 하는거, 다시 복습 
		if(min%2==1) min++;
		for (int i = min; i <= max; i+=2) {
			sum+=i;
			System.out.printf("%d+",i);
		}
		System.out.printf("\b=%d\n",sum);
		

/*		//문자의 출력값
		
		System.out.printf("[%c][%d]",' '+7,(int)' '+7);
		
		// 'A' 65
		// 'a' 97
		// ' ' (공백)32값.
		// ' (') 39
	
		
		System.out.println(' '+7); */
	}//main

		

		
	}


