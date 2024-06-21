package day04;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		// 사각형 출력 (가로 5, 세로 4)
		/*
		 *****  1행 5번
		 *****  
 		 *****
		 ***** 
		 */
		 
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt(); // 가로
		int h = scan.nextInt(); // 세로
		
		for(int i = 1; i <= h; i++) { // i가 세로의 길이보다 작을 때까지(행)
			
			for(int j = 1; j <= w; j++) {
				if(i == 1 || i == h) { // 처음이나 마지막 행
					System.out.print("*");
				}
				
				else {
					if( j == 1 || j == w ) {  // 처름이나 마지막 열
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			
			System.out.println();
			
		}		
		
	}
	
}
