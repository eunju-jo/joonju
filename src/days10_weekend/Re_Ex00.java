package days10_weekend;

import java.util.Random;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 4:10:13 PM
 * @subject 로또번호 무작위 뽑기, 프린트. 뽑기에서 중복검사
 * @content
 *
 */
public class Re_Ex00 {

	public static void main(String[] args) {

		int [] lottos = new int[6];
		
		getLottos(lottos);
		printLottos(lottos);
		
		
		
	}//main
	
	private static void printLottos(int[] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%02d]",lottos[i]);
		}
	}

	private static void
	getLottos(int[] lottos) {

		Random rnd = new Random();
		
		
		lottos[j] = (int)(Math.random()*45+1);
		
		
	}


}//class
