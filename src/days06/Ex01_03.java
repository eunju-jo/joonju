package days06;

public class Ex01_03 {

	public static void main(String[] args) {
		
		String name = "홍길동선생"; //이 문자열에서 한 문자열을 얻어와서 char 돌려주겠다
		char one; 
/*		one = name.charAt(0);
		System.out.println(one);
		one = name.charAt(1);
		System.out.println(one);
		one = name.charAt(2);
		System.out.println(one);
		one = name.charAt(3);
		System.out.println(one);
		one = name.charAt(4);
		System.out.println(one);   */
		
		System.out.println(name.length()); //int 반환
		int len = name.length();
		
		//앞으로도 이런식으로 자주 쓸 것 
		//ERR: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
		// String index out of range: 5
		//4개인데 <=로 찍어서 에러났던 것(01_05 참고해서 이해)
		for (int i = 0; i <len; i++) {
			one = name.charAt(i);
			System.out.println(one);
		}
		//문자열의 길이가 바뀌더라도 바꿀 필요가 없으려면
		//문자열 길이 반환 함수 : length()
		
		
		
/*		//홍길동 10번찍기 이해하고 있음을 가정
		for (int i = 1; i <=10; i++) {
			System.out.printf("%s ",name);
		}
*/		
		
		
		
	}//main

}