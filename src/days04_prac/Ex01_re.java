package days04_prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 1:40:13
 * @subject 다시
 * @content 위에 주석만보고 다시 도전
 * 문제1)처음했을 때 입력행만 정상출력되고 다음 과정이 진행안됐음
 *  이유1) 입력값 배열 선언 및 배열 값 설정을 안했기 때문
 * 문제2) 공백 무시 처리가 제대로 안됐음
 *  이유2)\\s에다가 *을 붙이지 않아서 공백 처리가 잘 안됐음.
 *
 *화이팅 다시 도전 ->성공!
 */
public class Ex01_re {
	public static void main(String[] args) throws IOException {

		//이름,국어,영어,수학 받아서 총점, 평균까지 출력
		//	br에는 \\s로 공백도 없애고

		String name;
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("이름, 국어, 영어, 수학 성적을 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//쭉 입력할건데 콤마로 구분자해서 공백도 무시하게 해줘
	
		String str = br.readLine(); //문자열 전체를 일단 읽겠음
		String [] strs = str.split("\\s*,\\s*");
		
		name = strs[0];
		kor = Integer.parseInt(strs[1]);
		eng = Integer.parseInt(strs[2]);
		mat = Integer.parseInt(strs[3]);
		
		tot = kor + eng + mat;
		avg =(double) tot / 3; 
		
		System.out.printf(">이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f", name, kor, eng, mat, tot, avg);
		
		
	}
}
