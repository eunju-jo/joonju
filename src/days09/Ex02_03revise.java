package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:23:08 AM
 * @subject 9일 : Ex02파일 수정하는 것 (함수 따로 빼서)
 * @content
 *
 */
public class Ex02_03revise {

	public static void main(String[] args) {

		
		
		int [] lotto = new int[6]; //선언만 하면 기본값(초기값) 0
		
		fillLotto(lotto);
		
		printLotto(lotto);
		
		
		
	}//main

	private static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		}
		System.out.println();
	}

	private static void fillLotto(int[] lotto) {
			
		int n, idx = 0; //1번째 방부터 하면 됨(0번째방은 그전 데이터 확인할 필요 없으니까)
			
		while (idx <=5) { //몇번만에 할지는 모르지만 idx<=5 동안 채우는거
			n = (int)(Math.random()*45 +1);
			System.out.println(n);
				if(! isDuplicateLottoCheck(lotto, idx, n)) { 
					lotto[idx] = n; 
					idx++;
				}
			
		}//while	
		
	
		
	}

	//함수로 빼야 유지보수도, 가독성도 굿
	public static boolean isDuplicateLottoCheck(int [] lotto, int idx, int n) {
		for (int i = 0; i < idx; i++) {
			if(lotto[i] == n )return true;
		}
		return false;
	}
	
	
	
}//class
