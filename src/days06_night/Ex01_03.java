package days06_night;

public class Ex01_03 {

	public static void main(String[] args) {

		String name ="홍길동선생";
		//여기서 한 글자씩 받아와서 출력하라
		
		char one;
        int len = name.length();
        //name.length();를 for문 안에 넣는 것보다 따로 변수 상정하는게 더 좋은 코딩!
        
		for (int i = 0; i <len; i++) {
		one = name.charAt(i);
		System.out.println(one);
		}
		
		
		
		
	}//main

}//class
