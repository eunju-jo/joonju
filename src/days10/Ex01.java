package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 6.  문제1번에서 찾을 정수(n) 이 여러 개인 경우 찾을 정수(n) 이 있는 ""모든 위치""를 구해서 출력하세요.
//		  예)  int [] m =  [1] [20] [2] [20] [3] [20] [4] [5] [6] [7]
//		   n = 20
//		  이라고 가정하면 
//	      찾는 위치는             1        3         5   라고 출력.....

	int [] m = new int[10];
	Random rnd = new Random();
	for (int i = 0; i < m.length; i++) {
		m[i] = rnd.nextInt(20)+1;
	}

	
	System.out.println(Arrays.toString(m)); //배열에 담긴거 출력
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("> 찾고자하는 정수? : ");
	int n = scanner.nextInt();
	
//	int idx = sequenceSearch(m,n);    
	

	int [] x = sequenceSearch(m, n);
	System.out.println( Arrays.toString(x) );
	
//	System.out.println(idx);
	
	}//main  
	
	// return이 아니라 void로 처리해버리면 이함수는 찾는 용도 외에 다른 용도로 더 쓸수가 없음.
	// --> main 함수에서 return 값으로 다른 연산에 더 활용할 수 없다는뜻. 그러니 리턴으로 하는게 좋음
	private static int [] sequenceSearch(int[] m, int n) {
		int [] x = new int[ m.length];
		
		/*
		for (int i = 0; i < m.length; i++) {
			x[i] = -1;
		}
		*/
		Arrays.fill(x, -1); // x배열 안에 전부다 -1로 채우겠다 (밑에랑 같은 코딩)
		
		for (int i = 0, j=0; i < m.length; i++) {
			if(m[i] == n) {
				x[j] = i;
				j++;
			}
		}
		
		return x;
	}
 
}
