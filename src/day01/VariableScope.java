package day01;

public class VariableScope {
	
	public static void main(String[] args) {
		
		int num = 100;
		System.out.println(num); 
		
		int num2 = 200;  // 이 중괄호 안에서 값을 사용 또는 변경하고, 중괄호 밖에서 사용하는 경우
		
		if(true) {  // 범위 
			int num1 = 10;
			System.out.println(num1);
			// 변수의 범위는 중괄호 안에서만 유효함
			
			num2 = 20; 
		}
		System.out.println(num2);  
	}
}
