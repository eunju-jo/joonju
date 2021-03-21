package days10_weekend;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 21, 2021 - 3:24:02 AM
 * @subject
 * @content
 *
 */
public class Re_9dayExam06 {

	public static void main(String[] args) {
		//		6.  문제1번에서 찾을 정수(n) 이 여러 개인 경우 찾을 정수(n) 이 있는 모든 위치를 구해서 출력하세요.
		//		  예)  int [] m =  [1] [20] [2] [20] [3] [20] [4] [5] [6] [7]
		//		        n = 20
		//		        이라고 가정하면 
		//		        찾는 위치는             1            3         5   라고 출력.....
		int [] m = new int[10];

		getNum(m);



	}//main

	private static void getNum(int[] m) {
		Random rnd = new Random();
		//m[idx] = n;
		int idx = 0;
		int n;
		while (idx<m.length) {
			n = rnd.nextInt(30)+1;
			m[idx] = n;
			idx++;
			System.out.printf("[%d]", n);
			
			
			if(idx==m.length) findNum(m,n,idx);
		}
		
	
	}

	private static void findNum(int[] m, int n, int idx) {
		System.out.println("찾고자 하는 수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int wants = scanner.nextInt();
	
		
		for (int i = 0; i < m.length; i++) {
			idx = isWantNum(m, wants, i);
			if(wants == m[i]) {
				System.out.printf("%d는 %d번째 자리에 있습니다.\n" , wants, i+1);
			}
		}
		
		if(idx== -1) System.out.println("찾으시는 수는 본 배열에 없습니다.");
		//찾으시는~ 문장 반복적으로 출력되지 않게 하도록 반복문 밖으로 빼고, idx를 isWantNum 메서드로 빼서 -1로 받음
	}

	private static int isWantNum(int [] m, int wants, int i) {

		for (int j = 0; j < m.length; j++) {
			if(wants == m[j]) return j;
		}
		
		return -1;
	}

}//class
