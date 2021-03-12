package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오전 11:19:50
 * @subject 3일-2번 : 값 입력 출력
 * @content 키보드로 입력받아 결과 출력하기 예시
 *BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *활용문
 *이거 다하면 1,2일차부터 다 따라왔다고 할만큼 중요!
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {

		//입력: 이름, 국어, 영어, 수학성적
		//출력: 총점, 평균
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		//입력부(이름 국어 영어 수학 - 한번에 입력받고 엔터로가 좋음 -> 나중에)
		//일다 각각 받는 작업
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//국어용 망치 영어용 망치 따로 만들필요 없음 이거 하나로!
		
		System.out.println("1. 이름 입력하세요? ");
		name = br.readLine(); //왼쪽 오류 더블클릭해서 throw IOEx- 추가
		
		System.out.println("2. 국어 입력하세요? ");
		kor = Byte.parseByte(br.readLine()); 
		
		System.out.println("3. 영어 입력하세요? ");
		eng = Byte.parseByte(br.readLine()); 
		
		System.out.println("4. 수학 입력하세요? ");
		mat = Byte.parseByte(br.readLine()); 
		
//		System.out.printf("> 이름: %s,  국어: %d, 영어: %d, 수학:%d \n", name, kor, eng, mat);
		
		
		//Type mismatch: cannot convert from String to byte
		// 해결? string"90" -> byte 90 변환 (형변환)
		
//		.parse 기본형
//		byte x - Byte.parseByte(문자열);
		
//		Integer.parseInt()
//		Boolean.parseBoolean()
//		Double.parseDouble()

		//각 입력값에 대한 유효성 검사 해야됨
	
		tot =  (short) (kor + eng + mat);
		// short = int; 인 상황 
		//(캐스트 연산자)(이걸 최우선으로 처리해라 - 전부다 연산한 값으로! 캐스트 해야함 ) = () 각각 다른 의미
		//ERR: Type mismatch: cannot convert from [int] to short
		//Ex02_02 , 교재 29쪽 (상단 왜냐하면~)참고
		
		avg = (double) tot / 3;  // tot/ 3 = short / int = int
		// 10(short) / 3(int) = 3.3333 이라도 s/i = int가 나옴 
		// ->3 정수값만 돌려줌 거기에 실수처리 하니 n.00
		//앞에든 뒤에든 double처리해라 (3.0과목이라고는 잘 안하니 앞에 걍)
		
		
		System.out.printf("> 이름: %s,  국어: %d, 영어: %d, 수학:%d, \n 총점:%d, \n 평균:%.2f \n", name, kor, eng, mat, tot, avg);

		
	}//main

}//class
