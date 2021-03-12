package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 2:02:39
 * @subject 4일- 04_02번
 * @content 증감연산자(++ --) 전위, 후위 차이점
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// ++ -- 증감연산자
		// 전위형
		// 후위형
		
		int x = 10;
		//int y = ++x;
		//System.out.printf("x=%d, y=%d \n", x, y);
		//결과: x=11, y=11 

		
		int y = x++; //y(좌항)에 대입 '먼저' 한 후 x가 증가되는 것.
		System.out.printf("x=%d, y=%d \n", x, y);
		//결과: x=11, y=10  (윗 전위 중복연산 않고 각각 연산했을 경우 가정)

		
	}

}
