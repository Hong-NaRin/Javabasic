package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		// 연산시에도 형변환이 일어난다.
		char c = 'A'; 
		int i = 2;
		
		
		/* 연산에서의 형변환 
		*  1. int 보다 착은 타입의 연산은 무조건 int가 된다
		*  byte + byte = int
		*  byte + short = int
		*  short + short = int
		*  int + short = int
		*/
		System.out.println(c + i);  // int
		
        // char cc = c + i ;  -> 정수가 출력 되어야 하므로 오류 발생
		char cc = (char)(c + i);
		
		byte b1 = 3;
		byte b2 = 5;
		int b3 = b1 + b2;  // int
		
		
		int k = 3;
		double d = 3.14;
		
		// 2. int 보다 큰 타입의 연산은 큰 타입을 따라가게 된다.
		System.out.println(k + d);  // long + double = double
		
		
	}
}
