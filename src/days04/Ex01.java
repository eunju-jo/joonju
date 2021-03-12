package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오전 10:37:08
 * @subject 4일-1번 : String의 split 기능
 * @content String [] values = value.split(",")
 *					콤마를 구분자로 split하겠다!
 */
public class Ex01 {
	public static void main(String[] args) throws IOException  {

		//이름,국어,영어,수학 받아서 총점, 평균까지 출력
	     String name;
	     int kor, eng, mat, tot;
	     double avg;
	     
		System.out.printf("> 이름, 국어, 영어, 수학 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String value = br.readLine();
		//빨간밑줄: 예외처리 클릭
		
		// 조은주,80,90,85
		
		// => 통째로 입력한 값이 하나의 "문자열"
		//"조은주" "80" "90" "85" 콤마로 구분한다면
		//String 클래스 안에 split() 함수(메서드)가 있음 [잘라내겠다]
		// (기능), 매개변수, 리턴값 알아야 제대로 씀
		//System.err.println("> 입력값: " + value);
		
		String [] values = value.split(","); //배열
		
		//split 잘 되는지 확인해봄
//		System.out.println(values[0]); //얘도 스트링 ->name에 저장
//		System.out.println(values[1]); //얘도 밑에도 다 스트링 _int로 형변환해서 ->kor
//		System.out.println(values[2]);
//		System.out.println(values[3]);

		name = values[0];
		kor = Integer.parseInt(values[1].trim() ); //String -> int로 형변환
		eng = Integer.parseInt(values[2].trim() );
		mat = Integer.parseInt(values[3].trim() );

		tot = kor + eng + mat;
		avg = (double) tot /3;

		System.out.println(">이름: "+ name); 
		System.out.println(">국어: "+kor) ; 
		System.out.println(">영어: "+eng ); 
		System.out.println(">수학: "+mat ); 
		System.out.println(">총계: "+tot ); 
		System.out.println(">평균: "+avg ); 

		//"홍길동 ,   90, 80, 77" -> 사이사이에 콤마 외에 공백주면 에러발생
		//String은 상관없지만 parseInt에 공백있으면 안됨
		//ERR: Exception in thread "main" java.lang.NumberFormatException: For input string: "   90"
		
		//문자열 앞뒤에 있는 공백 제거하는 코딩하면 됨
		
		
	
	}//main
}//class
