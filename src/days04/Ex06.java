package days04;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 2:19:10
 * @subject 삼항연산자=  (조건) ? true : false
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		//삼항연산자 형태 : 항1(조건식) ? 항2(참) : 항3(거짓)
		//삼항연산자(항의 개수) -일항, 이항, 삼항
		//조건연산자
		
		//expression = 식. 연산자와 피연산자를 조합하여 계산하고자 하는 바를 표현한 것.
		//evaluation= 식의 평가. 식의 계산 결과
		//조건식 : (조건)참.거짓으로 판단할 수 있는 +(식)연산자와 피연산자를 조합한 것.

//		int x = 100;
//		int y = x>50 ? 10 : 20; //조건식이 참이면 10, 거짓이면 20
//		System.out.println(y);
		
		//[문제] 두 정수를 입력받아서 큰 수, 작은 수를 출력하세요
		// [입력] > 두 정수를 입력하세요?
		// 입력값 : 10,20
		//[출력결과]
		//>큰 값: 20
		//>작은 값:10
		
		System.out.print(" > 두 정수를 입력하세요 ?");
		
		Scanner scanner = new Scanner(System.in);
		
		String value = scanner.next();
		String [] values = value.split("\\s*,\\s*");
		
		int x, y;
		
		x = Integer.parseInt(values[0]) ;
		y = Integer.parseInt(values[1] ); 
		
		System.out.println("[출력결과]");
//		System.out.printf("> 큰 값 : %d \n", x<y? y : x);
//		System.out.printf("> 작은 값 : %d", x>y? y : x);

//		int max = x > y?  x : y; //변수 선언해서 넣어야 더 가독성 좋음
//		int min = x>y? y : x;
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		//보통 코딩땐 'Math 클래스' 사용함
		// Math.max(a, b) _ java.lang.Math 클래스(import구문 필요X)
		
		System.out.printf("> 큰 값 : %d \n >작은 값: %d \n", max, min);
		
		//삼항연산자 조건 없으면 굳이 이렇게 안풀어도됨
		
		
	

		
	}

}
