package days16;

/**
 * @author 조은주
 * @date Mar 29, 2021 - 11:06:56 AM
 * @subject 클래스 참조의 개념 - swap 예시
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		
		//Call by Value X
		//Call by Reference O 참조타입을 매개변수로 넘겨서 swap하면 바뀌는거,, 기억하지.. [배열] 참조타입
		
		//클래스 사용해서 swap 코딩하기
		
		Test obj = new Test();
		System.out.printf("> x=%d, y=%d\n", obj.x, obj.y);
		
		swap(obj); // obj라는 객체를 참조 -- 그 기억공간을 바꿀 수 있게되는 것
		
		System.out.printf("> x=%d, y=%d\n", obj.x, obj.y);
		
		
		
	}
	
	private static void swap(Test obj) {
		int temp = obj.x;
		obj.x = obj.y;
		obj.y = temp;
		
	}


}

class Test {
	int x = 10;
	int y = 20;
}
