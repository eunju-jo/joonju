package days11;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 4:04:02 PM
 * @subject 182쪽 배열 설명 (기본 개념 복습)	
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//배열 선언 형식
//		int [] m; //m == 변수, 참조변수(주소값을 갖는 변수), '배열명'
//		int n [];
		
		//배열 생성
//		int [] m = new int[10];
		
		int [] m  = new int [10]; //선언만 한다면(int []m;)  저장공간 형성되지 않음
		
		m[0] = 100; //int [] m;만 선언시 : ERR: Unresolved compilation problem: 
	
		// 배열의 요소 : 기억공간 하나하나의 저장공간. 인덱스값(첨자) 사용하여 0번째 요소(방), 1번째 요소(방)
		int [] n = new int [3]; //[배열길이]
		n[3] = 100; //ERR: java.lang.ArrayIndexOutOfBoundsException: 3
		//3이면 0~2번 방만 있는데 3번에다가 값 넣어서 에러 (가장 많이 발생하는 에러)	
	
		System.out.println("END");
		
		
		
		
		
		
	}//main
	

}//
