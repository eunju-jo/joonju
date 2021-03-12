package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 5:02:57
 * @subject switch문
 * @content
 *
 */
public class Ex12 {
	public static void main(String[] args) {

		//분기문 : switch문
		//케이스 여러개 오기 가능
		//디폴트 없어도됨

		//key 값: 정수, 문자열, 수식, 변수도 가능
		//value 값: 리터럴(상수)만 가능. 변수는 X
		//default : 위에 적은 케이스 이외의 경우.
		//sw하고 컨/스페이스로 기본형식출력		
/*		switch (key) {
		case value:
			
			break;

		default:
			break; 
		}//switch */
		
//		[문제]정수를 입력받아 짝 홀수 출력
		
		int n =11;
		
		switch (n % 2) {
		case 0:
			System.out.println("짝수even number");
			break;

		default:
			System.out.println("홀수odd number");
			break;
		}//switch
		
	}//main
}//class
//괄호 점점 많아지니 이렇게 달길 추천