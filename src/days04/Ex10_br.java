package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_br {
	public static void main(String[] args) throws IOException {

		int a, b, c;

		System.out.printf("> 이름, 국어, 영어, 수학 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String value = br.readLine();

		String [] values = value.split("\\s*,\\s*"); //배열

		a = Integer.parseInt(values[0]) ;
		b = Integer.parseInt(values[1]); 
		c = Integer.parseInt(values[2]); 

		int max =  a > b ? ( a > c ? a : c ) :  ( b > c ? b : c )   ;
		int min  =  a > b ? ( b > c ? c : b ) :  ( a > c ? c : a)   ;
		
		//a>b		b>c
		System.out.printf("> 가장 큰 값 : %d \n >가장 작은 값: %d \n", max, min);
	}

}