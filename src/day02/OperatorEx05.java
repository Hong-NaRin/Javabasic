package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		// 3항 연산식을 보기 전에, 프로그램에서 랜덤값을 만드는 방법
		
//		double d = Math.random(); // 랜덤한 실수를 돌려줌
//		System.out.println(d); // 0이상 ~ 1미만 랜덤 실수값
		
		int d = (int)(Math.random() * 10);  // 0~9까지 랜덤 정수값
		System.out.println("랜덤 수:" + d);
		
		// 3항 연산식
		// 조건 ? 연산1 : 연산2;
		
		String result = d % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		// System.out.println( d % 2 == 0 ? "짝수" : "홀수"); -> 변수에 저장하지 않을 때
		
	}
}
