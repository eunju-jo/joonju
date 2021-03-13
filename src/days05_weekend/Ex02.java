package days05_weekend;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 9:16:55 PM
 * @subject 5일- for문 작성시 자주하는 실수
 * @content 조건 뒤에 실수로 ; 찍는 경우
 * 			종료 조건 등 > 부등호 잘못찍는 경우 
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		int sum = 0;

		//습관처럼 ; 찍다가 포문(조건)뒤에도 ; 찍게되면 
		//포문은 조건만 남고 뒷 괄호는 별개의 개념으로 쳐져서 반복은 실행 전혀 안됨 
		for (int i = 1; i < 10; i++) ; 

		{
			System.out.println("test");	
		}
		//이렇게하면 그냥 syso 문장만 출력 띡 끝
		
		//[자주하는 실수]
		// for문은 참일 때 실행됨.
		// 조건 부등호를 잘못하면(거짓이면) 반복 전혀 실행안
		// i[1]             1>=10 거짓
		for (int i = 1; i >= 10 ; i++)    
		{
			System.out.printf("%d+", i);
			sum += i;
		}		
		
		System.out.printf("\b=%d\n", sum );
		
	}

}
