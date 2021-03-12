package days05;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 11:28:27
 * @subject 1+2+3+..10 = 55 에서 + 찍는거 더 간편한 방법
 * @content
 *
 */
public class Ex01_plus {
public static void main(String[] args) {
	

	//		  1+2+3+4+5+6+7+8+9+10=55 출력

	int sum = 0;

	for (int i = 1; i <=10; i++) {
		/*if (i==10) {
			System.out.printf("%d", i);
		} else {
			System.out.printf("%d+", i); 
		}*/
		//강사님 이거 더 선호하심
		System.out.printf(i==10? "%d" : "%d+" ,i);
		sum +=i;
		
//		\b = 백스페이스 누를 때 제어문자값
	}
	System.out.printf("\b=%d\n", sum);
	//1+2+3+4+5+6+7+8+9+10=55 결과에 저렇게 뜨는데 암튼 지워졌딴 뜻,,
}
}
