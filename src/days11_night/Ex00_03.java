package days11_night;

public class Ex00_03 {

	public static void main(String[] args) {
//		main() 메서드의 매개변수(String [] args)에 본인의 친구 이름 3명을 입력받아서 실행하는 코딩을 하세요.
		
		if(args.length != 3 ) {
			System.out.println("매개변수 부족/초과로 실행을 종료합니다.");
			return;
			
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}
		
		
	}

}
