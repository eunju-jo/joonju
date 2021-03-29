package days14;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조은주
 * @date Mar 25, 2021 - 10:26:49 AM
 * @subject 함수 세웠떤거 완성해보기
 * @content
 *
 */
public class Ex00 {

	public static void main(String[] args) {

		int [] tots = new int[10];
		
		getTots(tots);
		
		//[173, 221, 249, 261, 28, 78, 113, 267, 181, 6]
		// 첫번째랑 다른애들이랑 비교하기 계속하면 됨
		//나는 일단 1등 쟤네랑 비교하다가 내가 작으면 1에다가++ -> 2(등)
		
		int [] ranks = new int[10];
		
//		모든 학생들을 1등으로 초기화하겠음
		
		Arrays.fill(ranks, 1);// 모두 1로 초기화하거나
		//for문 안에 ranks[i] = 1;
/*		
		for (int i = 0; i < ranks.length; i++) {
//			tots[i]// 등수 체크할 학생(0번)	
			for (int j = 0; j < ranks.length; j++) {
//				tots[j] // 총점 비교할 학생들 포문
//				if(i != j) { 정확한 코딩은 주는게 맞지만 성능을 위해 이건 빼겠음
					if(tots[i]< tots[j]) {//내 등수 +1	
						ranks[i]++; //=처음은 모두 1이나 작을수록 ++되서 10등까지 밀리는 것
					}
//				}
			}
		}
//		System.out.println(Arrays.toString(ranks));
*/		
		getRanks(tots,ranks); //내가 세웠던 거
		
		System.out.println(Arrays.toString(ranks));
	}//ma

	private static int [] getRanks(int[] tots, int [] ranks) {
		
		
		Arrays.fill(ranks, 1);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				if(tots[i]<tots[j]) ranks[i]++; 
			}
		}
		return ranks;
	}

	private static void getTots(int[] tots) {
		Random rnd = new Random();
		for (int i = 0; i < tots.length; i++) {
			tots[i] = rnd.nextInt(301);
		}
		
		System.out.println(Arrays.toString(tots));

	}



}//cla	
