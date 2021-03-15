package days06;

import java.io.IOException;

public class Prac01_02 {

	public static void main(String[] args) throws IOException {

		int one;
		
		System.out.print("한 글자 입력 : ");
		one = System.in.read();
		System.out.printf("%d\n", one);

		System.in.skip(System.in.available());
		//여러 글자를 입력해도 나머진 주석 처리 되도록 
		
		System.out.print("한 글자 입력 : ");
		one = System.in.read();
		System.out.printf("%d\n", one);
		
	
		
		
		
	}//main

}
