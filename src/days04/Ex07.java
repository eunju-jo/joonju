package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 2:48:44
 * @subject 4일-7번 : char의 유니코드 
 * @content 56쪽
 *
 */
public class Ex07 {

	public static void main(String[] args) {

/*
		// 'A' -> 65 문자코드값으로 저장 / 'a' -> 97저장
		char ch = 'A';
		//char ch = 65;로 출력해도 동일 결과
		
		//ch = ch +32;
		//ERR :Type mismatch: cannot convert from [int] to char
		
		ch = 'A'+32; 
		//'A' + 1 = 'B', '+2='C'
		//대문자(UpperCase)를 소문자(LowerCase)로 변환 = 'A' + 32;
		System.out.printf("ch=\'%c\'\n", ch);
		//결과: ch='a' */
		
		char ch = 'a' -32; 
//		System.out.println(ch); //결과 : A
//		System.out.printf("%c[%d]", ch, (int)ch ); //결과: A[65]
		
		System.out.printf("%1$d - %1$c", 97);
		//굳이 (char)안해도 char로 출력됨
		//뒤에 97,97 안써도 1$ 쓰면 같은 변수 여러번쓰기 가능
		
		
		System.out.printf("%1$d - %1$o - %1$x", 10);
		//어차피 10이라는 같은 매개변수 쓸 때는 10, 10, 10 쓰는것보다 1$ 써서 갖다쓰는게 더 간결
		
		// 0 = 정수0
		// '0' == 문자0 == 48(아스키코드값/ 1-49, 2-50)
		
		System.out.println( 1 - 1); //0
		System.out.println( '1' - 1); //48
		
		//103-106쪽 읽기
		
		//108쪽 음수 나누기: 음수 다 무시하고 일단 연산하고 왼쪽 피연산자 부호 붙이면 됨
		//114 밑에
	}

}
