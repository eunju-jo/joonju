package days11;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 4:37:49 PM
 * @subject 192쪽 배열의 복사, 194쪽 
 * @content System.arraycopy() 함수 이용해 배열 복사 더 간단하게 가능
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int [] m = {10, 20, 30, 40};
		// 20,30만 복사해서 temp 맨뒤에 두고 싶을 때 - srcpos : 0부터 시작이니 1 부여
	 
		System.out.println(Arrays.toString(m)); //[10, 20, 30]

		int [] temp = new int[10];
		// System.arraycopy() 1.기능copy 2.매개변수src, srcPos,dest, destPos, length 3.리턴값void
		// System.arraycopy(src(복사할 대상), srcPos(from포지션), dest(목적지), destPos(to포지션), length);
//		System.arraycopy(m, 0,temp, 0, m.length);
		System.arraycopy(m, 0,temp, 3, m.length); //[0, 0, 0, 10, 20, 30, 40, 0, 0, 0]
		System.arraycopy(m, 1,temp, 8, 2); //[0, 0, 0, 10, 20, 30, 40, 0, 20, 30]

		System.out.println(Arrays.toString(temp));
		
	}

}
