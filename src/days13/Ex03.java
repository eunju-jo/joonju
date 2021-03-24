package days13;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 2:30:48 PM
 * @subject
 * @content
 *
 */

public class Ex03 {

	public static void main(String[] args) {
/*		//1차원 배열
		
		//1차원 배열의 초기화
//		int [] m = new int[8];
		int []m = {1,2,3,4,5}; //int [] m = new int[] {1,2,3,4,5};를 생략한 것 
		//1차원 배열의 배열 크기 = 배열명.length
		System.out.println(m.length); //8
		//1차원 배열의 윗첨자값upperBound : 배열크기-1
		System.out.println(m.length-1);
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d  ", i, m[i]);
		}
*/
		

/*		//2차원 배열 
  
 		//2차원 배열 int [] m [] or int m[][] 이렇게도 씀
		//int [][] m = new int[4][2];
		//2차원 배열의 초기화
		int [][] m = { //이렇게 예쁘게 표현하기도 하고 한줄로 죽 쓰기도 함
						{1,2}, 
						{3,4}, 
						{5,6}, 
						{7,8} 
					};
		//2차원 배열의 크기
		System.out.println(m.length); //행의 크기 - 4 출력
		System.out.println(m[0].length); //0행의 열 크기 - 모두 2 출력 (아이패드 캡쳐 참고)
		System.out.println(m[1].length); //1행의 열 크기
		System.out.println(m[2].length); //2행의 열 크기
		System.out.println(m[3].length); //3행의 열 크기
		
		//2차원 배열 출력 (차원 수만큼 for문 필요)	
		for (int i = 0; i < m.length; i++) { //행 4
			for (int j = 0; j <m[i].length; j++) { //열(or 별 개수)2
				System.out.printf("m[%d][%d]=%d ",i,j, m[i][j]);
			}
			System.out.println();
		}
*/
		
//		//3차원 배열
//		int [][][] m = new int [2][3][4];
		//3차원 배열의 초기화
		int [][][]m = {
						{
							{1,2,3,4},
							{5,6,7,8},
								
						}, 
						{
							{9,10,11,12},
							{13,14,15,16}	
						}
				
					};
		
		//3차원 배열의 크기 new int [2][3][4]; 일시
//		System.out.println(m.length); // 면의 크기 -2	
//		System.out.println(m[0].length); // 행의 크기 -3
//		System.out.println(m[1].length); // 행의 크기 -3	
//		System.out.println(m[0][0].length); // 열의 크기 -4	
//		System.out.println(m[0][1].length); // 열의 크기 -4
//		System.out.println(m[0][2].length); // 열의 크기 -4	
		
		//3차원 배열의 출력
		for (int i = 0;  i< m.length; i++) { //면
			for (int j = 0; j < m[i].length; j++) { //행 
				for (int j2 = 0; j2 < m[i][j].length; j2++) { //열 
					System.out.printf("m[%d][%d][%d]=%d ",i,j,j2,m[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//
		
		
		
		
		
		
	}//ma

}