package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 3:24:33
 * @subject 상수constant와 리터럴literal
 * @content 리터럴대신 상수(변수) 써야하는 이유!
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		//리터럴: A, true, false, 3.14 등 그 값 자체
		
		// final boolean gender = true;
		//상수 = 또한 메모리 공간, 한 번 초기화 후 '고정'.
//		final int II = 3;  II=5; 가 안된다는 말
//			ㄴ> 의미가 더 명확해지고 다른값으로 계산할 때도 상수의 초기화만 새로 해주면 됨
//		반드시 선언과 동시에 초기화 필요
		final double PI = 3.141592;
		  //상수화 시키는 과정(선언 후 ctrl+f로 대체). 대문자로 변수 표기
		  
		  int 가로 = 10, 세로 = 20;
	      int 사각형면적 = 가로 * 세로;
	      System.out.println( 사각형면적 );
	      
	      // 원 면적 , 원 둘레
	      int 반지름 = 34;
	      double 원면적 = 반지름 * 반지름 * PI;
	      System.out.println(원면적);
	      
	      반지름 = 34;
	      원면적 = 반지름 * 반지름 * PI;
	      System.out.println(원면적);
	      
	      반지름 = 34;
	      원면적 = 반지름 * 반지름 * PI;
	      System.out.println(원면적);
	      
	      반지름 = 34;
	      원면적 = 반지름 * 반지름 * PI;
	      System.out.println(원면적);
	      
	      반지름 = 34;
	      원면적 = 반지름 * 반지름 * PI;
	      System.out.println(원면적);
	}

}
