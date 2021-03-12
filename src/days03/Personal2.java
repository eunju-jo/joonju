package days03;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 11:24:19
 * @subject scanner 활용해서 이름국영수 동시에 받고 
 * @content
 *
 */
public class Personal2 {

	public static void main(String[] args) {

		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("< 이름, 국어, 영어, 수학 성적을 입력하세요? ");
		
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();
		
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;
		
		System.out.printf(">이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점: %d, 평균:%f", name, kor, eng, mat, tot, avg);
		
	}

}
