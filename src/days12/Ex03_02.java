package days12;

import java.util.Arrays;

public class Ex03_02 {

	public static void main(String[] args) {

		int [] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*101); //0~100
		}
		System.out.println(Arrays.toString(score));
		
		//배열 중 최대값, 최소값 구하기
/*		int max, min;
		max = min = score[0];// 0번째는 여기 들어갔으니 밑엔 1번부터
		// ** 01 12 이렇게 계속 비교해야되니 0번을 처음부터 max/min과 같이 원하는 값으로 두면 편함.
		// ** 이 생각을 못해서 코드를 짜다가 꼬였음
		
		for (int i = 1; i < score.length; i++) {
			if(score[i] > max) max = score[i];
			else if(score[i] < min) min = score[i];
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		System.out.println("-------------------------------");
		
		for (int j = 0; j < score.length; j++) {
			if(score[j] == max) System.out.printf("최대값 %d는 %d번째 자리에 위치합니다.\n", max, j+1);
			if(score[j] == min) System.out.printf("최소값 %d는 %d번째 자리에 위치합니다.\n", min, j+1);
		}
		
*/
		//수업때 나간 것
		
		//내가 짠 코딩
		int idx = 0;
		int max , min;
		max = min = score[0];  
		while (idx < score.length) {
			 max = Math.max(max, score[idx]); 
			 min = Math.min(min, score[idx]);
			++idx;  
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
		for (int j = 0; j < score.length; j++) {
			if(score[j] == max) System.out.printf("최대값 %d는 %d번째 자리에 위치합니다.\n", max, j+1);
			if(score[j] == min) System.out.printf("최소값 %d는 %d번째 자리에 위치합니다.\n", min, j+1);
		}
		
	}//main

}//class
