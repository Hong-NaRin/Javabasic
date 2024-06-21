package day06;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		// Queue(큐) - First In First Out (FIFO)
		
		push(5); // 뒤에 1 넣기
		push(6);
		push(7);
		push(8);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());

		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] arr = {1,2,3,4};
	
	static void push(int data) {
		// 1. 배열 크기 + 1
		// 2. 배열 복사
		// int[] temp = new int[arr.length + 1];		
		int[] temp = Arrays.copyOf(arr, arr.length + 1 ); // 배열명, 복사할 길이
	
		// 3. 마지막에 테이터를 추가
		temp[temp.length - 1 ] = data;
		System.out.println(Arrays.toString(temp));
		
		// 4. 원본배열 변경
		arr = temp;
		temp = null;
		
	
	}

	
	static int pop() {
		
		if(arr.length > 0) {
			// 1. 삭제할 데이터 백업
			int data = arr[0]; // 첫번째 값 삭제
			
			// 2. 길이 - 1 배열 생성
			int[] temp = new int[arr.length - 1]; // 2
			
			// 3. 배열의 1번째 요소 ~ 마지막까지 복사
			for(int i = 0; i < temp.length; i++) { // 3
				temp[i] = arr[i+1];
			}
			
			// int[] temp =  Arrays.copyOfRange(arr, 1, arr.length); // 복사할 배열, 시작위치, 끝위치
			
			
			// 4. 원본배열 변경
			arr = temp;
			temp = null;
			
			// 5. 삭제된 데이터를 반환 1 -> 2 -> 3 ... -> 8 삭제순서
			return data;
		}
		
		return 0;
	}
	
}
