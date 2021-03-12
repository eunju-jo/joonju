package days02;
 
/**
 * @author 조은주
 * @date 2021. 3. 9 - 오전 11:39:43
 * @subject 2일-4번 : 두 변수 값 교환
 * @content 23쪽 문제4
 * 					교환시 temp 변수 활용
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		int x = 10; 
		int y = 20;
		
		System.out.printf("> x=%d, y=%d \n", x, y);
		//printf ()에 들어갈 것 x=10, y=20 이런식으로 써놓고 복붙해서 수정하면 편한
		
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.printf("< x=%d, y=%d", x, y);
		
	}//main

} //class
