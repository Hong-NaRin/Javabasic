package day01;

public class DataTypeEx2 {
	
	public static void main(String[] args) {
		
		// 단일문자를 저장하는 char 타입
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 알파벳에 숫자값을 지정. 아스키코드 1byte 문자체계
		
		// 유니코드 - 2byte 크기로 확장시키고 65536개의 문자표현
		char c3 = '가';
		char c4 = 44032;  // 44033은 '각'이 나오고, 숫자를 다르게 할수록 값이 다르게 나온다
		char c5 = '\uC00D';  // 는 유니코드를 나타냄, C00D는 16진수
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("------------------------------");
		
		// 문자열을 나타내는 String
		String s1 = "Hello ";
		String s2 = "World ";
		String s3 = "^0^";
		
		// 문자열은 + 로 붙여서 출력
		System.out.println(s1 + s2 + s3);
		
		// 문자열의 영향력이 크기 때문에 다른 타입이 붙어도 문자열이 된다
		System.out.println("hello" + 100); // hello100 출력
		
		System.out.println("200" + 100); // 200100 출력
		System.out.println(100 + 200 + "300"); // 300300 (앞에 100과 200이 합쳐져 300 + 300)
		
		//
		System.out.println("A" + 10);  // A10
		System.out.println('A' + 10); // 'A'는 문자열이 아닌 캐릭터형이기 때문에 숫자합 75가 출력
	
	}
}
