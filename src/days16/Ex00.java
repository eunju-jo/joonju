package days16;

import java.util.Scanner;

import days15.Student;

public class Ex00 {

	public static void main(String[] args) {

		String name;
		int no;
		
		Student [] student  = new Student[30];
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		char con = 'y';
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		
		do {
			System.out.print("1번부터 차례로 학생의 이름을 입력하세요: ");
			name = scanner.nextLine();
			
			
			
		} while (Character.toUpperCase(con)=='Y');
		
		
	}

}
