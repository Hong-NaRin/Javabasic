package day06;

public class MethodEx01 {
	
	public static void main(String[] args) {
	
		/*
		 * 메서드는 다른 메서드 안에 선언할 수 없다.
		 * main = 메서드
		 * 
		 * main 밖, 클래스 안 어디서든 선언할 수 있다.
		 */	
		
		// 함수의 호출
		int result1 = calSum();
		System.out.println("1~10까지 합: " + result1);
		int result2 = calSum();
		System.out.println("1~10까지 합: " + result2);
		
		String result3 = randomStr();
		System.out.println("결과: " + result3);
		
		// 리턴이 있는 함수는 출력문 안에서 바로 호출이 됩니다
		System.out.println("결과: " + randomStr());
	}
	
	// 반환 유형 - 메서드 이름
	static int calSum() {
		
		System.out.println("calSum 호출됨");
		// 1~10까지 합계
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum; // 함수를 호출한 자리로 돌아감 -> 제일 위에 int result1 = calSum();으로
	}
	
	static String randomStr() {
		String str = "";
		
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
		
	}
	 
}
