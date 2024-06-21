package day05;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		// 배열의 삭제 - 사실 배열은 삭제가 없음
		// 마치 삭제된 것처럼 보이게 함
		/*
		 1. 삭제할 위치 다음 값들을 하나씩 당겨옴
		 2. 길이 -1인 새로운 배열에 값을 옮겨 담음
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int targetIndex = 5; // 5번 인덱스 삭제 = 6
		
		// 1. 
		for(int i = targetIndex; i < arr.length - 1; i++) { // 9미만이므로 8번째 인덱스까지 돈다 = 9
			arr[i] = arr[i + 1];
		}
		
		// 2.
		int[] newArr = new int[arr.length - 1];
		for(int i = 0; i < newArr.length; i++) { // 순서대로 옮기기
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// 기존 arr 삭제
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(arr)); // targetIndex 넘버 6이 지워짐
	}
}
	