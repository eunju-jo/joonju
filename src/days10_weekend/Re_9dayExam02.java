package days10_weekend;

import java.util.Arrays;
import java.util.Random;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Re_9dayExam02 {

	public static void main(String[] args) {
//		2. 로또 번호 6개를 저장할 lotto 배열을 선언하고 
//	    로또 번호를 배열에 채워넣는 fillLotto() 메서드 선언		
//		로또 번호를 출력하는 printLotto(); 메서드 선언
//		중복 체크 하는 isDuplicateLottoCheck() 메서드 선언    

		int [] lotto = new int[6];
		
		fillLotto(lotto);
		
		printLotto(lotto);
		
		
		
	}//main

	private static void printLotto(int[] lotto) {
		
			System.out.printf(Arrays.toString(lotto));
	
		
	}

	private static void fillLotto(int[] lotto) {
		Random rnd = new Random();
		int idx = 0;
		while (idx<lotto.length) {
			int n = rnd.nextInt(45)+1;
			if( !isDuplicateLottoCheck(lotto, n, idx)) { //n이 중복되지 않는지 확인하는 함수 선언
				lotto[idx]=n;
				idx++;
			}
		}
		
		
	}

	private static boolean isDuplicateLottoCheck(int[] lotto, int n, int idx) {
		for (int i = 0; i < idx; i++) {
			if(n == lotto[i]) return true; //새로 받은 수 n이 앞의 lotto[0~n-1]과 같은가? 같으면 true 
		}
		
		return false; //for문 다 돌동안 true 반환 못하면 중복 없는 것 == 중복이 없다는 뜻
	}

}//class
