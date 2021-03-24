package days13;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {

		//취업문제 ego
		//String n = "keNik";
		//String m = "kKnie";
		
		//위 두 문자열 n,m이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 (t/f)
		//조건: 대소문자는 구분하지 않는다

		
		
/*		//문자열 대-소문자로 아예 전환 후 sort .  길이가 다르면 바로 false, 같으면 비교하다 하나라도 다르면 if문밖으로 나가 false	
		
		String n = "keNik";
		String m = "kKnie";
		
		System.out.println( n.length() == m.length()); //길이 같다면 밑에 진행
		
		n = n.toUpperCase();
		m = m.toUpperCase();
		
		System.out.println(n +"/" + m);
		
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);
		char [] mArr = m.toCharArray();
		Arrays.sort(mArr);
		
		System.out.println(Arrays.toString(nArr));
		System.out.println(Arrays.toString(mArr));
		
		for (int i = 0; i < mArr.length; i++) {
			if(mArr[i] != nArr[i]) false
		}
		//true		막말쩔어;안뽑는대
		
		*/
		
		String n = "keNik";
		String m = "kKnie";
		
		//1.대문자 변환
		//3.char [] ->String
		char [] nArr = n.toUpperCase().toCharArray();
		char [] mArr = m.toUpperCase().toCharArray();
		
		//2.정렬작업 - 멀티스레드로 정렬 작업 = parallelSort(처리 속도 빠름)	__ jdk 1.8부터 새로 추가
		Arrays.parallelSort(nArr);
		Arrays.parallelSort(mArr);
		
		//4.equals() 로 문자열 내용 비교
		n = new String(nArr);
		m = new String(mArr);
		
		boolean b = n.equals(m);
		
		System.out.println(b);
		
	}

}
