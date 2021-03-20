package days10;

import com.sun.org.apache.xerces.internal.impl.xs.SubstitutionGroupHandler;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 10:23:42 PM
 * @subjects String.substring() 메서드
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

		//index       0123456789~
		String rrn = "980328-2199222";
		//98 03 02 두 글자씩 읽어와야 함
		
		//char chatAt(index) - 1글자씩 읽기
		//String String.substring() 메서드
		//rrn.substring(beginIndex, endIndex);

		String year = rrn.substring(0,2); 
		String month = rrn.substring(2,4); // 03(월)을 읽어오려면 2번(비긴)~ 4번(앤드) 줘야 함/앤드 앞자리까지
		String day = rrn.substring(4,6);
		
		System.out.printf("출생년도: %s년 %s월 %s일", year, month, day);
		
		//endIndex를 설정하지 않으면 문자열 끝까지 짤라옴
		//rrn.substring(beginIndex);

		System.out.println();
		//실제 데이터는 다 있지만 출력은 980328-2******로 나오길 원할 때
		System.out.println(rrn.substring(0, 8) + "******"); 

		//이러면 되지만 굳이 String.concat()써서 연습해보겠음 : 문자열 연결 메서드
		System.out.println(  rrn.substring(0, 8).concat("못보여드려요") );
	}

}
