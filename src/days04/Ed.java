package days04;

import java.util.Scanner;

public class Ed {
   public static void main(String[] args) {


//문제: 세 정수 a b c를 입력해서 가장큰수, 가장작은수 구해서 출력

      int a, b, c;
      
      System.out.print(" > 세 정수를 입력하세요 ?");
      
      Scanner scanner = new Scanner(System.in);
      
      String value = scanner.next();
      String[] values = value.split("\\s*,\\s*");   
       
      a = Integer.parseInt(values[0]);
      b = Integer.parseInt(values[1]); 
      c = Integer.parseInt(values[2]); 
      //ERR:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
      
      
      int max = a > b ?  a : (b>c? b : c); 
      int min = a > b ? b : (b>c? c : b);
      System.out.printf("> 가장 큰 값 : %d \n >가장 작은 값: %d \n", max, min);
      
   }
}