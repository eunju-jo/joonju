package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 5:19:44 PM
 * @subject
 * @content
 *
 */

public class Ex09_cutOperat {

	public static void main(String[] args) {

		/*
		문제3) 막대기 자르기  - 취업문제 
		각각 0이상의 정수를 길이로 하는 N개의 막대기가 있다.
		 이 막대기들 중 가장 짧은 막대기의 길이로 모든 막대기를 자르는 것을 [cut operation]이라고 하자.

		예를 들어 6개의 막대기가 있고 그 길이가 다음과 같다면 
		5 4 4 2 2 8 

		이 경우 [Cut Operation]을 한번 수행하면 다음과 같다. 
		3 2 2 6
		(가장 짧은 길이인 2로 6개의 막대기를 잘라내고 길이가 0이 되버린 2개의 막대기는 버려진다.) 

		N개의 막대기와 그 각각의 길이가 주어졌을 때 [Cut Operation]을 모든 막대기가 버려질 때(길이가 0이 될때)까지 반복하고  
		수행 시 마다 남은 막대기의 수를 출력하는 프로그램을 작성하라. 

		[입력] 
		첫줄에 막대기의 수 N을, 다음 줄에 각각의 막대기의 길이를 공백으로 구분해서 입력한다.

		[출력] 
		매 줄마다 [Cut Operation]이 수행 되 때 마다 남은 막대기의 수를 출력 

		[제한] 
		1 <= N <= 1000
		1 <= 막대기의 길이 <= 1000

		입력 예제 #1
		6
		5 4 4 2 2 8

		출력 예제 #1
		6
		4
		2
		1

		입력 예제 #2
		8
		1 2 3 4 3 3 2 1

		출력 예제 #2
		8
		6
		4
		1 
		 */ 		


		int n = 1; //막대기 개수

		int [] sticks = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.print("막대기의 개수를 입력하세요: ");
		n = sc.nextInt();
		sticks = new int[n]; //막대기 길이가 이름인 변수들 배열

		for (int i = 0; i < n; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.printf("%d개의 막대기 중 %d번째 막대기의 길이를 입력하세요: ", n, i+1);
			sticks[i] = sc2.nextInt();
		}		
		System.out.println("\n"+Arrays.toString(sticks));


		cutOperation(sticks, n);



		//본인은 어떻게 로직 잡아서 할건지 글로쓰라고만 할것임
		//220쪽 예제 활용들 해보기

	}

	//가장 짧은 막대기의 길이로 모든 막대기를 자르는 것을 [cut operation]이라고 하자. 배열[i] - min	
	private static void cutOperation(int[] sticks, int n) {
		int idx = 0;
		int cutter = 0;
		int max = 0;

		for (int j = 1; j < sticks.length; j++) {
			if(sticks[idx]>0 && sticks[j]>0) {
			cutter = Math.min(sticks[idx], sticks[j]);
			}
			max = Math.max(sticks[idx], sticks[j]);
		}
	
		System.out.println("cutter : " +cutter);
		
	//문제: else에서 0으로 만들면 min(cutter)가 0으로잡혀서 이후연산이 안됨
		
		for (int i = 0; i < sticks.length; i++) {
			if(sticks[i] - cutter > 0)  {
//					System.out.printf("%d " , sticks[i] - cutter);
				sticks[i] = sticks[i] - cutter;
			} else {
				sticks[i] = days13.Ex01.arrayLeftshift(i); //이거 하면 될줄알았는데 안됨........
					
				sticks[n-1]= 0 ;
				n--;
			}
		}
		System.out.println(Arrays.toString(sticks));
		

		//반복하면 될거같은데 모르겟어서 일단 복사,,, 아니 될때도 있고 안될때도 있고 어쩌라는건지,,
//	
//		for (int j = 0; j < sticks.length; j++) {
//			if(sticks[idx]>0 && sticks[j]>0) {
//				cutter = Math.min(sticks[idx], sticks[j]);
//				}
//			max = Math.max(sticks[idx], sticks[j]);
//		}
//	
//		System.out.println("cutter : " +cutter);
//		for (int i = 0; i < sticks.length; i++) {
//			if(sticks[i] - cutter > 0)  {
////					System.out.printf("%d " , sticks[i] - cutter);
//				sticks[i] = sticks[i] - cutter;
//
//			} else {
//				sticks[i] = 0;
//			}
//		}
//		System.out.println(Arrays.toString(sticks));
	}


	}//cut함수

//}
//
//설명)))
//[]배열 중 가장 작은 min스틱 찾아옴: 2
//min으로 다 잘라냄 3 2 2 0 0 4
//0인 놈 제거
//그러고 또 min 찾아서 반복
//
//방법)
//먼저 오름차순으로 정렬
//첫 좌표가 제일 작은 값
//다음방으로 이동시키는데 같은 값이면 쓰루함 (다른 값이 나올때까지 진행)
//짤라가며 할필요없이 배열안에서 for문 한번만 돌리면 됨
//idx값 체크해서 뒤로 출력하고 이러면 된대,,	
//

