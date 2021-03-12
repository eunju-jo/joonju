package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 4:30:01
 * @subject 삼항연산자 기본form 확인용 심플형태 샘플
 * @content 최대값 최소값 구하기
 *
 */
public class ThreeCondition {

	public static void main(String[] args) {

		int a= 5, b= 10, c=8;
		
		int max = a >b ? (a>c? a : c) :( b>c? b: c);
		int min = a >b ? (b>c? c : b) :( a>c? c: a);
		
		System.out.printf("max=%d, min=%d\n", max, min);
		
		
		//문제: 500개 정수 받아서 max, min 구하려면 어떻게 해야할까
		//[배열] 사용. 검색/정렬할 때 한답니다,,
		
		
	}

}
