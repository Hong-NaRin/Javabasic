package day04;

public class MultiForEx01 {

	public static void main(String[] args) {
		
		// 반복의 중첩
		
//		for(int i = 1; i <= 10; i++) {
//			
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		
		// 모든 구구단
		for(int i = 2; i <=9; i++) { // 단수
			System.out.println("구구단 : " + i + "단"); // 구구단(단수) 시작하기 전
			for(int j = 1; j <=9; j++) { // 행
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("-------------------------");
		}
		
		
	}
}
