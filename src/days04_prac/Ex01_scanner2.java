package days04_prac;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 1:57:33
 * @subject scanner 다시..
 * @content
 *
 */
public class Ex01_scanner2 {
public static void main(String[] args) {
	String name;
	int kor, eng, mat, tot;
	double avg;

	System.out.print("이름, 국어, 영어, 수학 입력하세요.");
	Scanner scanner = new Scanner(System.in);
	
	String str = scanner.nextLine();
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
