package days07;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 1:47:36 AM
 * @subject 구구단 출력 행 입력 받아 출력,, 밤을 불태웠다
 * @content
 *
 */
public class Ex04_sysin {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("> 구구단을 몇 행으로 출력할까요? ");
		int row = scanner.nextInt();
		int roundUp = (int) Math.ceil((double)8/row);
//		System.out.println(roundUp);

		for (int n = 0; n < row; n++) {
				for (int i = 1; i <=9; i++) {
					for (int j = roundUp*n+2; j <=roundUp*(n+1)+1 && j<=9; j++) {
					System.out.printf(" [%02d * %02d = %02d] ", j, i, j*i);
				}
					System.out.println();
			}
				System.out.println();
		}

		//n단으로 나눌때: n*k+2 ~ n*k+(n+1) 

		//뭐???????????모르겠

	}//main
}
