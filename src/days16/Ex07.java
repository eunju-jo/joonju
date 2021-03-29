package days16;

/**
 * @author 조은주
 * @date Mar 29, 2021 - 2:18:12 PM
 * @subject 268p 예제 책 설명 쭉 읽어보기
 * @content
 *
 */
public class Ex07 {
	public static void main(String[] args) {

		//자동으로 컴파일해서 만든다고..?	
		Data d1 = new Data(); //default constructor 호출함
		d1.x = 100;
		
		// 클래스 복사를 하겠다(copy) --d2를 만들어서 한 인스턴스의 (같은) 주소값을 가져와서 똑같이 참조하겠다
		
//		Data d2 = d1;
		
		// 클래스 복제(clone) --똑같은 기억공간을 하나 더 떠오겟다
		
		//책에선 copy로 썼지만 강사님은 clone으로 침
//		Data d2 = new Data();
		
//		d2.x = d1.x; //새로운 인스턴스가 만들어짐 (안에 값도 똑같이 다 세팅해오는 것)	
		
		//복제하는 clone() 메서드를 선언, 호출
		Data d2 = clone(d1);
		System.out.println(d2.x);
		
		
		//277p 메서드 종류
		//1. 인스턴스 메서드
		//2. 클래스 메서드(==정적 메서드, static 메서드)
		
		
	}

	private static Data clone(Data d1) {
		Data temp = new Data();
		temp.x = d1.x;
		
		return temp; //이거를 결국 d2에담아 남는것임
	}
}

class Data{ 
	int x; //필드 하나만 존재 
	}