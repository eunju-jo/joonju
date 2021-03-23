package days12;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 10:43:04 AM
 * @subject char[] 배열을 String으로 변환하기
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

	//[1]char[] -> String 변환하기
		char [] a = {'k', 'e', 'n', 'i', 'k'};
	
		
		// 코딩으로 직접 실현
//		String bb = "";
//		// "" + 'k' + 'e' + 'n'하면 되듯 할 것임

//		for (int i = 0; i < a.length; i++) {
//			bb += a[i];
//		}

		//기존에 존재하는 함수
		String bb = new String(a);
		
		System.out.println(bb);
		
	//[2] String -> char[] 변환하기
	String b = "kenik";

	
	//캐릭터 배열로 변환해주는 기존 함수가 존재함(기억하기)
//	char [] a = b.toCharArray();
	
	//기존 함수랑 비슷한 함수를 만든다고 가정(이것도 셤)	
	char [] aa = toCharArray(b);
	
	System.out.println(Arrays.toString(a));
	
	}//main

	
	//알고 있는 함수로 구현한것
	//String -> char[]: toCharArray() 
	private static char[] toCharArray(String b) {
		char [] a = new char[b.length()]; //문자열 길이만큼 방 부여
						 //b.length()=5 문자열 길이만큼 charAt()에 넣겠
		for (int i = 0; i < b.length(); i++) {
			a[i] = b.charAt(i);
		}		return a;
	}

}//class
