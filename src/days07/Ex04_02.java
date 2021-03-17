package days07;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 3:42:44 PM
 * @subject 단 수 입력받아서 구구단 나눠 출력
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		//> 여기서 n단? 입력해서 원하는 단대로 찍기 하라고 하시는데 모르겠음 답 안알려주신다고 함 ㅎ
		//캡쳐 참고 (뒷부분 문제가 잇다네여,,))	 뒷로직은 강사님거 참고
		//함수세워서 main에서 for문 돌리는것도 낫배드
		
		//앞에 있던 3단 나누는거
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

//		2 3 4 5 
//		6 7 8 9
//		4k+2   4k+5( n+3)
		
//		2 3 4
//		5 6 7
//		8 9
//		3k+2   3k+4 (n+2)
		
		
//		2 3
//		4 5
//		6 7
//		2k+2   2k+3 (n+1)
		
	//n단으로 나눌때: n*k+2 ~ n*k+(n+1) 
	
	// 8/ row;	
	
/*	Scanner scanner = new Scanner(System.in);
	System.out.println("> 몇 단씩 출력하시겠습니까?: ");
	int row = scanner.nextInt();
		
					//4번찍어야됨
	for (int n = 0; n < 4; n++) {
	System.out.printf("%d%s\n",n,"번째");
	 for (int i = 1; i <=9; i++) {
 		for (int j = 2*n+2; j <=2*n+3; j++) { 
			System.out.printf(" %02d * %02d = %02d  ",j, i, j*i);
		}
		System.out.println();
	 }
	}
	
*/	
	
		
		
	}//main	

}//class
