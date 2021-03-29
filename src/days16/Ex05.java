package days16;

import days15.Student;

public class Ex05 {

	public static void main(String[] args) {

		// 멤버(필드, 메서드) 앞에 private 접근지정자를 선언하면
		// 클래스의 내부에서만 접근,참조 가능함
		
		//MyPoint 클래스와 Ex05 클래스는 같은 패키지 안에 있음
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20; // 같은 패키지에서 가능
		
		
		// [ private 선언된 필드에 접근하는 방법 ]
		// p1.z = 100; 불가능했음
		
//		1. private int z; 필드의 접근지정자를 public으로 수정. 방법이라기엔 점..
//		2. private 필드(z)에 접근할 수 있는 public으로 선언된 메서드를 선언하기!
//			getter, setter	 (다른 언어에선 get,set이라고 보통 부름)
		
		
		//매번 이럴게 아니라 그 기능이 물건 안에 들어가 있음 더 좋은 물건 --> setKor에 넣
		Student s1 = new Student();
		int kor = 101;
		
//		if(0<=kor && kor <= 100) {
//			s1.setKor(101);
//		} else {
//			System.out.println("국어 점수 범위 벗어남");
//			return;
//		}	
//		System.out.println(s1.getKor());
		
	s1.setKor(kor);

	//읽기전용 만들기 (getter ONLY)
	s1.getTot(); // 읽기작업은 O, setTot();은 안되니 쓰기작업은 X
	
	// 필드 - 읽기전용(getter), 쓰기전용(setter)
	
	
	}

}
