package days10_weekend;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 11:58:08 PM
 * @subject 주민번호 옳은지(맨 마지막 자리) 검증하기
 * @content
 *
 */
public class Re_Ex03 {

	public static void main(String[] args) {
		//마지막 자리 ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
		//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		//mod: 나머지 구하겠다 //다 곱한거를 % 11(나머지 구한거)해서 11에서 뺀다. ->이 값이 실제 주민 값과 같으면 옳은 주민, 다르면 틀린 주민 
		//다 구해서 나온 값 10일경우=1, 11일경우=0으로 표기.
		String rrn  = "650517-2018918";
		//index        01234567890123
		
		if( isRrnCorrect(rrn) ) System.out.println("정당한 주민번호입니다.");
		else System.out.println("잘못된 주민번호입니다.");
		
		
		
	}//main

	private static boolean isRrnCorrect(String rrn) {
		int tot = 0;
		int [] multi = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		for (int i = 0; i < multi.length; i++) {
			tot += multi[i] * (rrn.charAt(i)-48);
		}
		
		int ㅍ = 11 - (tot % 11);
		if (ㅍ ==10) ㅍ=1;
		else if(ㅍ ==11) ㅍ=0;
		int ㅎ = rrn.charAt(13)-48;
		return(ㅍ == ㅎ);
	}

}//class
