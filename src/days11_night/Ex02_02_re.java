package days11_night;

public class Ex02_02_re {

	public static void main(String[] args) {
		// sum함수를 재귀함수로 만들기
		int result = sum(10);
		int result2 = recursiveSum(10);

		System.out.printf("result = %d\n", result);
		System.out.printf("result2 = %d\n", result2);


	}

	private static int recursiveSum(int i) {
		if( i == 1 ) return i;
		else return i + recursiveSum(i-1);
		
		
	}

	
	private static int sum(int i) {
		int sum = 0;
		for (int j = 1; j <=10; j++) {
			sum +=j;
		}

		return sum;
	}

}
