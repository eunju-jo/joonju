package days13;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 3:12:55 PM
 * @subject 동적 배열
 * @content
 *
 */
public class Ex04 {
	public static void main(String[] args) {

		//동적 배열 : 프로그램 돌리며 나중에 결정되게 할 수 있음
		
/*		int [] ladder;
		int size;
		System.out.print(">사다리 인원수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		ladder = new int[size];
		
		System.out.println(ladder.length);
*/		

		//216쪽 예제 5-18
		
		//4행 3열 2차원배열
		int[][] score = {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40}
				
						};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
//				sum += score[i][j]; 이렇게 더하면 되는데 굳이 향상된 for문 쓴건 이유가 있음
			}
			System.out.println();
		}
		
		//확장 for문 ****
		//캡쳐한 별표 그림 이해하자는 뜻(교재그림)	그림 보고 이해 필요
		for (int[] temp : score) { //그림상 score[0] = temp [0]에 속하는 배열
			for (int i : temp) {
				sum += i;
			}
		}
		
		System.out.println("sum=" +sum);
		
	}
}
