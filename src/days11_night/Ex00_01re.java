package days11_night;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex00_01re {

	public static void main(String[] args) {
//1. int [] m = new int[10];
//	    1~20 까지의 정수를 채워넣고 찾을정수를 입력받아서  찾은 모든  위치(index) 값 출력

		int [] m = new int[10];
		fillM(m);
		
		searchM(m);
		
		
		
		
	}//main

	private static void searchM(int[] m) {
	System.out.println("\n찾고자하는 정수를 입력하세요: ");
	Scanner sc = new Scanner(System.in);
	int wants = sc.nextInt();
	int idx = isWantsMatch(m, wants);
	for (int i = 0; i < m.length; i++) {
		if(wants == m[i])System.out.printf("%d는 %d번째 자리에 있습니다.\n", wants, i+1);
	}
	if(idx == -1 )System.out.println("찾으시는 숫자는 본 배열에 없습니다.");
	
	}

	

	private static int isWantsMatch(int [] m, int wants) {
		for (int i = 0; i < m.length; i++) {
			if(wants == m[i]) return i;
		}
		return -1;
		
	}

	private static void fillM(int[] m) {

		Random rnd = new Random();
		
		for (int i = 0; i < m.length; i++) {
			int n = rnd.nextInt(20)+1;
			m[i] = n;
		}
		System.out.println(Arrays.toString(m));
		
		
	}

}//class
