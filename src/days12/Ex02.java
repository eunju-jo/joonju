package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 10:13:24 AM
 * @subject
 * @content days11 Ex06 문제 제시했던 것 관련
 *
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {

		//COUNT명
		//학생관리(이름String/ 국,영,수,총,등int/ 평균double)
		final int COUNT = 30; //전체 학생 수
		//상수로 두어야 유지보수 등 관리 더 편함
		
		//배열 다 30칸씩 선언
		String [] names = new String[COUNT]; //참조타입 기본값 : null names[0]	~ names[29] 모두
		int [] kors = new int[COUNT];
		int [] engs = new int[COUNT];
		int [] mats = new int[COUNT];
		int [] tots = new int[COUNT];
		int [] ranks = new int[COUNT];
		double [] avgs = new double[COUNT];
		
		int cnt = 0; //입력받은 학생수 누계할 것
		char con = 'y';
		Scanner scanner = new Scanner(System.in);
		
		//한사람거 이렇게 받고 배열에 넣어야징
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		do {
			System.out.printf("[%d번] 학생의 이름, 국어, 영어, 수학 성적을 입력하세요 : ", cnt+1);
			
//			name = scanner.next();
//			kor = scanner.nextInt();
//			eng = scanner.nextInt();
//			mat = scanner.nextInt();

			//위에처럼 테스트한다고 다 치기 귀찮으니까 일단 난수로 getName(), getScore()	
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = 1; //모든 사람들 다 일단 1등으로 가정 후 다 받고 랭킹할거임
					  // = 한사람 받을 때마다 랭크 세는건 비효율적이니 다 받고 세겠음
			//한 사람거 위에 다 받았다면 각각의 0번째 방에 넣으면 됨
			
			//[첨자] 숫자 = cnt 숫자
			names[cnt]= name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++; // 한 명 입력받은 후 cnt(카운트) =1로 변경
			
			System.out.print(">계속 입력하시겠습니까? : ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		
		//출력작업
		System.out.printf(">학생 수: %d명 \n", cnt	); //입력된 수
		for (int i = 0; i < cnt; i++) {//i<COUNT라면 : 입력안받은 학생까지(COUNT =30)다 출력하겠다
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
			
		// [결과]
//		>학생 수: 4명 
//				1번	JEOXV	28	20	24	72	24.00	1
//				2번	SAHVQ	62	39	28	129	43.00	1
//				3번	JXETM	7	57	42	106	35.33	1
//				4번	RKYKK	0	49	75	124	41.33	1

		}
	}//main

	
	public static int getScore() {
		//0 ~ 100 정수 랜덤으로
		Random rnd = new Random();
		return rnd.nextInt(101);
	}
	
	public static String getName() {
		//대문자 5개 랜덤으로 발생
		//아스키 65 ~ 90 사이       -65하면
		// 0 ~ 25 사이. 이렇게 발생시키고65 더해버리기
		Random rnd = new Random();
		
		char [] names = new char[5];
		for (int i = 0; i < 5; i++) {
			names[i] = (char)(rnd.nextInt(25) + 65);
		}
		//String -> char[] 변환도 모름            (( Ex02_02 에서 설명 ))
		//받은 char [] -> String 변환?	이 필요
		String name = new String( names );
		return name;
	}
	
}//class
