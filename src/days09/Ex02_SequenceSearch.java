package days09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:34:12 AM
 * @subject 9일: Ex02 로또 이어서 (fillM에서 중복제거법)	
 * @content
 *
 */
public class Ex02_SequenceSearch {

	public static void main(String[] args) {

		// 검색(search)할 수 있어야 함.
		//이진검색(Binary Search)	
		// 아래 순차검색(Sequence Search) : 순차적으로 검색하기
		int [] m = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			m[i]=(int)(Math.random()*50 +1); //1-50 사이 난수 발생
		}
		
		//출력작업하는 법 for문 안에 넣는거 대신 밑에거 함 암기
		
		//Array 클래스 : 배열을 다루는 클래스(배열을 손쉽게 다루기 위한)
		
//		String Arrays.toString(m)
		System.out.printf("%s\n", Arrays.toString(m));
		//단지 그 값안에 뭐가 들어있는지 확인하는 용도
		//앞으론 포문 돌리는 대신 이걸로 볼 것
		
		System.out.print("> 검색 할 정수를 입력하세요. :");
		Scanner scanner = new Scanner(System.in);
		int searchNumber = scanner.nextInt();
		//원하는 수가 배열에 있나 보려면 0번방 ~n번째방까지 차례로 체크
		//100은 당연히 없는 수 -> 끝까지보고도 없으면 -1 반환(방은 0~n이니까)	
		
		
		//찾은 위치[index=첨자]반환: 배열안에서 찾을 정수가 어디 위치에 있는지
		//lastIndexOf() : 뒤부터(마지막방부터) 찾겠다
		int idx = indexOf(m, searchNumber); //선언 후 	함수 만들기
//		int idx = lastindexOf(m, searchNumber); //선언 후 	함수 만들기
		
		if(idx == -1){
			System.out.println("> m 배열안에 찾는 정수 searchNumber는 없습니다.");
		} else {
			System.out.printf("%d는 %d(index)에 있습니다.\n", searchNumber, idx	);
		}
		System.out.println(" = END = ");
		
	}

	//뒤에부터 찾기	복사하다 뭐 잘못했는지 안돌아감
/*	private static int lastindexOf(int[] m, int searchNumber) {
		int idx = -1;
		for (int i = m.length-1; i>=0; i--) {
			if(m[i] == searchNumber) return i; //원하는 값 찾으면 그 값 i 리턴해주고 나가겠다
			// return해서 못나갔으면 원하는 수 없다는 뜻
//			if(m[i] == searchNumber) {
//				idx = i;
//				break;
			}
			 // 위아래 어떻게 쓰나 상관없음 성능은 주석처리된게 더 굿
		}
*/	
		
	//앞부터 찾기
	private static int indexOf(int[] m, int searchNumber) {
		int idx = -1;
		for (int i = 0; i < m.length; i++) {
//			if(m[i] == searchNumber) return i; //원하는 값 찾으면 그 값 i 리턴해주고 나가겠다
			// return해서 못나갔으면 원하는 수 없다는 뜻
			if(m[i] == searchNumber) {
				idx = i;
				break;
			} // 위아래 어떻게 쓰나 상관없음 성능은 주석처리된게 더 굿
		}
		
		return idx; //그러니 -1 반환 (걍 변수선언 안하고 -1 줘도됨)	
		
	}//main

}//class
