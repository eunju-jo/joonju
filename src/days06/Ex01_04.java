package days06;

public class Ex01_04 {

	public static void main(String[] args) {
		//scanner에는 한 문자를 읽어갈 메소드가 왜 없을까
		//"a" -> 'a' 바꾸고 싶음
		//앞서 한 거에서 한글 치면 깨짐 -read는 1byte만 읽을 수 있기 때문
		//0~255 값만 읽을 수 있음
		//한글 '가'라고 입력했을 때는 깨져서 출력됨. 이유는? + 해결점?
		
//		System.out.printf("%d\n",(int)'가'); //결과:44032
		

		//"a" -> 'a' 가능할까? 못해 
		//문자열 = 문자가 여러 개 나열된 것 이기 때문.
		//형변환이라기 보다는 글자 하나만 꺼내오는 것
		//"a" == 'a' + '\0(null)' -> 'a'만 끄집어내오기
		//문자열 다루는 함수: split(),trim(),replace(),equals(),equalsIgnoreCase()
		
		String name = "홍길동"; //이 문자열에서 한 문자열을 얻어와서 char 돌려주겠다
		char one = name.charAt(0);
		System.out.println(one);
		//charAt(index) : 문자열 속에서 내가 원하는 위치(index)의 한 문자를 반환하는 함
		
		//ERR:Duplicate local variable one(위에 char one 쓰고 밑에 또 char one 썼다)
		one = name.charAt(1);
		System.out.println(one);
		
		one = name.charAt(2);
		System.out.println(one);
		
	}//main

}