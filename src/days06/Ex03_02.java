package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) throws IOException {
		//days04.Ex01.java 메인함수 긁어온 것 
		//국어,영어,수학 받아서 총점, 평균까지 출력

		int kor, eng, mat, tot;
		double avg;

		kor = getScore("국어"); //만들고 오른쪽 파랑버튼 누르면 새 함수로 바로 이동
		eng = getScore("영어");
		mat = getScore("수학");

		tot = kor + eng + mat;
		avg = (double) tot /3;

		System.out.println(">국어: " +kor ) ; 
		System.out.println(">영어: " +eng ); 
		System.out.println(">수학: " +mat ); 
		System.out.println(">총계: " +tot ); 
		System.out.println(">평균: " +avg ); 



		//국어 점수 키보드로 입력받아 반환하는 함수 선언

	}
	
//	String 클래스 matches() 함수 찾기 (api docu 홈)
//	matches(String regex)
//	: Tells whether or not this string matches the given regular expression.

	
	private static int getScore(String subjectName) {

		//입력값 문자열.matches()
		//유효성 검사 전 입력 값 저장하는 값 = data	
		//String regex="\\d{3}";//000됨 0은 안됨. 19안되고 019만 됨. 999됨
		
		//String regex="[0-1][0][0] | \\d{2}";
		//               000 100    | 01~09 11~99
		
		String regex = "100|[1-9]?[0-9]"; //0~100
		//{0,1}하나 와도 되고 안와도됨 == 같은 기호가 '?'
		// A|B 에이여도 비여도 ㅇㅋ
		// [1-9]? = 1-9까지 와도 좋고 하나도 안와도 좋음 (X?와 같은 형태)
		// X?(?기호 설명):	X, once or not at all
		// [0-9] 0-9중 하나 올 수 있음 
		// |연산자, ?라는 반복 기호 [1-9][0-9]의 의미

		Scanner scanner = new Scanner(System.in);

		String data;
		
		boolean flag = false;
		
		do {
			if(flag) System.out.print("> 입력 오류로 다시 입력 ");
			System.out.printf("> %s 점수를 입력하세요: ",subjectName);
			data = scanner.next();
			data.matches(regex); 
		} while(flag = !data.matches(regex)); //요렇게 많이 쓸거임
//		} while(data.matches(regex) ==false	);
//		} while (정규표현식에 일치하지 않으면 while문 반복작업함);
//		정규표현식에 일치하지않는다 = 입력한 값이 100이 넘거나 음수인 것 
//		 -> 똑바로 다시 입력하라고 do 속 문장 뜨는 것(값 인식도 정당한 걸로 됨)

//		return 일치한다면 정수로 변환해서 리턴;
		return Integer.parseInt(data);
			
		//이 코딩 중요하니까 안보고 할 수 있을 정도로 공부,,
	}


}//class