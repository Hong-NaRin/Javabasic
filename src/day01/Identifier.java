package day01;

public class Identifier {
	
	public static void main(String[] args) {
		
		int age = 25;
		// int Age = 20; 변수는 소문자로(처음에 대문자를 쓸 수 없다)
		
		// int phone_number = 4; ->자바에선 언더바는 적절치 않음
		int phoneNumber = 4; // 자바는 카멜 표기식으로
		
		
		// int 1num = 3; -> 숫자는 맨 앞에 쓸 수 없다
		int num1 = 3;
		
		// int public = 4; -> 키워드와 중복된 이름 불가
		
		System.out.println(age);
		System.out.println(phoneNumber);
		System.out.println(num1);
	}
}
