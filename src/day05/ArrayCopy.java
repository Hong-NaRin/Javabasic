package day05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		// 배열의 복사
		
		// 2가지 개념 - 얕은 복사, 깊은 복사
		// 얕은 복사 - 주소값을 통한 복사 (원본 배열에도 실제 영향을 미침)
		// 깊은 복사 - 완전 새로운 배열을 만들어서 복사
		
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		int[] newArr = arr;
		
		System.out.println(newArr == arr);  // true
		newArr[0] = 100;
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr)); // 같은 주소값을 쓰고 있기 때문에 같은 값으로 변경
		
		System.out.println("-------------------------------------------");

		// 깊은 복사
		int[] arr2 = new int[arr.length]; // 5
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
		arr2[0] = 1000; // 값을 변경하더라도, 원본 배열에는 영향이 없다
		
		System.out.println("원본: " + Arrays.toString(arr));
		System.out.println("사본: " + Arrays.toString(arr2));
	}
}
