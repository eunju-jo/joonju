package days10_weekend;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Re_9dayExam01_re {

	public static void main(String[] args) {
		//		1. 정수를 저장할 배열명 m 이라는 배열 선언하고( 배열크기는 10 ), 
		//	    1~20 까지의 임의의 정수를 채워넣는 fillM() 이라는 메서드(함수)를 만들고
		//	    찾을 정수(n)를 입력받아서 m 배열에서 n을 찾아서 찾은 위치를 반환하는 sequenceSearch() 메서드를 
		//	    만들어서 찾은 위치를 출력하세요. 
		//	    ( 찾는 값이 배열에 없으면 -1 을 반환 )
		// 순차검색 연습용이기도 하니 중복검증 하지 말것
		
		int [] m = new int[10];
		
		fillM(m);
		
		sequenceSearch(m);
		
	}

	private static void sequenceSearch(int[] m) {
		System.out.println("> 검색하기를 원하는 숫자를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		int wants = scanner.nextInt();
		
		int idx = isWantsNum(m, wants);
		
		for (int i = 0; i < m.length; i++) {
			if(wants==m[i]) System.out.printf("%d는 %d번째 자리에 있습니다.\n", wants, i+1);
		}
		if(idx == -1) System.out.println("찾으시는 숫자는 본 배열에 없습니다.");
		
	}

	
	private static int isWantsNum(int[] m, int wants) {
		for (int i = 0; i < m.length; i++) {
			if(wants == m[i]) return i;
		}
		
		return -1;
	}
	

	private static void fillM(int[] m) {
		int n;
		int idx=0;
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			n  = rnd.nextInt(20)+1;
			m[i] = n;
		}
		
		System.out.println(Arrays.toString(m));
		
	}

}
