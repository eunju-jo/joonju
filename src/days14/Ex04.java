package days14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 25, 2021 - 3:33:14 PM
 * @subject 근사치 구하기
 * @content
 *
 */
public class Ex04 {
	public static void main(String[] args) {

		int [] m = new int[20];
		
		fillRandom(m);
		Arrays.parallelSort(m);//
		System.out.println(Arrays.toString(m));
		int n = getNumber();

		//아래 근사치 출력하는 코딩 때에 따라 여러개 나올 수도 있음
		//[1 2 5 10 23 43 50]
//		          15 근사치 찾기 -->10
		
		//근사치 출력
		int approximateValue1, approximateValue2=-1 ;
		//두번째는 안나올수도 있으니 일단 -1로(나올수없는값) 해놓겠음
		
		approximateValue1 =m[0]; // 첫빠가 근사치다 기본세팅해놓고 시작
		
		//m[0]과 찾고자하는 숫자 사이의 갭을 mingap에 저장
		int minGap = Math.abs(m[0] - n); //뭘 먼저 두고 빼는진 상관없음 
		
		//m[1] - n = 그 차이 gap에 저장;
		//minGap이랑 gap이랑 같을수도 있음
		int gap;
		for (int i = 1; i < m.length; i++) {
			gap = Math.abs(m[i]-n);
			if(gap < minGap) {
			minGap = gap;
			approximateValue1 = m[i]; // i 근사치 위치값
		} else if(gap == minGap){
			approximateValue2 = m[i];
			break;
		}
	}
		System.out.println(approximateValue1);
		System.out.println(approximateValue2);
	

			
			//내가 쓴거
	/*		if(gap < minGap) {
				minGap = gap;
				approximateValue1 = m[i]; // i 근사치 위치값
			} else if(gap == minGap){
				if(approximateValue1 +gap*2 <=100)
				approximateValue2 = approximateValue1 + gap*2;
			}
		}
		if(approximateValue2 <0) {
			System.out.println(approximateValue1);
		} else {
		System.out.println(approximateValue1 +" & "+ approximateValue2);
		}
		
		*/
	}//main
	//1 3 5 6
	// 2 뒤지면 앞뒤 거리는 둘다 1	--그럼 두개 다 찾고 끝 break;	
	

	private static int getNumber() {
		//찾을 정수 n 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 정수를 입력하세요: ");
		int n = sc.nextInt();
		return n;
	}

	private static void fillRandom(int[] m) {

		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			int rndN = rnd.nextInt(100)+1;
			m[i]=rndN;
		}
		
		
		
		//중복되지 않는 1-100 정수를 m 배열에 채워넣는 코딩
	}
}
