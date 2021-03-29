package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 26, 2021 - 5:12:16 PM
 * @subject days12.Ex02 클래스 활용해서 수정
 * @content
 *
 */
public class Ex06 {
	public static void main(String[] args) throws IOException {

		final int COUNT = 30; //전체 학생 수
		
		//[클래스 배열]	
		// 클래스 타입 [] 배열명 = new 클래스타입[30];
		// int [] m('배열명'//객체 아님!) = new int[30]; 배열과 형태는 똑같음. 자료형이 클래스타입일 뿐
		Student [] students = new Student[COUNT];
	
		Scanner scanner = new Scanner(System.in);
		int cnt = 0; //입력받은 학생수 누계할 것
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		//이 정보를 받아서  students[0]에다가 담을 것
		
		//각각 저장할 방을 또 따로 생성
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		
		do {
			System.out.printf("[%d번] 학생의 이름, 국어, 영어, 수학 성적을 입력하세요 : ", cnt+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3; 
			rank = 1; //모든 사람들 다 일단 1등으로 가정 후 다 받고 랭킹할거임
			wrank = 1;  // = 한사람 받을 때마다 랭크 세는건 비효율적이니 다 받고 세겠음

			//TV의 t1, t2랑 같음
/*			//널포인터 언제 발생하는지? : 에러 발생못잡는 경우 계쏙 발생 (개념부터 잘 안잡혀서 그럼) 배열이랑 헷갈리고,,
			참조타입변수가 참조 안하고 있다는 오류
			[1] 케이스1
			int [] m = null; // new int[10]; 이 아니라 null.실제 참조하지 않고 주소를 안가지고 있음
			m[1] = 100; 하면 널포인트 익셉션 발생
			
			[2] 케이스2
			Car myCar = null; //new Car();안함
			myCar.speed = 100;
			
			인스턴스화 되지 않았다(객체가 생성되지 않았다 )
			
*/			
				
			students[cnt].no = cnt+1;
				//ERR: Exception in thread "main" java.lang.NullPointerException *********
			students[cnt].name = name;
			students[cnt].kor = kor;
			students[cnt].eng = eng;
			students[cnt].mat = mat;
			students[cnt].tot = tot	;
			students[cnt].avg = avg ;
			students[cnt].rank = rank;
			students[cnt].wrank = wrank;
			cnt++; // 한 명 입력받은 후 cnt(카운트) =1로 변경
			
			
			System.out.print(">계속 입력하시겠습니까? : ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		
		//출력작업
		System.out.printf(">학생 수: %d명 \n", cnt	); //입력된 수
		for (int i = 0; i < cnt; i++) {//i<COUNT라면 : 입력안받은 y학생까지(COUNT =30)다 출력하겠다
//			students[i].printTwo();
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
			names[i] = (char)(rnd.nextInt(26) + 65);
		}
		//String -> char[] 변환도 모름            (( Ex02_02 에서 설명 ))
		//받은 char [] -> String 변환?	이 필요
		String name = new String( names );
		return name;
	}
	
}//class
