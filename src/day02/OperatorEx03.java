package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		// & | && ||
		int x = 10;
		int y = 20;
		
		// if 소괄호가 true라면 if구문 실행, false라면 esls구문 실행
		if(x != 10 && ++y == 21) { // &&는 절대 true가 나올 수 없는 경우에 뒤를 실행하지 않음
			System.out.println("참입니다");		
		} 
		else {
			System.out.println("거짓입니다");
		}
		
		System.out.println("x 값은:" + x);
		System.out.println("y 값은:" + y);

		if(x != 10 || ++y == 21) { // ||는 절대 false가 나올 수 없는 경우에 뒤(++y == 21)를 실행하지 않음
			System.out.println("참입니다");
		}
		else {	
			System.out.println("거짓입니다");
		}
		
		System.out.println("x 값은:" + x);
		System.out.println("y 값은:" + y);
		
	}
}
