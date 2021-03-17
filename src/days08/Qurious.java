package days08;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 12:08:13 AM
 * @subject flag 써서 입력 반복시키기
 * @content
 *
 */
public class Qurious {

	public static void main(String[] args) {

		String subject = "국어";
	   boolean flag = false;
	   String data;
	   String regex = "[1-9]?[0-9]|100";
	   Scanner scanner = new Scanner(System.in);
	   
        do {
            if(flag) System.out.println("입력오류. 다시 입력하세요. \n");
            System.out.printf("%s 점수를 입력하세요: ", subject);
            data = scanner.next();
            data.matches(regex);
        } while (flag = !data.matches(regex));		

        System.out.printf("국어점수는 %s입니다.",data);
        
	}//main

}
