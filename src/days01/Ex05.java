package days01;

/**
 * @author 조은주
 * @date 2021. 3. 8 - 오후 9:37:18
 * @subject 1일-5번 : 대입연산자, 변수 나열
 * @content	대입연산자(=)는 오른쪽->왼쪽 순서규칙인 것 유의!
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 국어, 영어, 수학을 저장할 변수를 선언하세요.(100으로 초기화)
		
		/* 이렇게도 가능하고
		 * int kor =100;
		 * int eng =100;
		 * int mat =100;
		 */
		
		/* 이렇게도 가능은 함 (복잡헐뿐..)
		 * int kor; 
		 * int eng;
		 *  int mat;
		 * 
		 * kor = 100; 
		 * eng = 100; 
		 * mat = 100;
		 */
		
		
		
		int kor, eng, mat;
		
		kor = eng = mat = 100;
		
		//	, 콤마연산자 - 나열할 때
		// 대입연산자 91p 이해해야 함(오른쪽->왼쪽 순서로 연산)
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}

}
