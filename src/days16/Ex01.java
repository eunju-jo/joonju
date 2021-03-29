package days16;

import days15.TV;

/**
 * @author 조은주
 * @date Mar 29, 2021 - 10:26:35 AM
 * @subject 239쪽 관련 - 내일 문제 1
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		//1.
		//TV t1 = new TV(); //new연산자로 t1이라는 객체가 생겨남
		//TV t2 = new TV();
		
		//2. 1번 2번의 차이??
		TV t1 = new TV();
		TV t2 = t1; //클래스 복사(copy) --- 클래스 복제(clone)랑 다름 [[후에 구분 필요]]
		
		//.(점) == 멤버임을 나타내는 연산자
		
		t1.color = "black";
		
		System.out.println(t2.color); // 같은 주소를 참조하기 때문
		
		
		
	}//ma
	

}//cla
