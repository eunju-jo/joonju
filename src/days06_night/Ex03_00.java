package days06_night;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 10:29:16 PM
 * @subject 6일: 두 정수의 합을 구해서 반환하는 함수(메서드)를 선언하고 호출하는 예제
 * @content
 *
 */
public class Ex03_00 {

	public static void main(String[] args) {

		int a = 10 , b = 20;
		int n = hap(a,b);
		System.out.printf("%d+%d=%d\n",a,b,n);
		
	}

	private static int hap(int a, int b) {
		return a + b;
	}

}
