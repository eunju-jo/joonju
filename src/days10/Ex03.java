package days10;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 2:27:30 PM
 * @subject 주민번호 옳은지 여부 검증
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		//마지막 자리 ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
		//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		//mod: 나머지 구하겠다 //다 곱한거를 % 11(나머지 구한거)해서 11에서 뺀다. ->이 값이 실제 주민 값과 같으면 옳은 주민, 다르면 틀린 주민 
		//다 구해서 나온 값 10일경우=1, 11일경우=0으로 표기.
		String rrn  = "650517-2018918";
		//index        01234567890123

		if ( isRRNCheck(rrn) ) {
			System.out.println("올바른 주민번호입니다.");
		} else {
			System.out.println("잘못된 주민번호입니다.");
		}
		

	}//main

	private static boolean isRRNCheck(String rrn) { //is~하면 boolean으로 자동으로 되나봄,,	

		//ㄱㄴㄷㄹㅁㅂ-ㅅㅇㅈㅊㅋㅌ[ㅍ]
		//int ㄱ = Integer.parseInt(rrn.substring(0,1));
		
		int tot = 0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <=12; i++) {
			tot += (rrn.charAt(i) - 48) * m[i] ; //2345670892345
			//'-'는 *0하면 안들어가니까,,                 ^ 0을 주자. if문같이 걸러내거나 건너뛸필요도 없어짐
			
		}
		
		int ㅍ = 11 - (tot % 11);
		if (ㅍ ==10) ㅍ=1;
		else if(ㅍ ==11) ㅍ=0;
		int ㅎ = rrn.charAt(13)-48; //마지막 원래번호 ㅍ을 ㅎ 으로 가정
		return ㅍ == ㅎ; //true or false 나오니까
		
//		int tot = (rrn.charAt(0)-48) *2;
			//->ㄱ*2 값
		//tot += (rrn.charAt(1~12)-48)*i++;
		
								
		}

}//class
