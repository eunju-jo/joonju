package days07;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 2:37:03 PM
 * @subject 7일 ; 구구단을 외자
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//구구단(==곱셈표, multiplication table) 출력

		/*		//2단출력
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n", 2, i, 2*i);			
		}
		System.out.println();

		//3단출력
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n", 3, i, 3*i);			
		}              */


		//중첩 for문 사용
		/*		for (int d = 2; d <=9; d++) {
			System.out.printf("[%d단]\n",d);
			for (int i = 1; i <=9; i++) {
				System.out.printf("%02d * %02d = %02d ", d, i, d*i);
				//두자린데 빈자리 0	[가로로 구구단 출력하기]
			}             
			System.out.println();
		} */

		// 2-1 2-2 2-3
		// 3-1 3-2 3-3
		//가로로 구구단 출력하기
//		System.out.println("<가로출력>");
//		for (int j = 2; j <=9; j++) {
//			for (int i = 1; i <=9; i++) {
//				System.out.printf("%02d * %02d = %02d ", j, i, j*i);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();

		
		// 2-1 3-1 4-1
		// 2-2 3-2 4-2

		//커서위치이동,,안되는거 왜 말해줘요,,,
		
		//가로세로 출력 그냥 i,d 숫자자리랑 1,2만 바꿔주면 됨..	
		//세로로 구구단 출력하기(내가 걍 쓴거)

		//d=1 i=2~9

//		int divI = i/n;
		
		// 8개/2 -> 2345 6789
		
		
		//2단) 2 3 4 5 두 단으로 나눠서 표현 how?
		//	  6 7 8 9
		//두 단으로 나눠 풀기(두단으로 댕가당)	
/*		System.out.println("<세로출력>");
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
*/
		//k=0일 땐 start2 end6 (start + 3 = end)
		//k=1일 땐 star6 end9
//		234
//		567
//		89
//		
		
		//4*k+2 (k가 0,1일 때 위랑 일치)
		//삼중 for문으로 2단
//		for (int k = 0; k < 2; k++) {
//			System.out.println(k);
//			for (int d = 1; d <=9; d++) {
//				for (int i = 4*k+2; i <=4*k+5; i++) {
//					System.out.printf("%02d * %02d = %02d ", i, d, i*d);
//				}
//				System.out.println();
//			} 
//		}
		
//		3단:3k+2 3k+4
		//삼중 for문으로 3단 (break 안하면 10단도 출력됨)	
		for (int k = 0; k < 3; k++) {
			System.out.println(k);
			for (int d = 1; d <=9; d++) {
				for (int i = 3*k+2; i <=3*k+4; i++) {
					System.out.printf("%02d * %02d = %02d  ", i, d, i*d);
					if(i == 9) break;
				}
				System.out.println();
			} 
		}
		
		//강사님 파일에 10단 안찍는거 break;말고 다른 방법 확인
		
		
		
		
	}//main

}//class
