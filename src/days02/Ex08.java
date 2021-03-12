package days02;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 3:01:56
 * @subject 2일-8번: 정수계열 byte, short, int, long
 * @content
 *
 */
public class Ex08 {
 
	public static void main(String[] args) {

		//정수계열 byte(1), short(2), int(4), long(8)
		//1byte = 8bit
		//1short= 16bit
		
		byte b; //256가지 -128~127
		short s; //65,536가지 -32,768 ~ 32,767
		int i; //-2,147,483,648 ~ 2,147,483,647
		long l; // -900경 ~ 900경
		
		//1bit: 표현 가지 수 (2가지) 0 or 1 	2^1
		//2bit: 				 (4가지) 0,1,2,3  2^2
		//8bit:				 (?가지)				2^8 = 256가지
		// 				-128~127표현(0포함)			ㄴ 128(양수) 128(음수)
		//자바는 전부 반 나눔(양수/음수)
		//16bit: 			(?가지) 2^16=65,536가지
		//32bit:				(?가지) 2^31= (아예 1빼서 나중에 범주 /2 안해도 되게)
		//64bit: -900경~900경
	}

}
