package days07;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 2:24:27 AM
 * @subject 문제3. 구구단 가로 세로 단 나눠 출력 
 * @content
 *
 */
public class Prac2 {

	public static void main(String[] args) {

		//가로로 구구단 출력하기
		System.out.println("<가로출력>");
		for (int j = 2; j <=9; j++) {
			for (int i = 1; i <=9; i++) {
				System.out.printf("%02d * %02d = %02d ", j, i, j*i);
			}
			System.out.println();
		}
		
		System.out.println();

		//2단) 2 3 4 5 두 단으로 나눠서 표현 how?
		//	  6 7 8 9
		//두 단으로 나눠 풀기(두단으로 댕가당)	
		System.out.println("<세로출력>");
		for (int d = 1; d <=9; d++) {
			for (int i = 2; i <=5; i++) {
				System.out.printf("%02d * %02d = %02d ", i, d, i*d);
			}
			System.out.println();
		} 
		 System.out.println();
		 
		for (int d = 1; d <=9; d++) {
			for (int i = 6; i <=9; i++) {
				System.out.printf("%02d * %02d = %02d ", i, d, i*d);
			}
			System.out.println();
		} 
		
		
	}//main

}
