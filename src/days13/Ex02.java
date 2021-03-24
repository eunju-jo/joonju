package days13;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 12:41:45 PM
 * @subject 214쪽 다차원 배열
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		// 1차원 배열 - 열 값만으로 구성
		// 2차원 배열 - 행, 열로 구성
		// 3차원 배열 - 면, 행, 열로 '각 요소'를 나타냄
		// 4차원 배열 - 권?, 면, 행, 
		//타입 [] [] = ;
		
		int [] m = new int[8];
		
//1차원 배열 : 열column로만 각 요소를 나타내는 배열
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\t", i, m[i]);
			//m[0]=0	m[1]=0	m[2]=0	m[3]=0	m[4]=0	m[5]=0	m[6]=0	m[7]=0	
			//index(첨자값) LowerBound(아랫첨자값) ~ UpperBound(윗첨자값)
		}
		
//2차원 배열 - 행row, 열column
		//2행 4열 2차원 배열 m이라고 부름.
		
		int [][] mm = new int[2][4]; //new int[행][열];
		
		
		//4반에 30명씩 있을때 
		int [] kors = new int [120]; //4반*한 반 삼십명 kors[0] ~ kor[119]
		int [][] korsEachClass = new int[4][30];
		//korsEachClass[0][0] ~ korsEachClass[3][29] 
		

//3차원 배열 - 면,행,열  ----3차원부턴 쓸일 많지 않음..
		//2면 2행 2열 3차원 배열 m	
		int [][][]mmm = new int[2][2][2];
		
		//방 개수는 모두 8개로 같으나 표현되는 방 모양이 달라질뿐임
		
		//1-3학년 4반에 30명씩 있을때
/*		int [] kors = new int [3*4*30];
		int [][] kors = new int [3][4][30];
*/		
		//2학년 3반 15번 학생 국어점수
//		kors[30*4 + 30*2 + 14] -1학년치 120개 + 2학년 1-2반 + 14번까지 
//		kors[1][2][14]; -0부터 시작하니까 각 번호 -1하면 더 심플
		
		
		//2학년 1반 국어 평균
		//1차원시 : kors[120] ~ kors[149];
		//3차원시 : kor[1][0][0] ~ kor[1][0][29]; 열만 for문 돌리면 되니 관리가 훨씬 쉬움
	}//ma

}
