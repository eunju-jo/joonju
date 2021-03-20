package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 11:15:23 AM
 * @subject 함수오버로딩 (월요일 시험)	 - 올려주신거 확인해서 수정 맞는답 출력이 안됨 ;	
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {


	int [] m = new int[10];
	fillM(m);
	int n = getNumber();

	int begin = 0;

/*	while (true) {
		int idx = sequenceSearch(m,n,begin);
		if(idx == -1) break; //끝까지 다 돌면 브렉 (-1: 끝까지 돌았다는 뜻)	
		System.out.println(idx);
		begin = idx + 1;
	}
*/	
	
	//위랑 같은 코딩
	int idx;
	boolean flag = false;
				//검색해온 결과물을 idxㅇㅔ 대입 -> 끝(-1)을 만날 때까지 돌아라 (-1이 되면 루프 나가라)	
	while ((idx = sequenceSearch(m,n,begin))!= -1) {
	//if(idx == -1) break; //끝까지 다 돌면 브렉 (-1: 끝까지 돌았다는 뜻)	
	System.out.println(idx);
	begin = idx + 1;
	
	flag = true;
	}		
	
	if(!flag) { //=(flag == false)
		System.out.println("찾는 정수는 없습니다.");
	}
	
/*	idx = sequenceSearch(m,n,begin);
	System.out.println(idx);

	begin = idx +1;// 이 과정이 반복되어야 함
	idx = sequenceSearch(m,n,begin);
	System.out.println(idx); 
*/	
	
	}//main  
	
	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 찾고자하는 정수? : ");
		int n = scanner.nextInt();
		return n;
	}

	private static void fillM(int[]m) {
		 m = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(20)+1;
		}

		System.out.println(Arrays.toString(m)); //배열에 담긴거 출력		
	}

	
	// return이 아니라 void로 처리해버리면 이함수는 찾는 용도 외에 다른 용도로 더 쓸수가 없음.
	// --> main 함수에서 return 값으로 다른 연산에 더 활용할 수 없다는뜻. 그러니 리턴으로 하는게 좋음
	private static int sequenceSearch(int[] m, int n) {
		for (int i = 0; i < m.length; i++) {
			if(m[i]== n ) return i;
		}
		return -1;
	}
	
	//오버로딩												찾기 시작하는 위치 begin	추가 	
	private static int sequenceSearch(int[] m, int n, int begin) {
		for (int i = begin; i < m.length; i++) {
			if(m[i]== n ) return i;
		}
		return -1;
	}
}
