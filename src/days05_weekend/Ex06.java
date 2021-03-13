package days05_weekend;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 10:17:33 PM
 * @subject 5일: for (int i = 1; i <= 10; i+=2)
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		// 1- 10 까지의 홀수의 합 출력
/*		int sum = 0;

		for (int i = 0; i <= 10; i+=2) {
			
			sum +=i;
			System.out.printf("%d+",i);
		}
		System.out.printf("\b=%d\n",sum);
*/
		
/*		int sum = 0 ;
		for (int i = 1; i <= 10 ; i++) {
			if( i%2==0)  continue;
			// 만약에 i 가 짝수라고 한다면 출력X, 누적X 
			// ->  명령 {}  끝내고  i++ 증감식으로 바로 가세요. 
			// if( i==5 ) break; 5까지만 더하고 싶다면! 
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
*/
		
		
		//while문 사용해 1~10=55출력. 
		//continue문 써서 짝수의 합 구하세요.
		//continue 앞의 조건이 맞지 않으면 뒤에는 실행되지 않음
		
		int sum = 0, i=0;
		
		while (i++<10) {
			if (i%2!=0) { //홀수이면 continue로 인해 구문 실행 X(경제적) 
				continue;
			}
			sum+=i;
			System.out.printf("%d+",i);

		} System.out.printf("\b=%d\n", sum);
		
		
		

	}//main

}
