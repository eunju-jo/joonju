package days13;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 8:24:15 PM
 * @subject 기존 로또 함수 main 함수만 수정해서 이차원 배열 [][] 개념 이해
 * @content [wants][] wants자리 -행
 *
 */
public class Ex07_02lotto {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int gameNumber = 1;
		System.out.println("게임 횟수를 입력하세요: ");
		gameNumber = sc.nextInt();
		
		int [][] lottos = new int[gameNumber][6]; 
		
		//lottos.length = 행 개수 = gameNumber
		//이 개념을 이해해야 쉽게 풀 수 있음
		//뒤의 [6]은 기존 1차원 배열과 동일 - 열 개념
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		}
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d게임: ", i+1);
			printLotto(lottos[i]);
		}
	

		//2차원 배열 - 배열의 배열//for문 돌리면서 게임횟수만큼 로또


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
//			System.out.println(n);
			if(! isDuplicateLottoCheck(lotto, idx, n)) { 
				lotto[idx] = n; 
				idx++;
			}

		}//while	



	}

	public static boolean isDuplicateLottoCheck(int [] lotto, int idx, int n) {
		for (int i = 0; i < idx; i++) {
			if(lotto[i] == n )return true;
		}
		return false;
	}



}//class
