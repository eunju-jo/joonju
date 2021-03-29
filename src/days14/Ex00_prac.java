package days14;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조은주
 * @date Mar 25, 2021 - 10:09:46 PM
 * @subject 난수 발생시켜서 랭킹 매기기 + 수석(top)출력
 * @content
 *
 */
public class Ex00_prac {

	public static void main(String[] args) {
		//[173, 221, 249, 261, 28, 78, 113, 267, 181, 6]
		// 첫번째랑 다른애들이랑 비교하기 계속하면 됨
		//나는 일단 1등 쟤네랑 비교하다가 내가 작으면 1에다가++ -> 2(등)
		
		int [] tots = new int [10];
		
		getTots(tots);
		
		int [] ranks = new int[10];
		
		getRanks(tots, ranks);
		
	
	
	}//main

	private static void getRanks(int[] tots, int[] ranks) {
		Arrays.fill(ranks, 1); ///일단 다 1등 먹이기
		
		for (int i = 0; i < ranks.length; i++) {//나
			for (int j = 0; j < ranks.length; j++) {//쟤
				if(tots[i]<tots[j])	ranks[i]++;
			}
		}
		System.out.println("\n[순위]");
	System.out.println(Arrays.toString(ranks));
	

	for (int i = 0; i < ranks.length; i++) {
		if(ranks[i] == 1 ) System.out.printf("수석 : [%d]번 학생", i+1);
	} 
	
//01 12 23 34 45 56 67 78 89 910
	
	
//	System.out.printf("1등 : %d", top);
	}

	private static void getTots(int[] tots) {
		Random rnd = new Random();
		
		for (int i = 0; i < tots.length; i++) {
			tots[i] = rnd.nextInt(300)+1; //1-300 사이 난수
		}
		
		System.out.println(Arrays.toString(tots));
		
		
	}

}//class
