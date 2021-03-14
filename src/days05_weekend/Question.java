package days05_weekend;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 3:41:10 PM
 * @subject 복습하면서 보다가 구문옮기면 어떻게 되나 궁금해서 실험한것
 * @content
 *
 */
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;

		while (true) {
			++count;
			System.out.printf("%s-%d ", "홍길동",count);
			//이거를 If절안에 넣으면 안되나? 궁금해서 해봤는데
			//아무것도 실행안됨.. count>=10이라는 조건이 참이 안되기 때문!

			if (count >=10) {
			System.out.println("\n프로그램 종료.");break;
		}

		}
	}

}
