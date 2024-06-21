package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		// 단항 연산자 - 항이 1개인 것
		
		// 부호 연산자 
		int i = +3; // + 생략 
		int j = -i;  
		
		// 증감 연산자 ++, --
		int k = 1;
		int h = k++; // 후위연산 - 먼저 값이 대입되고, 그 다음에 증가 
		
		System.out.println("k 값:" + k); // 2
		System.out.println("h 값:" + h); // 1
		
		int x = 1;
		int y = ++x; // 전위연산 - 먼저 값이 증가되고, 그 다음에 대입
		
		System.out.println("x 값:" + x); // 2
		System.out.println("y 값:" + y); // 2
		
		System.out.println("-----------------------");
		
		// 비트 연산자 ~
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101 -> -11
		System.out.println(~b + 1); // -10 (보수 - 더했을 때 0이 되는 수)
		
		System.out.println("-----------------------");

		// 논리 반전 연산자 !
		System.out.println(!true); // false
		System.out.println(!false); // 조건식을 세울 때 사용
		
		boolean bool1 = !true;
	}
}
