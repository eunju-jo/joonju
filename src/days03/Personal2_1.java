package days03;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 11:49:04
 * @subject scanner 활용 예시 다시 연습
 * @content
 *
 */
public class Personal2_1 {

	public static void main(String[] args) throws IOException{

		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("< 이름, 국어, 영어, 수학 성적을 순차적으로 입력하세요 ?");
		
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();
		
		tot =(short)( kor + eng + mat );
		avg = (double) tot / 3;
		
		System.out.printf("< 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f ", name, kor, eng, mat, tot, avg);
		
	}

}
