package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 2:02:44
 * @subject 2일-7번 : 출력서식, 도움말(index.html) 참고하기
 * @content 
 * 					"자료형 boolean"
 *					출력서식 %b
 *					아래가 불린관련 도움말 긁어온 것. 각 요소 설명 내용
 *					%[argument_index$][flags][width][.precision]conversion
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// 자료형 = 종류 + 크기
		// 기본형
		//				숫자형
		//					정수계열 : byte1, short2, int4, long8
		//						문자 : char2
		//					실수계열 : float4, double8
		//				논리형: boolean(2) - true/false
		//					ㄴ 조건식(참, 거짓판단)으로 많이 사용됨
		// 참조형 - 배열, 클래스(String), 인터페이스
		
		// 성별 저장할 변수 선언 =>나중에 조건식으로 쓸거면 밑에 애들보다 불린이 낫다
		//char gender = 'm'; //'w'
		//int gender = 1; //0
		//String gender = "여자"; // "남자"
	
		boolean gender;
		//gender = 1;
		//1로 설정시 에러: Type mismatch: cannot convert from int to boolean
		//Type 자료형 mismatch 일치하지않아서 형변환 못해줘~~!
		//b   =  i      gender = 1;
		
		gender = true;
		System.out.println(gender);
		
		gender = false;
		System.out.printf("%1$b \t %1$B", gender);
		
//		1$ 쓰면 변수 하나라도 두개 쓸 수 있음 (1$ 안쓰고 같은 변수 두번 쓰면 error)
//		 \t = tab 만큼 공백
//		conversion오류 : "%d" 이 부분 잘못된거 d있는 자리를 conversion이라고 부름
//		Exception in thread "main" java.util.IllegalFormatConversionException:
//		 d != java.lang.Boolean
		
		
		//String=%s, char=%c, int=%d, double=%f
		//boolean %?
		//%[argument_index$][flags][width][.precision]conversion
		//주소 참고: file:///C:/class/download/1.%20JDK/jdk-8u281-docs-all/docs/api/index.html
		
		
		System.out.println(); //대신 위에 "기존내용 \n"해도됨
		
		int num = 12;
		System.out.printf("%d \n", num); //10진수 출력
		System.out.printf("%#x \n", num); //16진수 출력 (0x) 0x12
		System.out.printf("%#o \n", num); //8진수 출력 (0) 012
		
		//% 뒤의 '#'의 의미: 자동으로 진수변환 [ 위에 Flags 중 '#' ]
		
		num = -25;
		System.out.printf("%d \n", num); //10진수 출력
		System.out.printf("%(d \n", num); //10진수 출력
		
		/*출력결과 : 
		-25 
		(25) */
		
		//% 뒤의 '(' : 음수일 때는 ( )를 붙이겠다는 의미
		
		
		num = 5;
		System.out.printf("[%10d] \n",num);
		//[width] 너비관련 []붙이는건 너비가 10이 어디까진지 구분하려고
		System.out.printf("[%-10d] \n",num);
		// - 붙는거 : 왼쪽부터 정렬하겠다
		
		/*위에 두 개 결과
		[         5] 
		[5         ] */
		
		
		System.out.printf("[%010d] \n",num);
		//0이 붙을 경우: flag에 0.(위에 주소 설명서를..봐라..) 빈자리 0으로 채워라(중요)***
		//나중에 코딩에 쓸거임

		//int pi = 3.141592; //PI파이값(원주율)
		//pi 시 에러= Type mismatch: cannot convert from double to int
		//from 우측 to 좌측,,
		
		double pi = 3.141592; 
		System.out.printf("원주율: %f \n",pi);
//		System.out.printf("원주율: %e \n",pi);
//		System.out.printf("원주율: %g \n",pi);
//		System.out.printf("원주율: %a \n",pi); //안씀
		
		/*[결과]
		원주율: 3.141592  => 이것만 기억(%f)
		원주율: 3.141592e+00 
		원주율: 3.14159 
		원주율: 0x1.921fafc8b007ap1 */ 

		System.out.printf("원주율: %10.2f \n",pi);
		//[결과]  총 열칸 확보하고 소수점 이하 2자리까지만 표시하라 
		// 원주율:       3.14 
		
	}//main

}//class
