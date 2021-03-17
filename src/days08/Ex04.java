package days08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		
		
/*		System.out.println("현재 몇 월인지 숫자로 입력하면 계절이 출력됩니다: ");
		Scanner scanner = new Scanner(System.in);
		int month= scanner.nextInt();
		
		if(1<=month && month<=12) {
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		default:
			System.out.println("현재 계절은 겨울입니다.");
			break;
		}
		
		} else {
			System.out.println("입력오류. 정당한 월을 입력하세요: ");
		}
*/

		int month = 12;
		//배열의 초기화
		 String [] season = {"겨울", "봄", "여름", "가을", "겨울"};
//		 3으로 나눈 몫 =           0,   1,    2,     3,    4
		System.out.println( season[month/3]);  //season[3]의 3에 수식넣은 것
		 
//	for (int i = 1; i <=12; i++) {
//		System.out.printf("%d월- %d \n",i , i/3);
//	}
		
		
	}
	
	
}
