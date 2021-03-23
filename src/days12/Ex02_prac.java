package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex02_prac {

	public static void main(String[] args) throws IOException {

		//COUNT명
		//학생관리(이름String/ 국,영,수,총,등int/ 평균double)

		final int COUNT = 30;
		
		String [] names = new String [COUNT];
		int [] kors = new int [COUNT];
		int [] engs = new int [COUNT];
		int [] mats = new int [COUNT];
		int [] tots = new int [COUNT];
		int [] ranks = new int [COUNT];
		double [] avgs = new double [COUNT];
		
		int cnt = 0;
		char con = 'y';
		Scanner scanner = new Scanner(System.in);
	
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		do {
			System.out.println(">이름, 국어, 영어, 수학 성적을 입력하세요: ");
			
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			
			tot = kor + eng + mat;
			avg = (double) tot /3;
			rank = 1;
			
			names[cnt]= name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++;
			
			System.out.println("계속 입력하시겠습니까?:y/n ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.printf(">학생 수: %d명 \n", cnt	);
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
		
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

