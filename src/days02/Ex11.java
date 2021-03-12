package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 4:03:10
 * @subject 2일-11번
 * @content Integer.toBinaryString() 
 * 					: int값을 2진수로 바꿔주는 함수
 *
 */
public class Ex11 { 
	public static void main(String[] args) {
	
		int i = 10;
		System.out.printf("%d \n",i); //10진수
		System.out.printf("%#o \n",i); //8진수
		System.out.printf("%#x \n",i); //16진수
		//#를 왜 붙이드라?
		
		//2진수는?
		//10진수 10 = 2진수 1010
		System.out.printf("%s \n",Integer.toBinaryString(i));
		//[결과] 1010
		
		//Integer.toBinaryString(); 표현 외우기 (int값 2진수로 변환)
		//결과는 "문자열(String그래서 %s)"인 "1010"을 나타냄.

	}
}
