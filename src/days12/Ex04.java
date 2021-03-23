package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 3:35:10 PM
 * @subject 204
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//배열 m 안에 있는 0-9까지의 정수가 각각 몇 개인지 출력
		int [] m = new int[30];
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(rnd.nextInt(10)); //0-9까지 정수
		}
		System.out.println(Arrays.toString(m));

		int [] n = new int[10];
		//n[0] = 정수 0의 개수 저장 ~ n[9] = 정수 9의 개수 저장
		for (int i = 0; i < n.length; i++) {
//			m[i]; //읽어왔다면 이걸 인덱스로 해서 n배열 값을 1증가 시키겠
//			n[2]++;
			n[m[i]]++;	
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.printf("정수 %d : %d개\n", i, n[i]);
		}
		
		//특정 파일을 읽어서 알파벳의 갯수가 몇개인지 출력할 수도 있음
		//파일 읽는 작업을 모름 --- IO
		
		//205쪽 참고 [변수 기본값]  --Ex05
		//boolean = flag
		//char = '\u0000'
		//float = 0.0f
		//참조형 변수 = null
		
		// 밑은 i = 10개, j=30개 -->300번 체크. 밑처럼 300번 돌필요 없이 30분 돌게 위에다가 만들겠음
//		for (int i = 0; i <=9; i++) {
//			int cnt = 0;
//			 for (int j = 0; j < m.length; j++) {
//				if(m[j] == i) cnt++;
//			}
//			 System.out.printf("%d 정수: %d개\n", i, cnt);
//		}
		
		//내가 푼거(작동ㅇ)
/*		int [] count = new int[10];
		for (int i = 0; i < m.length; i++) {
			for (int n = 0; n < count.length; n++) {
				if(m[i] == n ) count[n]++; 
			}
		}
		for (int n = 0; n < count.length; n++) {
			System.out.printf("count[%d] = %d\n", n, count[n]);
		}
*/
	
	
	}//main

}//class


