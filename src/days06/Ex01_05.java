package days06;

public class Ex01_05 {

	public static void main(String[] args) {
		//ERR: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
		// String index out of range: 5
		
		//시험3. 이 에러 언제 발생하는지?
		
//		1. 동일한 자료형 + 메모리 상에 연속적으로 놓이게 한 것
//		2. 선언형식 : 자료형 [] 배열명 = new 자료형[배열크기];
//		예) 국어 점수 배열 선언

		//배열의 크기 : 배열명.length (뒤에 괄호x)
		
		
		int []kors = new int[3];
/*		kors[0]=90;
		kors[1]=90;
		kors[2]=90; */
		
		for (int i = 0; i <kors.length; i++) {
			kors[i]=90;
		}
		
		// 위 아래 둘다 똑같은 코딩 세번 반복 -> 반복문화
		
		//Exception in thread "main" 90
		//java.lang.ArrayIndexOutOfBoundsException: 3
		//방은 [0]~[2]까지밖에 없는데 그거 넘게 돌게 만들어?! 에러
		for (int i = 0; i <=kors.length; i++) {
			System.out.println(kors[i]);

		}
		
/*		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]); */
		
	}

}
