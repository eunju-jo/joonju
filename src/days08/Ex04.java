package days08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		int months;
		System.out.println("몇 월인지 숫자로 입력하면 계절이 출력됩니다: ");
		months = scanner.nextInt();
		//배열의 초기화
		String [] season = {"겨울", "봄", "여름", "가을", "겨울"};
//		 3으로 나눈 몫 =           0,   1,    2,     3,    4
//		System.out.println( season[months/3]);  //복잡해보이지만 배열첨자 season[3]의 3에 수식넣은 것
		
		System.out.println( season[months/3] ); //결과: 봄 (3입력시)	 
		
		switch (months/3) {
		case 1:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 2:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 3:
			System.out.println("현재 계절은 가을입니다.");
			break;
		case 0: case 4:
			System.out.println("현재 계절은 겨울입니다.");
			break;

//			System.out.printf("현재 계절은 %s 입니다.",seoson);

		
//몫 확인용		
/*	for (int i = 1; i <=12; i++) {
		System.out.printf("%d월- %d \n",i , i/3);
	}
*/
	//결과 : 각 월을 12로 나눈 몫.
	//	1월- 0 
	//	2월- 0 
	//	3월- 1 
	//	4월- 1 
	//	5월- 1 
	//	6월- 2 
	//	7월- 2 
	//	8월- 2 
	//	9월- 3 
	//	10월- 3 
	//	11월- 3 
	//	12월- 4 

		
		
	}
	
	
	}
}
