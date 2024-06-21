package day05;

import java.util.Arrays;

public class ArrayInsert2 {

	public static void main(String[] args) {
		
		// 배열의 중간에 추가
		/*
		 1. 배열의 크기 +1 생성
		 2. 배열을 옮겨 담음
		 3. 새로운 배열의 마지막 인덱스부터 타깃 인덱스까지 값을 옮김 -> 마지막 0 자리에 50을 옮기는 식
		 4. targetIndex에 data를 추가함
		 */
		
		int[] arr = {10,20,30,40,50};
		
		// targetIndex번째에 data를 추가
		int targetIndex = 2;
		int data = 100;
		
		// 1.
		int[] newArr = new int[arr.length + 1];
		
		// 2.
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		// 3.
		for(int i = newArr.length - 1; i > targetIndex; i--) {  // 앞의 값들을 뒤로 옮겨서 가져온다 (targetIndex 2까지만)
			newArr[i] = newArr[i-1];
		}
		
		// 4. 
		newArr[targetIndex] = data;
			
		System.out.println(Arrays.toString(newArr));

	}
}
