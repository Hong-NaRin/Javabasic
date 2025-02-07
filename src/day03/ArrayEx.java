package day03;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		// 배열의 선언
		int[] arr;
		
		// 배열의 생성 - 생성할 때 크기를 지정
		arr = new int[5];
		
		System.out.println(arr); // 상자가 만들어진 위치(주소값)
		
		// 배열의 초기화 - 상자 값을 대입하는 작업
		arr[0] = 10;  
	 	arr[1] = 20;
	 	arr[2] = 30;
	 	arr[3] = 40;
	 	arr[4] = 50; 
	 	// arr[5] = 60; -> 없는 상자에 접근하면 에러
	 	
	 	System.out.println("배열의 첫 번째 상자값: " + arr[0]);
	 	arr[0] = 100; // 첫 번째 상자를 100으로 변경
	 	
	 	System.out.println("배열의 첫 번째 상자값: " + arr[0]);
	 	
	 	// 5. 배열의 값을 한 눈에 문자열로 보고 싶으면
	 	System.out.println( Arrays.toString(arr));
	 	
	 	//6. 배열의 길이를 확인
	 	System.out.println("배열의 길이: " + arr.length);
	 	
	 	// 마지막 인덱스
	 	System.out.println("배열의 마지막 상자: " + arr[arr.length-1]);
	 	
	 	System.out.println("----------------------------------------");
	 	
	 	// 7. 배열의 선언과 생성을 동시에 하는 방법
	 	int[] arr2 = new int[7];
	 	
	 	// 8. 배열의 선언과 생성 초기화를 동시에 하는 방법
	 	byte[] arr3 = {1,2,3,4,5,6};  // = byte[] arr3 = new byte[] {1,2,3,4,5,6}; 
	 	System.out.println(Arrays.toString(arr3));
	 	
	 	// 배열은 값을 지정하지 않으면 기본값으로 초기화된다.(0, 0.0, false, null)
	 	System.out.println(Arrays.toString(arr2));
	 	
	 	System.out.println("----------------------------------------------------");

	 	/*
	 	 * 문자열을 저장하는 크기가 7인 배열을 생성하고
	 	 * 월~일까지 값을 저장
	 	 */

	 	String[] arr4 = new String[7];
	 	arr4[0] = "월요일";
	 	arr4[1] = "화요일";
	 	arr4[2] = "수요일";
	 	arr4[3] = "목요일";
	 	arr4[4] = "금요일";
	 	arr4[5] = "토요일";
	 	arr4[6] = "일요일";
	 	String[] arr5 = {"월", "화", "수", "목", "금", "토", "일"}; 
	 	System.out.println(Arrays.toString(arr4));
	 	System.out.println(Arrays.toString(arr5));
	 	
	 	System.out.println("--------------------------------");
	 	
	 	/*
	 	 * arr 배열 안의 값의 합계와 평균을 출력해주세요
	 	 */
	 	int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
	 	System.out.println("arr의 합계:" + sum);
	 	System.out.println("arr의 평균:" + (double)sum / arr.length);
	}
}
