package days11;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 10:02:38 AM
 * @subject
 * @content 순차검색 입력받고 위치 출력하기(아침문제)
 *
 */
public class Ex00_01 {

	public static void main(String[] args) {
//1. int [] m = new int[10];
//	    1~20 까지의 정수를 채워넣고 찾을정수를 입력받아서  찾은 모든  위치(index) 값 출력
		int [] m =new int[10];
		fillM(m);
		searchM(m);
		
		
		
	}//main

	private static void searchM(int[] m) {
		System.out.println("\n검색할 숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int findNum = scanner.nextInt();
		int idx = isFindNum(m, findNum);

		for (int i = 0; i < m.length; i++) {
			if(findNum == m[i]) System.out.printf("%d는 %d번째 자리에 있습니다.\n", findNum, i+1);
		}
		if(idx == -1) System.out.println("찾으시는 숫자는 본 배열에 없습니다.");
	}

	private static int isFindNum(int[] m, int findNum) {
		for (int i = 0; i < m.length; i++) {
			if(findNum == m[i]) return i;
		}
		return -1;
		
	}

	private static void fillM(int[] m) {
		
		Random rnd = new Random();
		int n;
		for (int i = 0; i < m.length; i++) {
		n = rnd.nextInt(20)+1;
		m[i] = n;
		System.out.printf("[%d]",n);
		}
	}

}//class
