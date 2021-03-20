package days09;

/**
 * @author k≡N¡k
 * @date 2021. 3. 18 - 오전 10:51:55
 * @subject 답 주신거 확인용 저장 ((설명 여기 내가 추가로씀!!)) 참고
 * @content
 *
 */
public class Ex02_instruct {

   public static void main(String[] args) {
      
      // 로또6/45 번호 발생  -> 배열 추가 -> 출력.
      int [] lotto = new int[6]; 
      
      fillLotto(lotto);
      
      printLotto(lotto);

   } // main

   private static void printLotto(int[] lotto) { 
      for (int i = 0; i < lotto.length; i++) {
         System.out.printf("[%02d]", lotto[i]);
      }
      System.out.println();
   }

   // 1~45 임의의 수(난수)를 lotto 배열에 채워넣는 메서드(함수)
   // [38][18][18][04][40][35]   
   /*
   private static void fillLotto(int[] lotto) { 
      for (int i = 0; i < lotto.length; i++) {
         lotto[i] = (int)( Math.random()*45 ) +1;
      }
   }
   */
   
   
   
   //  [12][13][32][0][0][0]
   //                        ↑ 
   private static void fillLotto(int[] lotto) {
       // lotto[0]
       int  n =   (int)( Math.random()*45 ) +1;
       System.out.println( n ); //난수 발생시킨 n 프린트 테스트
       lotto[0] = n; //아래 	중복체크할 필요 없으니 발생된 난수n으로 고정
       
       // lotto[1]~lotto[5]확인 위함 
       int idx = 1; // 2,3,4,5
       
       boolean flag = false;  // 중복되지 않는다 

       
       // lotto[1]~lotto[5]확인 위함 
       //1번째방에서 시작해서 5번째방까지 반복
       while ( idx <= 5 ) {
          flag = false; // 난수 발생할 때마다 초기화해야되서 여기 또 들어가는 것
          n =   (int)( Math.random()*45 ) +1;
          System.out.println( n );
          // 로또번호 중복체크
          for (int i = 0; i < idx; i++) {
            if(  n == lotto[i] ) {
               flag = true;  // 중복된다.// 트루되면 다시 while만나서 체크체크
               break;
            }
         }
          
          if( !flag ) {
             lotto[idx] = n;
             idx++;
          }          
      } // while
      
   }

} // class












