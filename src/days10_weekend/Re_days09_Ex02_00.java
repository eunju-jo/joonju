package days10_weekend;

import java.util.Random;

public class Re_days09_Ex02_00 {

	public static void main(String[] args) {

		
		int [] lotto = new int[6];
		
		getLotto(lotto);
		printLotto(lotto);
		
		
		
	}//main

	private static void printLotto(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		}
		
	}

	private static void getLotto(int[] lotto) {
		int n;
		int idx=0;
		//lotto[idx] = n;
		
		while (idx<=5) {
			n = (int)(Math.random()*45+1);
			System.out.print(n +" "); //중복제거하기전 버전 확인용
			if( !isLottoSame(lotto, idx, n) ) {
				lotto[idx]=n;
				idx++;
			}
		}

		
	}

	private static boolean isLottoSame(int[] lotto, int idx, int n) {
		for (int i = 0; i < idx; i++) {
			if(n == lotto[i]) return true;
		}
		
		return false;
	}

	
	
}//class
