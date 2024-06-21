package day01;

public class DataTypeEx {

	public static void main(String[] args) {
		// 정수형 타입
		byte a = 127;  // -128 ~ 127까지만 저장됨 
		byte a1 = -128;  // 컴퓨터에서 아주 중요한 단위
		
		short b1 = 32767;
		short b2 = -32768;
		
		int c = 2147483647;
		int c2 = -2147483638;  // 기본타입
		
		long d = 123123123123L;  // L을 붙임
		System.out.println(d);
		
		/*
		 * 2진수 -> 0b 붙임
		 * 8진수 -> 0 붙임
		 * 16진수 -> 0x 붙임
		 */
		int bin = 0b1010;  // 이진수 1010
		System.out.println("이 진수 1010은: " + bin + "입니다.");
		System.out.println("-------------------------------");
		
		// 실수형 타입
		float f1 = 3.14F;  // f를 붙임
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.141592653F;  
		double d2 = 3.141592653;  
		System.out.println(f2); // 실수부분 7자리수까지 저장
		System.out.println(d2); // 실수부분 15자리수까지 저장
		
		// e표기법 - 나타낼 수 있는 소수점 자리가 너무 크거나, 작은 경우에 컴퓨터가 알아서 써줌
		float f3 = 314.159265e-2F;
		float f4 = 0.021415e2F;
		System.out.println(f3);
		System.out.println(f4);
		
		System.out.println("-------------------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
	}
}

