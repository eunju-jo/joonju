package days13;

import java.sql.Array;
import java.util.Arrays;

public class Ex08_prac {

	public static void main(String[] args) {
		//취업문제 ego
		//위 두 문자열 n,m이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 (t/f)
		//조건: 대소문자는 구분하지 않는다

		String n = "keNik";
		String m = "kKnie";
		
	
		char [] nArr = n.toUpperCase().toCharArray();
		char [] mArr = n.toUpperCase().toCharArray();
		
		Arrays.parallelSort(nArr);
		Arrays.parallelSort(mArr);

		n = new String(nArr);
		m = new String(mArr);
		
		System.out.println(n.equals(m));
		
	}//ma

}//cla
