package days04_prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 2:04:10
 * @subject br먼저
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) throws IOException {


//[문제] 두 정수를 입력받아서 큰 수, 작은 수를 출력하세요
		// [입력] > 두 정수를 입력하세요?
		// 입력값 : 10,20,30
		//[출력결과]
		//>큰 값: 30
		//>작은 값:10

		System.out.print("세 정수를 입력하세요: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strs = str.split("\\s*,\\s*");
		
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		
//		int max = Math.max(a, b, c);
//		int min = Math.min(a, b, c);
		
		//삼항연산자 써야할 경우
		
		int max = a>b? (a>c? a: c) : (b>c? b: c);
		int min = a>b? (b>c? c: b) : (c<a? c : a);
				
				
//				int max =  a > b ? ( a > c ? a : c ) :  ( b > c ? b : c )   ;
//				int min  =  a > b ? ( b > c ? c : b ) :  ( a > c ? c : a)   ;
		System.out.printf(">큰 값 : %d\n>작은 값 : %d\n", max, min);



	
	}
}