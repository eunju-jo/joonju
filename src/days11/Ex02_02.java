package days11;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 11:18:34 AM
 * @content
 * @subject sum()함수를 재귀함수로 만들기
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

//		int result = sum(10);
		int result = recursiveSum(10);
		
		System.out.printf("result = %d\n", result);
		
	}//main

	
	// n = 10  --> 10 + else문 (recursiveSum(9)) -- n=9 + recursive(8) - ...
	//recursive(1) => n ==1 return 1;
	// 10 + 9 + 8 + 7... +1 = 55
	//리턴문이든 어디든 함수 안에 자기자신을 호출하는게 있으면 재귀함수
	//재귀함수는 가능한한 사용하지 않는것이 좋음 -- 처리속도 엄청 늦음 
	//트리구조를 검색하거나 찾아갈 때는! 재귀함수가 좋음 (c드라이브- 폴더-폴더-폴더.이런식으로 찾아들어갈 때)
	private static int recursiveSum(int n) {
		if ( n == 1 ) return 1; 
		else 		  return n + recursiveSum(n-1);
	}

	//1~n 까지의 합을 반환하는 함수 //선언하고 호출 안하는건 전혀 에러안남
	private static int sum(int n) {
		int hap	 = 0;//함수명도 sum 변수명도 sum이면 에러남. 가능하면 같은 이름으로 주지 않는게 좋음
		for (int i = 0; i <=n; i++) {
			hap +=i;
		}
		return hap;
	}

}//class
