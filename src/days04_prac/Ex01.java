package days04_prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 1:25:23
 * @subject br 예제
 * @content 위에 주석만 보고 코드 작성해보기 도전
 *
 */
public class Ex01 {
	public static void main(String[] args) throws IOException {

		//이름,국어,영어,수학 받아서 총점, 평균까지 출력
		//	br, scanner 둘다
		//	br에는 \\s로 공백도 없애고

		String name;
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("> 이름, 국어, 영어, 수학 성적을 입력하세요. ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String value = br.readLine();
		
		String [] values = value.split("\\s*,\\s*"); //  \\s 공백이 * 몇개든 없애고
		
		name = values[0];
		kor = Integer.parseInt(values[1]);
		eng = Integer.parseInt(values[2]);
		mat = Integer.parseInt(values[3]);

		tot = kor + eng + mat;
		avg = (double) tot / 3;
		
		System.out.printf("이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f",name, kor, eng, mat, tot, avg);


	}//main
}//class