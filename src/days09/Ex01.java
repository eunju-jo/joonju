package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 10:51:28 AM
 * @subject 프로그래머스 코테연습 1단계 1번
 * @content 두 개 뽑아서 더하기
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		//프로그래머스 코테연습1단계 1번 문제
		//https://programmers.co.kr/learn/courses/30/lessons/68644
		// 정수 배열 numbers가 주어집니다. 
		// numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 '더해서' 
		// 만들 수 있는 모든 수를 배열에 '오름차순'으로 담아
		// return 하도록 solution 함수를 완성해주세요.

		int [] numbers = { 2, 1, 3, 4, 1};
		//뭐하자는건가 	각 자리끼리 더해보기
		// 3 5 6 2
		// 4 5 2
		// 7 4
		// 5
		
		// 2 3 4 5 6 7 정렬시 이게 solution으로 나와야된다,,
		//1. 중복체크 작업
		//2. 정렬sort	(오름차순)
		
		int [] result = solution(numbers);
		//2,3,4,5,6,7 나오도록 	

	//index = number[0] 에서 0 =첨자
		
		
	}//main

	//솔루션을 완성해라
	public static int[] solution(int[] numbers) {


		int[] answer = {};
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(i == j) continue;
			}
		}
		
		
		//위에 값을 answer배열에 저장
		//중복체크해서
		//정렬하기
		//나중에 제약조건 체크도 해야됨
		
		return answer;	
	}


	}
