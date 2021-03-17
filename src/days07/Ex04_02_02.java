package days07;

public class Ex04_02_02 {
	public static void main(String[] args) {

		// 2 3 4 5 
		// 6 7 8 9 이렇게출력
//		4k+2 4k+5

		//2단 
/*		for (int m = 0; m < 2; m++) {
			for (int k = 1; k <=9; k++) {
				for (int i = 4*m+2; i <=4*m+5; i++) {
					System.out.printf(" [%02d * %02d = %02d] ", i, k, i*k);
				}
				System.out.println();
			}
		} */

		
//		2 3 4 
//		5 6 7
//		8 9
		//3단 3k+2 3k+4
/*		for (int m = 0; m < 3; m++) {
			for (int k = 1; k <=9; k++) {
				for (int i = 3*m+2; i <=3*m+4 && i<=9; i++) {
//					if(i == 10) break;
					System.out.printf(" [%02d * %02d = %02d] ", i, k, i*k);
				}
				System.out.println();
			}
			System.out.println();
		} */
		

//		2 3    2k    2k+1 
//		4 5
		
		for (int m = 0; m < 2; m++) {
			for (int k = 1; k <=9; k++) {
				for (int i = 4*m+2; i <=4*m+5 && i<=9; i++) {
					System.out.printf(" [%02d * %02d = %02d] ", i, k, i*k);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}//main
}
