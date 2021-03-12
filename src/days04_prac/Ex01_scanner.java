package days04_prac;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 1:56:21
 * @subject scanner 예시
 * @content 대애단하게도,, 또 배열 안만들어서 출력안됨; 대단...생각하자
 *
 */
public class Ex01_scanner {
	public static void main(String[] args) {

		//이름,국어,영어,수학 받아서 총점, 평균까지 출력
		//	br에는 \\s로 공백도 없애고

		String name;
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("이름, 국어, 영어, 수학 성적을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String [] strs = str.split(",");
				
		name = strs[0];
		kor = Integer.parseInt(strs[1]);
		eng = Integer.parseInt(strs[2]);
		mat = Integer.parseInt(strs[3]);
		
		tot = kor + eng + mat;
		avg =(double) tot / 3; 
		
		System.out.printf(">이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f", name, kor, eng, mat, tot, avg);
	}
}
