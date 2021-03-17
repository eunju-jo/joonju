package days08;

public class Ex05 {

	public static void main(String[] args) {
/*
		double pi = 3.141592;
		//소수점 3째자리에서 반올림하고 싶음 (0.00까지 표기)
		// Math.round() -> 무조건 소수점 첫째자리에서 반올림
		
		//314.[1]592에서 100으로 나누고 double처리 (혹은 *0.01)하면 됨
		System.out.println((double) Math.round(pi*100)/100); //Math.round()는 long형 반환
		System.out.println(Math.round(pi*100)*0.01);
																*/

		//컴퓨터 자동으로 가위(1), 바위(2), 보(3) 난수(임의의 수)를 발생시켜야 함
		
//		0.0 <= Math.random() < 1.0  //double 값으로 반환
		
		for(int i = 0; i<100 ; i++ ) {
//			System.out.println(Math.random());
			System.out.println((int)(Math.random() *3)+1); //1-3사이 만들은 
		} //0~1 사이 긴 소수가 나옴
		
//		0.0 * 3 +1 <= (int)( Math.random() *3)+1 < 3.0(=1*3)+1 //->여기서 내림 해버리면
//						(int)(Math.random() *3)+1
				//0~1 사이의 값을 원하는대로 이렇게 바꿀 수 있어야함 (1~3이 되도록))
		
		
		
//		int kor = 0 - 100 난수 발생시키기
		for(int i = 0; i<100 ; i++ ) {
			System.out.println((int)(Math.random() *101)); //1-100 사이 난수 
		}
		//101 곱하면 0.0 ~ 101.0 이라서 int로 형변환 해줘야함
		//0<= 랜덤 < 101 (0~100)
	
		
		//로또 번호 추첨 1~45까지 난수 발생
		System.out.println((in)(Math.random()*45 +1));
		
		
	}//main

}
