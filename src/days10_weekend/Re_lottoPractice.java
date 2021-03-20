package days10_weekend;

public class Re_lottoPractice {

	public static void main(String[] args) {


		int [] lotto = new int[6];

		getLotto(lotto);

		printLotto(lotto);

	}//main

	
	private static void printLotto(int [] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]",lotto[i]);
		}
		
	}

	private static void getLotto(int[] lotto) {
		//lotto[idx] = n;
		
		int idx = 0, n;
		
		while (idx<=5) {
			n = (int)(Math.random()*45+1);
			System.out.print(n + ". ");
			if( !isLottoSame(lotto, idx, n) ) {
				lotto[idx]=n;
				idx++;
			}
		}
		
		
	}


	private static boolean isLottoSame(int [] lotto, int idx, int n) {

		for (int i = 0; i < idx; i++) {
			if(n == lotto[i]) return true;
		}
		
		//위에 포문 다 돌고도 true를 반환하지 못한다 == 중복이 없다
		return false;
	}


}//class
