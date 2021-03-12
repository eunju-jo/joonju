package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 12:10:44
 * @subject 3일-3번_02 자동형변환, 강제형변환 설명 (3-2 tot값 구하며 추가설명)
 * @content 74쪽
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

//		* 형변환 : Str -> i, Str ->불린
//		
//		1. 자동 형변환
		
		int a = 5;
		
		long d = a; // long = int   [][][][][][][][] = [][][][] 더 큰 자료형에 변수 할당하면 자동으로 자료형 변환
		long b = 7;
//		= 대입(할당) 연산자
//		우측항의 값을 좌측항(변수)에 할당(대입)
//		좌측항 = 우측항
//		우측항 먼저 연산
//		int a + long b    = long
//		[][][][]   [][][][][][][][]
//		작은 자료형 + 큰자료형 연산 => 자동으로 형변환 되어 큰 자료형long으로 출력
		
		long c = a+b;
		
		System.out.printf("%d + %d = %d", a, b, c);
		
//		2. 강제 형변환 - [cast 연산자] 강제 형변환
		
//		float f = 3.14; //기본적으로 숫자는 int(정수)와 double(실수)로 인식함
		//ERR: Type mismatch: cannot convert from double to float
		
//		좌측(float)보다 우측(double)이 더 커서 자동형변환X
		//해결 1: float f = 3.14f;
		//해결 2: float f = (float) 3.14;
		

		
	}

}
