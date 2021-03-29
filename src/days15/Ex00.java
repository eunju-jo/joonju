package days15;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) throws IOException {

//		1. 4반 20명 학생의 이름,//국,영,수,총,평,등,전등
//		   입력받아서 등수처리 후 출력하는 코딩을 하세요.
		//입력받기 // 등수처리 // 출력
		
		String [][] names = new String[4][20];
		
		int [][][] infos = new int[4][20][6];
		//국0 영1 수2 총3 등4 전등5 
		
		double [][] avgs = new double[4][20];
		
		String name;
		int kor, eng, mat, tot;
		int rank = 1; 
		int wrank = 1;
		double avg;
		
		int [] cnts = new int[4];
		
		int ban = 1;
		char con = 'y';
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("> 몇 반 데이터를 입력하시겠습니까? : ");
			ban =scanner.nextInt();
			System.out.printf("> %d반 %d번 학생의 이름, 국어, 영어, 수학 성적을 입력하세요: ", ban, cnts[ban-1]+1);
			
			//개개인 입력받은 데이터
			name = scanner.next();
			kor = scanner.nextInt();
			eng= scanner.nextInt();
			mat= scanner.nextInt();
			tot= kor + eng + mat;
			avg = (double)tot /3;
			
			names[ban-1][cnts[ban-1]] = name;
			infos[ban-1][cnts[ban-1]][0] = kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;
			infos[ban-1][cnts[ban-1]][4] = 1;
			infos[ban-1][cnts[ban-1]][5] = 1;
			
			cnts[ban-1]++;
			System.out.println("입력을 계속하시겠습니까?(y,n): ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		//출력
		for (int i = 0; i <cnts.length; i++) {
			System.out.printf("%d반 학생수: %d명\n",i+1, cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				name = names[i][j];
				kor = infos[i][j][0]; 
				eng = infos[i][j][1]; 
				mat = infos[i][j][2]; 
				tot = infos[i][j][3]; 
				rank = infos[i][j][4]; 
				wrank = infos[i][j][5]; 
				avg = avgs[i][j];
				System.out.printf("[%d번] 이름: %s / %d, %d, %d, / %d, %.2f, / %d, %d\n", 
						 j+1, name, kor, eng, mat, tot, avg, rank, wrank);
				
			}
			
			
		}
		
	}//ma

}
