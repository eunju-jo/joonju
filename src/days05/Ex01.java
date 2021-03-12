package days05;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 10:44:32
 * @subject 아침 연습문제 7-1. 7-2
 * @content7-2. 정수를 입력받아서 짝수(even number), 홀수( odd number) 라는 문자열을 출력하는 코딩을 하세요.
*   조건) 삼항연산자 사용   
*7-2. 정수를 입력받아서 짝수(even number), 홀수( odd number) 라는 문자열을 출력하는 코딩을 하세요.
*  조건) 삼항연산자 사용   
 *
 */
public class Ex01 {
	public static void main(String[] args) {

		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력하세요. : ");
		
		n = scanner.nextInt();
		
//		System.out.println(n);

		//if문 두개 사용한 문제점? 무조건 2번 if문을 처리한다는 것
		if (n%2==0) System.out.println("even number");
		if (n%2!=0) System.out.println("odd number");

		
/*		//이것도 { } 없어도 가능
		if (n%2==0) {
			System.out.println("even number");
		} else { //그 외의 경우
			System.out.println("odd number");
		}*/
		
		
		//가독성 더 좋음
		String result;
		if (n%2==0) {
			result = "even";
		} else {
			result = "odd";
		}
		System.out.println(result);
		
		
		//삼항으로 할 때
		result = n%2 ==0? "even num" : "odd num";
		
		
		//scanner.close();
	}//main
	
}