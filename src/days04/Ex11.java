package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 4:35:57
 * @subject 4일-12: 제어문 if문
 * @content
 *
 */
public class Ex11 {
	public static void main(String[] args) {
		//p136

		//제어문control statement : 프로그램의 실행 순서를 바꿔주는(제어하는) 문장.

		//if 치고 ctrl +스페이스
		//condition = 조건(식)
		
		//정수 하나 입력받아서 짝수면 짝수라고, 홀수면 홀수라고 출력
		//짝수 : 2n이라고 표현. 2로 나누면 0이 되는 수(2로 나누어 떨어지는)
		//홀수 : 2n+1이라고 표현. 2로 나누어 떨어지지 않는 수
		//정의를 읽어와서 수식으로 바꾸는 연습을 해야함
		
		int n = 11; 
		if (n%2 ==0) {
			System.out.println("짝수even number");
		} 
		
		//n%2 == 1 도 가능
		if (n%2 !=0) {
			System.out.println("홀수odd number");
		}
		
		//***0은 짝수도 홀수도 아니다.***
		
	}
}
