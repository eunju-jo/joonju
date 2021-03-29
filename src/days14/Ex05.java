package days14;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 25, 2021 - 4:31:59 PM
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		//그림 캡쳐본 참고(스크린샷)	
		
		//3반, 30명씩 -- 이름,국,영,수,총,평,반등수,전교등수
		//						     [행]: 반, [열]: 학생번호
		String [][] names = new String[3][30];
		
		int [][][] infos = new int[3][30][6];
		//면: 반 123반
		//행: 학생번호(1-30)
		//열: (0열~)국어.영어.수학.총점.반등수.전교등수(~5열)
	
		
	 //						       [행]: 반, [열]: 학생번호
		double [][] avgs = new double[3][30];
		
		int [] cnts = new int[3]; //cnt[0]:1반학생수 cnt[1]:2반 cnt[2]:3반  
		
		//배열 지금은 일단 다 0으로 초기화되어져있음
		
		char con = 'y'; //입력계속할지 물어보려고
		
		int ban = 1;
		Scanner sc = new Scanner(System.in);
		
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank=1, wrank=1;
		
		//입력받은거 그 반에 각각 넣어야댐
		do {
			System.out.print(">몇 반 학생을 입력하시겠습니까? : ");//1 2 3 중 입력
			ban = sc.nextInt();														//1반이 cnt[0]이니까 ban-1	
			System.out.printf(">%d반 %d번 학생의 이름, 국어, 영어, 수학 성적을 입력하세요.", ban, cnts[ban-1]+1);
			//ban 몇반 / cnts[ban-1] 몇번
			//1반에      cnts[0] 1번학생이라고 가
			name = getName(); //sc.nextLine();
			kor = getScore(); //sc.nextInt();
			eng = getScore(); //sc.nextInt();
			mat = getScore(); //sc.nextInt();
			tot = getScore(); //kor+eng+mat;
			avg = (double)tot/3;
			
//			names[반=ban-1][번호=cnts[ban-1]] = name;
			//names[0][0] 에 네임 주겠다 그런거지,,,처음쓰면 힘듦...	
			
			names[ban-1][cnts[ban-1]] = name;
			infos[ban-1][cnts[ban-1]][0] = kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;
			infos[ban-1][cnts[ban-1]][4] = 1;
			infos[ban-1][cnts[ban-1]][5] = 1;
			
			//ban-1이런걸 다 치고서 변수로 따로빼면 좋겟다
//			infos[면=반=ban-1][행=번호=cnt[ban-1]][0] = kor; 
//			infos[면=반][행=번호][1] = eng;
//			infos[면=반][행=번호][2] = mat;
//			infos[면=반][행=번호][3] = tot;
			
			//getName() getScore(); 난수로 자동생성하기
			
			cnts[ban-1]++; //그 반 학생수를 증가시키겠다
			System.out.print(">입력을 계속 하시겠습니까?(y,n): ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)== 'Y');
		
		//반등수, 전교등수 처리..오늘 배운걸로 가능 Ex00	
		
		
		
		
//		cnt=각 반 입력받은 학생수
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("%d반 학생수: %d 명\n", i+1, cnts[i]);
			System.out.println("---------------------------------------");
			for (int j = 0; j < cnts[i]; j++) {
//				name = names[i반][j번호];
				name = names[i][j];
				kor = infos[i][j][0];
				eng = infos[i][j][1];
				mat = infos[i][j][2];
				tot = infos[i][j][3];
				rank = infos[i][j][4];
				wrank = infos[i][j][5];
				avg = avgs[i][j];
				System.out.printf("[%d] 이름: %s // %d, %d, %d, // %d, %.2f, // %d, %d\n", 
						i+1,name, kor, eng, mat, tot, avg, rank, wrank);
				System.out.println("---------------------------------------");
			}
		}

		
	//내가 하다 안나온거	
//		for (int j = 0; j < cnts.length; j++) {
//			System.out.printf("[ %d 반 ]\n", j+1);
//			for (int i = 0; i < cnts[ban-1]; i++) {
//				System.out.printf("[%d] 이름: %s // %d, %d, %d, // %d, %f, // %d, %d\n", 
//						i+1,name, kor, eng, mat, tot, avg, rank, wrank);
//			}
//		}
		
		
//		이렇게 출력되도록 
		
//		1반학생 : 3명이라면
		// 이,국,영,수,총,평,등,전
		// 이,국,영,수,총,평,등,전
		// 이,국,영,수,총,평,등,전
		
//		2반학생 : 2명이라면
		// 이,국,영,수,총,평,등,전
		// 이,국,영,수,총,평,등,전
		
//		3반학생 : 1명이라면
		// 이,국,영,수,총,평,등,전
		
		
	}//main
	private static String getName() {
		Random rnd = new Random();
		
		char [] names = new char[5];
		for (int i = 0; i < 5; i++) {
			names[i] = (char)(rnd.nextInt(25)+65);
		}
		
		String name = new String(names);
		
		return name;
	}

	private static int getScore() {
		Random rnd = new Random();
		return rnd.nextInt(101);
	}

}//class	
