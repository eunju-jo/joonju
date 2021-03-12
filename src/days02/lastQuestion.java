package days02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lastQuestion {
public static void main(String[] args) {
	/* (복습문제) int는 알아서 생각
	 *  국, 영, 수, 이름 입력받아서 
	 *  출력형식 아래와 같이 세개만 출력
	 *  이름: 조은주
	 *  총점: ???
	 *  평균: 83.12 
	 */ 
	
/*	System.out.print("> 국어 성적을 입력하세요? \n");
	System.out.print("> 영어 성적을 입력하세요? \n");
	System.out.print("> 수학 성적을 입력하세요? \n");
	System.out.print("> 이름을 입력하세요?  \n") ; 

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int kor = Integer.parseInt(br.readLine()); 
	System.out.printf("> 국어 성적 : %s ", kor);
	
	int eng = Integer.parseInt(br.readLine()); 
	int mat = Integer.parseInt(br.readLine()); 
			
	String name = br.readLine();
	//br.readLine()쓰려면 throws IOException 써야됨 (암기)

	System.out.printf("> 이름 : %s ", eng);
	System.out.printf("> 이름 : %s ", mat);
	System.out.printf("> 이름 : %s ", name);
	
	//https://jhnyang.tistory.com/92 블로그 참고해서 문풀해보기
	/*
	 * int x = Inter.parseInt(br.readLine()); 
	 * 이런식으로 형변환 필요 
	 * 버퍼는 string으로 형 고정되어 있기 때문
	 */
}
}
