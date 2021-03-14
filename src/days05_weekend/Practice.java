package days05_weekend;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 9:23:27 PM
 * @subject 연습해보기:for문 while문으로 홍길동 10번찍기
 * @content
 *
 */
public class Practice {

	public static void main(String[] args) {

		//홍길동 열번찍기 while로, for로


		//for
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s-%d ", "홍길동", i);
		}

		System.out.printf("\n%s","출력완료.");
		System.out.println();
		System.out.println();


		//while문
		
		int i = 0;
		while(++i<=10) {
			System.out.printf("%s-%d ","홍길동",i);
		}
		System.out.printf("\b\n%s","출력완료.");





	}//main
}
