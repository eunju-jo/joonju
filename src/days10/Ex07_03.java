package days10;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 4:47:12 PM
 * @subject p264 기본형 매개변수와 참조형 매개변수(그림 설명 참조)
 * @content
 *
 */
public class Ex07_03 {

	public static void main(String[] args) {

		int x = 100;
		plusX(x);
		System.out.println(x);
		

		int [] xx = {100};
		plusX(xx);
		System.out.println(xx[0]);
	}//main

	private static void plusX(int x) { //value값만 여기로 넘어와서 101이 되고, 함수 호출이 끝난뒤 plusX 기억공간은 없어지고 main 복귀
		x += 1;
	}

	private static void plusX(int [] xx) { //같은 기억공간의 번지를 공유하므로, 여기서 변경된 xx[0]의 값이 main 함수에도 반영됨
		xx[0] += 1;
	}


}
