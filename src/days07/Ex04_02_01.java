package days07;

import sun.security.util.Length;

public class Ex04_02_01 {

	public static void main(String[] args) {

		//<세로로 2 3 4 5단 차례로 찍기>
		for (int k = 1; k <=9; k++) {
			for (int i = 2; i <=9; i++) {
				System.out.printf(" [%02d * %02d = %02d] ", i, k, i*k);
			}
			System.out.println();
		}
		divid('-', 140);
		System.out.println();	 		
		
		//가로찍기
		for (int n = 2;  n<=9; n++) {
			for (int m = 1; m <=9; m++) {
				System.out.printf("[%02d * %02d = %02d] ", n, m, n*m);
//				if(n==2 && m==9) System.out.println(Index);
				
			}
			System.out.println();
		}

		
	}//main

	private static void divid(char s, int n) {
		for (int i = 0; i < n; i++) {
		System.out.printf("%c" ,s);
		}
		
	}
}//class
