package days16;

public class Ex06 {
	String name; //필드 
	
	public static void main(String[] args) {
		
		
		//필드: 클래스변수
		//인스턴스 변수 : static 키워드 설명하면서하겠음 
		//지역변수 
		
		int age ;
		age = 10; //지역변수는 반드시 초기화해야 사용가능
		System.out.println("age: " +age);
		//메서드 선언시  int hap(int a, int b) //매개변수,parameter
		//메서드 호출    hap(10,20)            //인자, argument, 인수
		
		int [] m = new int[10];

		change(m); //참조형 매개변수 call by Reference
		System.out.println(m[5]); //100

		int n = 10;
		change(n); //기본형 매개변수 call by Value	
		System.out.println(n); //10
		
	}

	private static void change(int n) {
		n = 100;
	}

	private static void change(int[] m) {

		m[5] = 100;
	}
}


//241.242쪽 잘 읽어보고 넘어가면 됨 (245까지)
//246보면 변수 메서드 설명 있