package days09;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 10:07:55 AM
 * @subject 아침 문제 풀이
 * @content
 *
 */
public class Ex00 {

	public static void main(String[] args) {

		//입력된 행수만큼 이등변삼각형 출력하기
/*		System.out.println("행 수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int end = row-1; //이 규칙만 찾으면 됨
		int end2 = 1;
		
		 
		for (int i = 1; i<=row; i++) {
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <=end2; j++) {
				System.out.print("*");
			}
			end--;
			end2+=2;
			System.out.println();
		}

*/	
		
		
		//int의 각 자리 받아서 1+2+3..+7=sum 출력하기.
		
		int money = 1234567;
		int sum = 0;
		
		//moneyS.charAt(i) == char
		//'0' = 아스키 48  --> -48 하면 맞는 숫자가 나옴
		//'1' = 아스키 49(char)
		
// [1]아스키 코드 값인 '0'=48빼서 처리하기
		String moneyS = money+""; // "1234567"
		int len = moneyS.length(); // 7
		for (int i = 0; i < len; i++) {
			sum += moneyS.charAt(i)-48; //'0'=아스키48 '1'=아스키49니까 -48하면 1
			System.out.printf("%s + ",moneyS.charAt(i)-48);
		}
		System.out.printf("\b= %d\n" , sum);
		//결과: 1 + 2 + 3 + 4 + 5 + 6 + 7 + = 28
		

//[2] %10값(=7) 얻고난 후 /10값(=123456) 대입 (몫이 0이 아닐때까지만 반복)	

		while (money != 0) { //money%10해서 나온 몫이 0이 아닐 때까지(마지막 1까지 나오고 그다음부턴 안돌릴 것)	
			System.out.printf("%d + ", money % 10);
			sum += (money %10);
			money = money / 10; //이게 윗줄로 가면 7이 빠져서 21이 나옴. 나온 나머지 sum에 더해놓고 다음 연산
		}
		System.out.printf("\b= %d\n" , sum);
		//결과 : 7 + 6 + 5 + 4 + 3 + 2 + 1 + = 28 
		
		
		
/*		위에서 이 작업을 반복할 것. money의 나머지가 0 이 아닐 때까지
		
			System.out.println( money % 10 ); // 7
			System.out.println( money / 10 ); // 123456
			money = money / 10;				  
		
		계속 돌리다보면 몫1, 나머지2 -> 몫0,나머지1 나오고 //(여기부터 노쓸모)그다음 0,0 나옴 -> money ==0이니까 while안돌음
		나머지가 0까지 오면 필요없음. 나머지로 마지막 값을 하나씩 얻어서 취하려는 거니까 (7,6,5,..	get)
		
*/
		
	}//main


}
