package days05_weekend;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 8:35:24 PM
 * @subject 5일
 * @content
 *
 */
public class Ex01 {
	public static void main(String[] args) {

		//i--로도 사용가능(꼭 i++의 형태 아니어도 되고 i+=2도 됨)
		int sum = 0;
		for (int i = 10; i >= 1; i--) {
			System.out.printf("%d, \b", i);
			sum += i; }
		
		
		//1~10까지 합 출력 for문으로
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum +=i;
			System.out.printf("%d + ",i);
		}
		System.out.printf("\b= %d\n" , sum);

	}//main
}