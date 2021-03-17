package days07;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 2:15:05 PM
 * @subject 7일: 배열의 초기화의 의미
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

		//"배열의 초기화"의 의미
		/* String [] names = new String[3];
		names[0]="강하다";
		names[1]="권나래";
		names[2]="김다래"; */

		//위랑 아래 둘 어떻게 하든 다 배열 초기화
//		String [] names = new String[] {"강하다",	"권나래","김연아"};
//		String names [] = {"강하다",	"권나래","김연아"}; 이렇게도 가능은한데 그냥 알아만 두기
		String [] names = {"강하다",	"권나래","김연아"};
		// 이형태로 제일 많이 쓸 것임

		//names[3]="김과자";
		//ERR:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//방 세칸밖에 없는데 네번째방에 들어가면 곤란하다

		//배열크기 : 배열명.length
		System.out.println("배열 크기 : " + names.length);
		//가장 마지막 요소 index값 == UpperBound == 윗첨자값 == 배열크기-1
		System.out.println(">UpperBound : " + (names.length-1));
		//										괄호쳐줘야함
		//가장 작은 첨자는 java는 무조건 0
		
	}

}
