package days13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 11:35:50 PM
 * @subject Ex01_02 참고하여 ArrayList로 변형	
 * @content
 *
 */
public class Ex01_prac {
	static ArrayList mm = new ArrayList(3);
	
	static String [] menus = {  
			"입력 add",
			"수정 update",
			"삽입 insert",
			"삭제 delete",
			"출력 disp",
			"검색 search",
			"종료 exit"
	};
	
	static int num; //메뉴 선택 후 선택한 메뉴번호 저장할 변수
	static char con = 'y';
	static Scanner scanner = new Scanner(System.in);
	static int idx = 3;
	
	
	public static void main(String[] args) throws IOException {
		mm.add(10);
		mm.add(20);
		mm.add(30);
		
	
		while(true) {	 //메뉴 보여주고 - 고르고(고른번호 입력)  - 고른번호 case 실행되도록 무한 반복
			dispMenu(); //String menus 어디서든 접근할 수 있어서 (menus) 안보내줘도 ok
			selectMenu();
			processMenu();
		}
	}//main
	
	private static void processMenu() throws IOException {
		
		switch (num) {
		case Menu.ADD://add
			add(); //배열에 0번째 방부터 채워넣으려는 함수
			break; //break 후 메인함수 process()가면 또 while에 갇혀서 계속 메뉴출력 반복됨
		case 2://update
			update();
			break;
		case 3://insert
			insert();
			break;
		case 4://delete
			delete();
			break;
		case Menu.DISP://disp
			disp();
			break;
		case 6://search
			search();
			break;
		case Menu.EXIT://exit
			exit(); //함수 종료할 때 아예 그냥 함수 호출해서 처리
			break;
		}


	}
	private static void search() throws IOException {
		//순차검색sequence search
		System.out.print("> 검색할 값 입력: ");
		int searchNum = scanner.nextInt();
		
		for (int i = 0; i < idx; i++) {
//			if(mm.indexOf(searchNum)!=-1) 
//			if(mm.equals(searchNum)) 
				System.out.printf("%d 위치에 있습니다.", i);
		} 

		//indexOf는 
		//> 메뉴 선택: 6
		//> 검색할 값 입력: 1
		//0 위치에 있습니다.1 위치에 있습니다.2 위치에 있습니다.3 위치에 있습니다.4 위치에 있습니다.
		//> 계속하려면 엔터 치세요.
		
		//equals는
		//> 메뉴 선택: 6
		//> 검색할 값 입력: 1

		//> 계속하려면 엔터 치세요.
		
		//이렇게만 출력되어서 궁금합니다
		
		pause();
	}

	private static void update() throws IOException {
		System.out.print("> 수정할 위치 입력: ");
		int updateIndex = scanner.nextInt();
		int updateNum = scanner.nextInt();
		
		
		mm.set(updateIndex, updateNum);
		
		
		pause();
		
	}

	private static void delete() {
		// 1. 삭제할 인덱스 입력
		// 2. 삭제할 다음 인덱스 위치부터 앞으로 이동시키기
		// 3. 마지막 요소는 0으로 초기화
		// 4. idx 는 1감소
		
		System.out.println("> 삭제할 위치 입력: ");
		
		int deleteIndex = scanner.nextInt();
		mm.remove(deleteIndex);
		
//		arrayLeftshift(deleteIndex);
//		m[idx-1]= 0 ;
//		idx--;
		
	}
	

	private static void insert() throws IOException {
		System.out.print("> 위치와 정수를 입력하세요: ");
		int insertIndex = scanner.nextInt();
		int insertNum = scanner.nextInt();
		
		mm.add(insertIndex, insertNum);
		
//		arraySizeCheck(); //1 마지막 자리idx 애가 밀리면서 들어갈 데가 없을 수 있으니 자리 미리 늘리기
//		arrayRightShift(insertIndex); //2 기존 애들 들어갈자리부터 하나씩 오른쪽으로 밀고
//		m[insertIndex] = insertNum; //3 삽입된 데이터는 원하는 자리에 원하는 값으로 새로 정의
//		idx++;		
		
		
		pause();
	}


	private static void disp() throws IOException {
		clearScreen();
		System.out.printf("[배열출력]\n");
		
		System.out.println(mm);
//		for (int i = 0; i < idx; i++) {
//			System.out.printf("m[%d]=%d\t", i, m[i]);
//			if(i%2 == 1) System.out.println();
//		}
		pause(); //바로 메뉴 출력되지 않게 일시정지
	}

	private static void pause() throws IOException {
	System.out.print("\n> 계속하려면 엔터 치세요.");
	System.in.read();
	System.in.skip(System.in.available());
	
	}

	private static void add() throws IOException {
		clearScreen();
		do {
			System.out.printf(">[%d번] 인덱스에 채울 정수 입력?", idx);
			mm.add(scanner.nextInt());
//			int n = scanner.nextInt();
			//배열크기 체크 - > 배열크기 증가
//			arraySizeCheck();
			
//			mm[idx++] = n;
			idx++;
			
			System.out.print(">계속 입력하시겠습니까?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
				
		} while (Character.toUpperCase(con)=='Y');
		
	}


	private static void exit() {
		clearScreen(); //화면 깨끗이 지우는 작업(함수 있다 치고);	
		System.out.println("\n\n프로그램 종료!!");
		System.exit(-1); //int로 메인에넘겨주는건데 무슨 숫자줘도 일단 상관없음
	}
	
//	[System.exit()]
//  System.exit(0)는 매우 정상적인 종료 방법입니다. 
//	처리할 것만 다 처리했다면 사용해도 됩니다. 
//	이 함수가 호출되면 내부적으로 정리할 것들도 다 정리한 후 종료하기 때문에 강제 종료도 아니고, main 메서드가 끝나는 것과 마찬가지입니다.
//  덧붙여, main이 종료될 때 내부적으로 exit(0)을 호출하는 것으로 알고 있습니다. 
//	단, 0 이외의 수가 들어가면 정상 종료가 아닌 것으로 판정하게 됩니다.
	

	private static void selectMenu() {
		System.out.print("> 메뉴 선택: ");
		num = scanner.nextInt();

	}

	private static void dispMenu() {
		clearScreen();
		System.out.printf("[%s]\n", "메뉴선택");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\n", i+1, menus[i]); //메뉴 수만큼 for문 돌려서 1번부터(i(0)+1) 메뉴 출력하도록
		}
	}

	private static void clearScreen() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
	}
}//class


//enum 열거형 switch에 주석 없으면 이름모르니까 부여 
//가독성 위해 이렇게 밑에 쓰고 스위치문 수정 가능

class Menu {
	static final int ADD = 1;
	static final int DISP = 5;
	static final int EXIT = 7;
}