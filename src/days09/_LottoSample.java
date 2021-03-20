package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:33:27 PM
 * @subject 로또 번호 : 난수 발생시키기+중복제거(fillLotto), 발생된 난수 출력(printLotto)
 * @content Ex02
 *
 */
public class _LottoSample {

	public static void main(String[] args) {


		int [] lotto = new int[6]; 

		fillLotto(lotto);

		printLotto(lotto);


	} // main

	private static void printLotto(int[] lotto) { 
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		}
		System.out.println();
	}

	// 1~45 임의의 수(난수)를 lotto 배열에 채워넣는 메서드(함수)
	private static void fillLotto(int[] lotto) {

		int n, idx = 0;

		while ( idx <= 5 ) {
			n = (int)( Math.random()*45 ) +1;
			System.out.println( n );
			// 로또번호 중복체크
			if(! isDuplicateLottoCheck(lotto, idx, n)) { 
				lotto[idx] = n; 
				idx++;
			}         
		} // while

	}
	//복잡한 구문은 함수로 또 빼야 가독성이 좋음(중복체크)
	public static boolean isDuplicateLottoCheck(int [] lotto, int idx, int n) {
		for (int i = 0; i < idx; i++) {
			if(lotto[i] == n )return true;
		}
		return false;
	}
} // class
