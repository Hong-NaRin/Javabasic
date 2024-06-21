package day04;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		// 바깥에 반복횟수에 따라서 다르게 회전하는 반복문
		
//		for(int i = 1; i <=5; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		 
//		int star = 5;
//		for(int i = 1; i <= star; i++) { // 행
//			 
//			 for(int j = 1; j <= i; j++) { // 열
// 				 System.out.print("*");
//				 
//			 }
//			 System.out.println();
//
//		 }
//		
//		System.out.println("-------------------------------");
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		int s = 5;
//		for(int i = 1; i <= s; i++) {
//			
//			for(int j = 1; j <= s+1-i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("-----------------------------");
//		
//		
//		for(int i = 1; i <= s; i++) { // 행
//			
//			for(int j = s+1-i; j>= 1; j--) { // 열
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("-----------------------------");

		/*
		// 별을 찍기 전에 공백을 출력
		     * 
		    ** 
		   *** 
		  ****
		 ***** 
		 */
		
		for(int i = 1; i <= s ; i++) { // 행
			
			for(int j = 1; j <= s-i; j++) { // 열, 공백 출력하는 for
				System.out.print(" "); 
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*"); 
			}
			
			System.out.println();
			
		
		}
		System.out.println("-------------------------------");
		
		/*
		     * 
		    *** 
		   *****
		  ******* 
		 ********* 
		 */
		
		for(int i = 1; i <= s; i++) { // 행
			
			for(int j = 1; j <= s - i; j++) { // 열, 공백출력 for
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
		
			
			System.out.println();
		 }
		
	}	
}
