package days06_night;

public class Ex02 {

	public static void main(String[] args) {

		//선긋는 함수 호출부 = '기능담은 함수명()'; 요 형태로 메인에 먼저 선언!
		drawLine();
        System.out.println("부서원 : 사원명");
		drawLine(14,'-');
        System.out.println("생산부 : 강하라");
        System.out.println("총무부 : 권나라");
        System.out.println("영업부 : 김라희");
        System.out.println("생산부 : 김민주");
		drawLine(2);
	
	}//main

	//함수 선언부. 선언부()안에는 반환할 매개변수 변수종류가 정해진 경우 안에 선언(int n);
	private static void drawLine() {
		System.out.println("**************");
	}

	//라인수든, *수든 for문 조건 설정해서 원하는대로 가능 --오버로딩overloading
	private static void drawLine(int n) {
		for (int i = 0; i < n; i++) {	
		System.out.println("**************");
		}
	}

	private static void drawLine(int n, char style) {
		for (int i = 0; i < n; i++) {	
			System.out.print(style);
			if(i == n-1) System.out.println();
		}
	}
}//class

