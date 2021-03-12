package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 11:18:13
 * @subject br 출력 다시 한 번 (이름 국영수 받아서 그대로+총점+평균 출력)
 * @content
 *
 */
public class Personal1_1 {

	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, mat;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("> 이름을 입력하세요? ");
		name = br.readLine();
		
		System.out.printf("> 국어 성적을 입력하세요? ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.printf("> 영어 성적을 입력하세요? ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.printf("> 수학 성적을 입력하세요? ");
		mat = Integer.parseInt(br.readLine());
		
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;
		
		System.out.printf("> 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f", name, kor, eng, mat, tot, avg);
		
		
	}

}
