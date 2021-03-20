package days10;

import java.util.Random;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 10:09:01 AM
 * @subject 최신버전들어 생긴 임의의 난수 찾는 클래스가 있음
 * @content Random 클래
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//랜덤 클래스
		//0 <= int nextInt(bound) < bound
		//1~45정수
	
		Random rnd = new Random();
		//rnd.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(rnd.nextInt(45)+1);
		}
		
	}

}
