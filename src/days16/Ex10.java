package days16;

import days15.TV;

public class Ex10 {

	public static void main(String[] args) {

		//괄호안에 없는거 = 디폴트 생성자
	//The constructor Data2() is undefined
	Data2 d1 = new Data2();
	System.out.println(d1.x);
	
	TV t1 = new TV("red", false, 10); //false =파워켜
	t1.power();
	
	}//mai

}//clas

// The type Data is already defined(같은 이름으로 있어서) -Data하면 
class Data2{
	
	Data2(){} //이렇게 해줘야 위에 Data2() is undefined에러 안남 
	//생성자를 오버로딩 했을 경우에는 이렇게 명시적으로 또 적어주어야 함
	
	//매개변수를 한개 갖는 생성자를 선언 --여기선 자동으로 추가안됨
	Data2(int i){
		x = i;
	}
	int x = 0;
}

//예제6-23 설명한것 // 써야될 경우도 있으까 추가하는것도 방법이다 알려준 것