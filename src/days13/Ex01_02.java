package days13;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01_02 {
	public static void main(String[] args) {

		//배열
		//1.배열크기 자동증가.감소가 되지 않아 임의적으로 개발자가 해주어야함
		//2.삽입 하기도 복잡함 삭제도 복잡함.
		//컬렉션 -> 구현한 클래스 -> 컬랙션 클래스
		
		ArrayList list = new ArrayList(3);
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list); //[10, 20, 30]

		list.add(100);
		System.out.println(list); 
		
		list.remove(2);
		System.out.println(list);
		
		list.add(1, 111);
		System.out.println(list);
		
		
		//실제 코딩은 이렇게 하면 됨.....
	}
}
