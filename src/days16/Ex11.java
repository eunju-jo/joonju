package days16;

import java.util.ArrayList;
import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {


		ArrayList list = new ArrayList(); // 비우면 10개 요소가 기본 
//		ArrayList list = new ArrayList(10); // 배열 10개 잡은 것처럼 기억공간 10개 집합

//		ArrayList list = new MyArrayList(); // 10개 요소가 기본 
//		ArrayList list = new MyArrayList(20); // 10개 

		long seed = System.currentTimeMillis(); //1970.01.01. 0.0.0.0시간(0시~) 기준으로 밀리세컨드 값으로 계
		//1000ms = 1s
		//ns나노세컨드 = 10의 9승분의 1
		System.out.println(seed); //1617000608353 시간흐를수록 더 큰값
		
		long nano = System.nanoTime();
		Random rnd = new Random(seed); //long형 seed값
		System.out.println(nano); //1617000608353 시간흐를수록 더 큰값

	}//mai

}//cla

class MyArrayList{
	
	int [] m ;
	
	public MyArrayList() {
		 m = new int[10];
	}
	public MyArrayList(int initialCapacity) {
		 m = new int[initialCapacity];
	}
	
}
//295까지 설명했음ㅡ