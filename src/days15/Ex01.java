package days15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 27, 2021 - 5:54:23 PM
 * @subject 이진검색
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		
		int [] m = {1, 2, 3, 4, 6, 7, 9, 10, 12};
	    int bot = 0, top = m.length-1;
	    System.out.print(">찾는 정수? : ");
	    int n = new Scanner(System.in).nextInt();
		
//		4
//		6>4 4->top
//		4?>2 3->bot
//		3?<4 4-bot
	    
		
		int idx = binarySearch(m, n, top, bot);
		
		System.out.println(idx +"번째");
		
		
		//기존 함수
//		Arrays.binarySearch(m, n); // m배열에서 n 값 찾겠다 
		
	}

//	바텀 - 탑이 어긋날때까지 아래 작업 반복 == bot > top될때
//		가운데 위치 값 == 찾는 정수? [위치값=인덱스값] 찾은 거 
//		가운데 값 > 찾는 정수? 새로운 탑값 = 기존 mid - 1;
//		가운데 값 < 찾는 정수? 새로운 바텀값 = 기존 mid + 1;	
	private static int binarySearch(int[] m, int n, int top, int bot) {
		int mid;
		int cnt = 0 ;
		while (top >= bot) {
			++cnt; //몇번까지 찾아보고 나오나 확인용
//			System.out.println(cnt);
			mid = (bot + top) / 2;
			System.out.println("mid:" +	mid);
			if(m[mid] == n) return mid+1; 
			else if(m[mid] > n) top = mid-1; 
			else if(m[mid] < n) bot = mid+1; 
		}
		
		return -1;//찾는 값 없으면 -1반환
	}

}
