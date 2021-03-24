package days12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 4:26:35 PM
 * @subject 클래스 수업 내일이나 목욜부터,,, 지루함,,,
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {

		// 10 입력받으면 -> 2진수) 0000 0000 0000 1010 출력하기(16비트 --> 2바이트형태)


//[1] 기억은 하되 여기선 쓰지 않겠음	
		//	int i = 10;
		//	System.out.println(Integer.toBinaryString(i)); //2진수 출력완 [결과] 1010

//[2]	
		System.out.print("10진수 형태로 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int [] binary = new int[16]; // 16비트(2바이트)	  0000 0000 0000 1010  요런식으로 넣을거임
				
		//while 나머지 나온걸 /2해서 제일 끝방부터 채워나가7라 /조건식? 몫이 0일때까지
//		몫share or quota, 나머지theRest or remainder
		int share = n;	 //입력받은것이 일단 몫일 것 
		int theRest;
		
		int idx = binary.length-1; //가장 마지막방
		
		while (share != 0) { //몫이 0나오면 끝
//			share /= 2;   // share = share / 2;
//			theRest = share % 2 ;// share, theRest 두 줄 순서에 따라 결과가 아예 다르게 나옴
		
			//헷갈리니까 그냥 아래대로하기  --- 나머지를 배열의 끝부터 집어 넣기
			share = n / 2 ;
			theRest = n % 2;
			binary [idx--] = theRest;
			//마지막방에서 앞으로 이동
			n = share;
					
		}
		
		
		
		System.out.println( Arrays.toString(binary) );
		
	}//main

}//class
