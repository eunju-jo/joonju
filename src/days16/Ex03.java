package days16;

import days15.Student;

public class Ex03 {

	public static void main(String[] args) {

		// 240p 객체 배열(==클래스 배열)
		// 많은 객체를 다루고자 한다면 배열을 사용하자 : 객체 배열(클래스 배열)
		
/*		Student s1 = new Student();
		s1.no = 1;
		s1.name = "강현구";
		
		Student s2 = new Student();
		s2.no = 2;
		s2.name = "권희준";
		
		Student s3 = new Student();
		s3.no = 3;
		s3.name = "김나린";
		
		s1.printSungjuk();
		s2.printSungjuk();
		s3.printSungjuk();       */
		
		
		//클래스 배열 선언
		//배열선언형태: 자료형[] 배열명 = new 자료형[배열크기];
	
		//자료형=Student라는 '클래스 타입'
		//***students = 객체명이 아닌 '배열명'!!!
		
		Student [] students = new Student[3];
		
		char con = 'y';
		int cnt = 0;

		do {
			students[cnt] = new Student();
			students[cnt].no = 1;
			students[cnt].name = "강현인";
			cnt++;
		} while (Character.toUpperCase(con)== 'Y');
		
		for (int i = 0; i < students.length; i++) {
			students[i].printSungjuk();
		}
		
		   System.out.println("END");

//		students[0].name = "강현구";	//널포인트 익셉션 발생
		//students[0] 방의 객체를 생성하는 과정이 필요하기 때문
		
		 //널포인트익셉션 예외 발생
//		Student s1 = null;
//		s1.name = "홍길동";
		
	}
}
