package day04;

public class BreakEx03 {
	
	public static void main(String[] args) {
		
		// 중첩반복에서 break
		// 탈출을 위한 변수를 활용
//		boolean bool = false;
//		
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c + "-" + l);
//				
//				if(l == 'e') {
//					bool = true; // if문을 실행했음을 나타냄
//					break; // 원래는 가장 가까운 바로 위의 for문을 빠져나오지만 bool을 쓰면서 바깥으로 빠져서 다른 if문 실행
//				}
//			}
//			
//			if(bool) { //true였으면 완전 탈출
//				break; 
//			}	
//		}
		
		// 이름 붙이기
		// 중첩 반복문에서 바깥 반복문을 완전히 탈출하려면 탈출할 반복문에 이름을 붙여준다
		ex:for(char c = 'A'; c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				
				if(l == 'e') {
					break ex; // 위의 ex를 빠져 나오겠다(break 뒤에 탈출할 이름을 적으면 됨)
				}
	 
		
			}
		
		}
		
		
		
	}
}



	
		