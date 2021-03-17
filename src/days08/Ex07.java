package days08;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 4:17:53 PM
 * @subject 향상된 for문 : 166p	(for.each문)(확장for문)
 * @content JDK1.5이후 ~ 배열 또는 컬렉션에 저장된 요소의 값을 접근해서 사용할 때 편리함
 *			foreach문 : 값을 출력하는 쪽에서 씀
 */
public class Ex07 {

	public static void main(String[] args) {
		int[] m = new int[10];
		
		fillM(m); //난수를 발생시켜서 배열 각 요소에 채워넣는 함수
		
		outputM(m); //출력함수
		
		
		
	}//main

	private static void outputM(int[] m) {
/*		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]",m[i]);
		}
		System.out.println();*/
		
	//m이라는 배열에서 int변수(변수명은i말고도 맘대로)에 담아서 출력하겠다
	for (int i : m) {
		System.out.printf("[%d]",i);
		//sum +=i; //배열안에 발생한 모든 것에 대한 합을 구하고 싶다
	}
		System.out.println();
	}

	private static void fillM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			m[i]= (int)(Math.random()*100+1);
		}
		
		
	}

}
