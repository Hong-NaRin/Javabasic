package day04;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		// 특정 조건까지 무한입력
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("5 x 3 = ?");
			System.out.println(">");
			int num = scan.nextInt(); 
			
			// System.out.println(num);  // 값을 계속 입력할 수 있음
			
			// 입력받은 값이 조건에 만족하면 탈출
			
			if(num == 15) {
				System.out.println("정답입니다!");
				break;
			}
			
			else {  // if에서 끝이 아닌 else까지 쓰게 되면 둘 중 하나는 무조건 실행해야 끝남
				System.out.println("틀렸습니다.");
			}
		}
	}

}
