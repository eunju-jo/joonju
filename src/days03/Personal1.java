package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 11:08:45
 * @subject 3일 - br로 이름, 성적(국영수) 입력 받고 출력 연습
 * @content 강사님 지시- byte, short 활용해서 할 것
 *
 */
public class Personal1 {
	public static void main(String[] args) throws IOException {

		String name;
		byte kor, eng, mat;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("> 이름을 입력하세요 ? ");
		name = br.readLine();
		
		System.out.printf("> 국어 입력하세요? ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.printf("> 영어 입력하세요? ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.printf("> 수학 입력하세요? ");
		mat = Byte.parseByte(br.readLine());
		
		short tot = (short) (kor + eng + mat); //먼저 다 더하고 short로 담아라
		double avg = (double) tot / 3;
		
		System.out.printf(">이름:%s, 국어:%d, 영어:%d, 수학:%d,\n 총점:%d,\n 평균:%f ", name, kor, eng, mat, tot, avg);
		
		
		
	}
}
