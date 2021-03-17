package days08;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 4:09:36 PM
 * @subject 가위바위보 입력받아서 컴퓨터랜덤이랑 대결
 * @content
 *
 */
public class Ex05_02game {

	public static void main(String[] args) {

		//1가위 2바위 3보

		System.out.println(">가위바위보를 입력하세요. 가위(1), 바위(2), 보(3); ");
		Scanner scanner = new Scanner(System.in);
		int user;
		user = scanner.nextInt();
		int com = (int)(Math.random()*3+1);

		
		String result = "tie"; // default 날려버리고 밖에 이렇게 빼놔도됨
		if(1<=user && user<=3) {
			switch (user-com) {
			case -1: case 2:
				result= "졌습니다.";
//				System.out.printf("user(%d), com(%d) - 당신이 졌습니다.", user, com);
				break;
			case -2: case 1:
				result= "이겼습니다.";
//				System.out.printf("user(%d), com(%d) - 당신이 이겼습니다.", user, com);
				break;

			default:
				result="비겼습니다.";
//				System.out.printf("user(%d), com(%d) - 비겼습니다.", user, com);
				break;
			}
		} else {
			System.out.println("1-3 숫자 내에서 입력하세요.");
		}

		
		//조건문 내에 짧게 두고 밖에 따로 빼놓는게 좋음
		String [] rps = {"", "가위", "바위", "보"}; //0,1,2,3 배열 초기화
		System.out.printf(">user(%s), com(%s)로 %s\n", rps[user],rps[com],result);

		
		//주민번호는 출신지역, 나이, 성별, 외국/내국인, 옳은건지 등 체크 내일 할 것 152페이지 관련₩	
	}

}
