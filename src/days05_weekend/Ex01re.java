package days05_weekend;

/**
 * @author 조은주
 * @date Mar 13, 2021 - 9:16:59 PM
 * @subject 5일-for문: i--;,1+2+..10+에서 마지막 +지우기(\b)
 * @content
 *
 */
public class Ex01re {

	public static void main(String[] args) {

		//i--로도 사용가능(꼭 i++의 형태 아니어도 되고 i+=2도 됨)
		int sum = 0;
		for (int i = 10; i >= 1; i--) {
			System.out.printf("%d, \b", i);
			sum += i; }
		
		System.out.println();
		
		//1~10까지 합 출력 for문으로

		for (int i = 1; i <= 10; i++) {
			sum +=i;
			System.out.printf("%d + ",i);
		}
		System.out.printf("\b= %d\n" , sum);
		// "\b" : backspace. 마지막 +는 필요없으니 지우는 
		
		
	}

}
