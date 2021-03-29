package days16;

import com.apple.concurrent.Dispatch;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class Ex04 {

	public static void main(String[] args) {

		/* 
		클래스 앞에 붙이는 접근지정자의 종류 / 특징 (암기)
		클래스의 멤버(필드, 메서드) 앞에 붙이는 접근지정자의 종류 / 특징
		
		종류는 둘 다 동일
		
		ㄱ. 	public : 어디서든지(패키지 내부 + 외부) 참조 가능
		ㄴ. default : 패키지 내부에서만 참조 가능
		ㄷ. protected : default 기능(패키지 내부 참조) + 패키지 내부 상속 관계 가능 ( protected가 더 범위가 큰 것)
		ㄹ. private	: 같은 클래스 내부에서만 참조 가능 _ (같은)내부패키지X, 외부패키지X

		
		
		 */
		
		
		
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		
		p1.dispPoint(); // p1이 dispPoint를 호출함
		// 호출하는 객체가 p1. 그래서 호출객체 p1.x, p1.y임

		
		
		// 호출하는 객체가 p2. 그래서 호출객체 p2.x, p2.y임
		MyPoint p2 = new MyPoint();
		p2.x = 100;
		p2.y = 200;
		p2.dispPoint(); // p1이 dispPoint를 호출함
		
		//호출한 주체인 '객체'는 p1. p2는 plusPoint() 메서드를 호출할 때의 '매개변수'가 됨.
//		MyPoint p3 = p1.plusPoint(p2);
//		p3.dispPoint(); //> x=110, y=220
		//MyPoint 마지막 함수의 주석 참고
		
		p1
		.plusPoint(p2) //--요기까지 실행되면 mp 객체 글케 되는 것
		.dispPoint();
		//> x=110, y=220 위 주석과 똑같은 결과 출력
	
		
		p1.pointOffset(5); // 이거 하고 마이포인트를 돌려줘야 이어하는데 void니까 밑에 오류발생 
		p1.dispPoint();
		
//		p1.pointOffset(5).dispPoint(); //이거는 오류남
		
		
	}//mai
	

}//clas
