package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오전 10:22:05
 * @subject 3일-1번: 패키지와 import
 * @content 아침 시험 피드백(문제풀이)
 *
 */
public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		
//		"문제 11번"
		System.out.println("> 이름을 입력하세요? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//ctrl + shift + o : 필요한 import 문 자동추가됨
		
		String name = br.readLine();				
		//ctrl + 스페이스로 자동완성해야 위에 import문 자동추가됨
		
		System.out.printf("이름은 \"%s\" 입니다.", name);
		
		
		
		
		
		
//		[I]nteger 클래스(물건,객체,개체,object)설명
//		int의 최대값 출력하라 4byte 2^32승 /2 = 2^31 - 1(0빼는거)
//		 기본형 int를 사용하기 편리하도록 기능(함수), 속성을 정의(구현)한 클래스 = Integer클래스
		
//		Integer 클래스 안에 16진수로, 8진수로 변환해주는 기능이 있음
//		-> wrapper 클래스(각 기본형의 wrapper 클래스가 존재)
		
//		long(기본형long)을 쉽게 쓰게 해주는 wrapper 클래스 = Long
//		boolean Boolean도 마찬가지
		
		// ^비트연산자랑 -뺄셈연산자로 계산해서 에러는 안남
		/*
		 * int max = 2^31-1; 
		 * System.out.println(max);
		 */
		
		/*
		 * int max = Integer.MAX_VALUE; 
		 * //final / 최대값구하는 툴
		 *  //Interger.MIN_VALUE
		 * System.out.println(max);
		 */
		
		
		
		/*
		 * 5. int x = 10, y = 20;    
		 * 위의 두 기억공간의 값을 교환해서 출력하는 코딩을 하세요. int x = 10; y= 20;
		 * 
		 * {int temp = x; 
		 * x = y; 
		 * y = temp }
		 */		
		/*3. int x = 10;
    x 변수의 값을 10진수, 8진수, 16진수, 2진수 로 출력하세요.
		 * System.out.printf("%d\n",x); 
		 * System.out.printf("%o\n",x); //8진수
		 * System.out.printf("%#o\n",x); 
		 * System.out.printf("%x\n",x); //16진수
		 * System.out.printf("%#x\n",x);
		 */

		// 문제) 8진수 출력이 아닌 8진수 변수로 저장하고자 한다면,,
		//2진수 출력 336쪽 패키지와 import
		// System.out.println(Integer.toBinaryString(i));
		

		/* 교재 336페이지
		 패키지 ; 서로 관련된 클래스들의 묶음.
		클래스의 실제이름(full name); 패키지명을 포함함

		예) String 클래스: java.lang.String

		▶ 하나의 소스파일에는 첫문장의 패키지 하나만을 선언
		▶ 모든 클래스는 반드시 하나의 패키지에 속해야 함
		▶ 패키지는 점(.)을 구분자로 하여 계층구조로 형성
		▶ 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리.
		   */
		
		
		/*이런 경우 a 가 범주 벗어나서 에러 발생
		 * 
		 * { int a = 10; }
		 * 
		 * System.out.println(a);
		 */
		
	}
}
