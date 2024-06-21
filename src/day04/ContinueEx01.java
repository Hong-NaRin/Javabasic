package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if( i == 5) {
				continue; // 아래를 실행하지 않고 다음 반복문을 실행

			}
			
			System.out.println(i);
			
		}
		
		
		System.out.println("-----------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i == 5) {
				i++;
				continue; // 반복문의 다음으로
			}
			
			System.out.println(i);
			i++;
		}
	}
}
