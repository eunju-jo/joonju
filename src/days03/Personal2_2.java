package days03;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 11:58:53
 * @subject
 * @content 2_1 왜 안되지...? 에러는 안뜨는데 요청문 출력이 연이어 안됨.. 예외처리 자동으로 안생김..다시 도전
 *
 *						예외처리구문 throw IOE 없이도 잘 실행됨. 2_1은 왜 안됐던것,,>?
 */
public class Personal2_2 {

	public static void main(String[] args) {

		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">이름, 국어, 영어, 수학 성적을 입력하세요? ");
		
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();
		
		tot = (short) (kor + eng + mat);
		avg = (double)tot /3;
		
		System.out.printf(">이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f ",name, kor, eng, mat, tot, avg);
		
		
	}

}
