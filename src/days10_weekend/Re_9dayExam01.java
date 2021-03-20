package days10_weekend;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Re_9dayExam01 {

	public static void main(String[] args) {
		//		1. 정수를 저장할 배열명 m 이라는 배열 선언하고( 배열크기는 10 ), 
		//	    1~20 까지의 임의의 정수를 채워넣는 fillM() 이라는 메서드(함수)를 만들고
		//	    찾을 정수(n)를 입력받아서 m 배열에서 n을 찾아서 찾은 위치를 반환하는 sequenceSearch() 메서드를 
		//	    만들어서 찾은 위치를 출력하세요. 
		//	    ( 찾는 값이 배열에 없으면 -1 을 반환 )


		int [] m = new int[10];

		fillM(m);
		sequenceSearch(m);

	}//main

	private static void sequenceSearch(int[] m) {
		System.out.println("> 위치를 찾기를 원하는 정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int wants = scanner.nextInt();
		
		int idx = isSearchNumMatch(m, wants);
		
		for (int i = 0; i < m.length; i++) {
			if ( m[i] == wants ) {
				System.out.printf("%d(은)는 %d번째에 위치합니다.\n", wants, i+1);
			}
		}
		if(idx == -1) System.out.println("찾으시는 숫자는 본 배열에 없습니다.");
		

	}

	private static int isSearchNumMatch(int[] m, int wants) {
		int idx = -1;
		for (int i = 0; i < m.length; i++) {
			if(wants == m[i]) return i;
		}

		return idx;
	}

	private static void fillM(int[] m) {
		Random rnd = new Random();
		int idx = 0;
		
		while (idx<=9) {
			int n = rnd.nextInt(20)+1;
				m[idx]=n ;
				idx++;
		}
		
		System.out.printf("%s\n", Arrays.toString(m));


	}

	//순차검색해야되니까 일단 중복검증 호출 안하겠음
	private static boolean isNewSame(int[]m, int n, int idx) {
		
		for (int i = 0; i < idx; i++) {
			if(m[i] == n) return true;
		}
		
		return false;
	}

}//class
