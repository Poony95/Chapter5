package aaa;

public class FunctionTest {

	public static void main(String[] args) {
	 int num1 = 10;
	 int num2 = 30;
	 
	 int sum = addNum(num1, num2);
	 System.out.println(sum);
	}
	public static int addNum(int n1, int n2) {
		int result = n1 + n2; // 위의 num1과 n1은 같은 것이 아님 addnum에서 새롭게 생성된 변수이고, n1이 num1에 복사가 되어 사용될 뿐이다.
		return result;
		
	}
}

/* 메서드 
  함수의 일종, 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수
  
  함수란? 하나의 기능을 수행하는 일련의 코드. x(변수)=y
  중복되는 기능은 함수로 구현하여 함수를 호출하여 사용함.
  
  int add (int num1, int num2) {
  	int result;
  	result = num1 + num2;
  	return result;
  	}
  	
  1. 함수이름 : 함수의 기능과 관련하여 명명 = add
  2. 매개변수 : 함수의 수행을 위해 필요한 변수 = int num1, int num2
  3. return : 함수 수행 결과를 반환하기 위한 예약어
  4. 함수반환형 : 반환 값의 자료형을 나타냄, 반환 값이 없는 경우 void라고 씀 = int
 */
