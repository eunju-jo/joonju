package days15;

public class Ex05 {
	public static void main(String[] args) {

		int i;
//		System.out.println(i); // 컴파일 오류 떨어짐 The local variable i may not have been initialized
		//지역변수: 반드시 초기화해야 사용가능했음
		
		//책에 있는 멘트 중 이해 안가면 그 멘트 찝어서 질문하거나 하고,, 책 ch 6,7 읽어보기
		
		//클래스명TV 객체명t1
		TV t1 = new TV(); //new 연산자로 객체 생성
		
		//객체명.필드 or 객체명.메서드  ----- 객체명(쩜)으로 하는거지 클래스명.필드/메서드 (X)
		//클래스의 필드는 초기화하지 않아도 사용할 수 있고, 각 자료형의 기본값으로 초기화되어져 있음. ((중요)) --필드에 넣을게 없음 굳이 초기화할 필요 없다는 말	
		System.out.println(t1.power);
		System.out.println(t1.channel); // 명시적으로 선언한다면 그 값으로 초기화됨 (하지않으면 각 자료형 	기본값)	
		System.out.println(t1.color);
		
		//boolean의 기본값 : false인 것도 기억
		
		TV t2 = new TV();
		//TV클래스는 하나 선언했지만, 객체(t1,t2)는 두개 만든것. 티비 두개
		//t2 - color - blue한다면 t1은 그대로고 t2만 블루되는 것
		//함수 코드 영역에 함수 코드 자체가 올라감(채널업 등) 이 올라간 함수의 주소값이(t2.color) 각각에 들어가있는 것
	
		t2.color = "blue"; // t2만
		t1.channel = 11; //t1만 바뀌는 것
		t1.channelUp();
		System.out.println(t1.channel);//12
		
		
		System.out.println(t2.color);//blue
		
		t1.power(); // 꺼져있음 키고 켜져있음 꺼라 --- 메서드 power();
		System.out.println(t1.power); // -- 필드 power호출
		 
		
		
	}
}
