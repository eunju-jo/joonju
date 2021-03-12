package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 12:01:54
 * @subject 2일-5번 : 식별자(변수) 명명규칙
 * @content 정석 p25
 *		식별자: 프로그래밍에서 사용하는 모든 이름. 개발자가 명명한 것
 */
 
public class Ex05 {

	public static void main(String[] args) {

		//변수도 첫글자 치고 ctrl + 스페이스로 자동완성할 것
		
//규칙1: 자바는 대소문자를 구분한다.(name =/= Name)
		/* String name = "조은주";
		System.out.println( Name ); */
		//에러발생: Name cannot be resolved to a variable
	
		
// 규칙2: 식별자(변수, 함수, 클래스) 명명규칙들
		/*String _name;  //O
		String $name;  //O(안쓰는게 좋음)
		String name01;  //O
		String 1name; //X 숫자로 시작 불가
		String first name; //X
		String firstName; //O 카멜표기법(낙타쓰~)
		String int; //X 예약어 사용불가 */
		
	}

}
