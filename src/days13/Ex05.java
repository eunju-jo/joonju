package days13;

public class Ex05 {

	public static void main(String[] args) {

		// 219쪽 가변배열 
		//30명씩 4개반
		
		//문제) 각 반마다 인원이 다르다면?
//		int [] kors = new int[25+17+30+21]; //하면 되나 계산이 복잡함..
		//그렇다고 다 30씩 만들기엔 3반빼고는 다 메모리 낭비 발생
		
		//아래가 이상적이지만 남더라도 그냥 
		//보통은 int [][] kors = new int[4][30];으로 주는 편
		
		int [][] kors = new int[4][]; //반마다 다르니 열개수는 빼놓기
		kors[0] = new int[25];
		kors[1] = new int[17];
		kors[2] = new int[30];
		kors[3] = new int[22];
		
		for (int i = 0; i < kors.length; i++) {
			for (int j = 0; j < kors[i].length; j++) {
				System.out.print("[ ]");
			}
			System.out.println();
		}
		
		//자바에서는 2차원 이상의 배열을 '배열의 배열' 형태로 처리함.
		// 2차원 이상의 다차원 배열을 생성할 때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고,
		// 추후 다시 각기 다른 길이의 배열을 설정해 유동적인 가변 배열을 구성할 수 있음/	
		
// 지정한대로 각기 다르게 인덱스 설정 가능
//		[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
//		[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
//		[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
//		[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
		
		
	}//main	

}//clas	
