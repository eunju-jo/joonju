package days05_weekend;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 10:02:05 PM
 * @subject 5일: sum += i++; 형태
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//1+2+3..+10 = 55 while문 사용 
/*		int sum = 0, i=0;
		
		while (i<10) {
			sum += i++; //sum+=i; i++; 을 이렇게 하나로도 표현가능
			System.out.printf("%d+", i);
		}
		System.out.printf("\b=%d\n", sum);
*/		
		
		//while(조건)안에 ++연산자 넣기
		
		int sum=0, i=0;
		
		while (i++<10) {
			sum+=i;
			System.out.printf("%d+",i);
		}
		System.out.printf("\b=%d\n",sum);
		
		
		
	}//main

}
