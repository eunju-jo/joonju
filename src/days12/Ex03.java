package days12;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 11:11:17 AM
 * @subject 교재 배열 예제 : 총합과 평균
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

	//총합과 평균
	int [] score = { 100, 88, 100, 100, 90 };	
	int sum = 0;

	//foreach문으로 (향상된 for문. 확장 for문) -- 전체적으로 반복할 때
	for (int n : score) {
		 sum += n;
	}
	
	System.out.printf(">총합: %d \n", sum);
	double avg = sum / score.length;
	System.out.println(">평균 : " + avg);
	
	
	}//main

}//class
