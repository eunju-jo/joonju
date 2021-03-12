package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오전 10:37:08
 * @subject 4일-1번 : String의 split 에서 \\s* 활용
 * @content \\s* 공백을 여러개든 없든지(zero or more times) 
 * 					trim보다 더 간결한 형태로 가능
 * 					3일차 정리본에 fish 검색해서 확인
 *					
 */
public class Ex01_02 {
	public static void main(String[] args) throws IOException  {

	     String name;
	     int kor, eng, mat, tot;
	     double avg;
	     
		System.out.printf("> 이름, 국어, 영어, 수학 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String value = br.readLine();
		
		String [] values = value.split("\\s*,\\s*"); //배열
		//trim 보다 더 간결하게 표현가능(더 좋은 코딩)
		//    \\s 공백(space)이 * zero or more times 있어도 된다

		name = values[0] ;
		kor = Integer.parseInt(values[1]  ); 
		eng = Integer.parseInt(values[2]  );
		mat = Integer.parseInt(values[3]  );

		tot = kor + eng + mat;
		avg = (double) tot /3;

		System.out.println(">이름: "+ name); 
		System.out.println(">국어: "+kor) ; 
		System.out.println(">영어: "+eng ); 
		System.out.println(">수학: "+mat ); 
		System.out.println(">총계: "+tot ); 
		System.out.println(">평균: "+avg ); 

		
	
	}//main
}//class
