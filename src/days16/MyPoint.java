package days16;

// x y 좌표점을 관리하는 유용한 필드, 메서드를 구현한 클래스
public class MyPoint {

	//두 개의 필드 가정
	public int  x;
	protected int  y; //이거 주나안주나 상속 안배워서 지금은 딱히.. 디폴트나 프로텍티드나 비슷함 상속 모르니까
//	private int z; // 얘와 같은 클래스는 MyPoint{ } 이 안에 있는 이거
	
	//생성자 오버로딩
	//생성자[함수] 선언 (리턴자료형 아예 안붙임) -디폴트 생성자 만들어봤음
	public MyPoint () {
		//객체 생성할 때 자동으로 호출됨
		//()는 객체 생성할 때 함수 호출한다는 의미
		System.out.println("> MyPoint Default Constructor");
	}

	public MyPoint (int i, int j) {
		x = i;
		y = j;
		System.out.println("> MyPoint 2 Constructor");
	}
	
	
	
	
//	public int getZ(){
//		return z;
//	}
//	
	//z를 set으로 받아와서 getZ으로 보내기 (private 처리)
	
//	public void setZ(int value) {
//		z = value;
//	}
//	
	
	public MyPoint(int i) {

		y = x = i; //대입은 오른쪽부터
		System.out.println("> MyPoint 1 Constructor");
	}

	//메서드
	public void pointOffset(int n) { //함수 원형, 프로토타입  -- 선언부
		x += n;                      //함수 몸체           -- 구현부
		y += n;
	}
	
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	
	//메서드명 == plusPoint / Mypoint라는 클래스도 하나의 자료형
	//리턴자료형이 클래스타입으로 되도록 선언한 것 - 의미보다 이렇게 될 수 있다 보여주려는 것
	//매개변수 자료형 : 클래스타입으로 되도록 선언한 것 - 이것도 마찬가지 (리턴자료형, 매개변수 자료형 둘다 될 수 있음)	
	
/*	public MyPoint plusPoint(MyPoint p) {
		//새로운 마이포인트 객체 mp생성한 것
		MyPoint mp = new MyPoint();
		mp.x = x + p.x; // Ex04 관련 설명: x(호출한 p1의 x == 10) + p2.x(==100) 
		mp.y = y + p.y; // 
		
		return mp; //mp의 주소값을 반환
	}
	
*/
	
	public MyPoint plusPoint(MyPoint p) {
		MyPoint mp = new MyPoint();
		mp.x = this.x + p.x; // Ex04 관련 설명: x(호출한 p1의 x == 10) + p2.x(==100) 
		mp.y = this.y + p.y; // 
		
		return this; //mp의 주소값을 반환
	}
}
