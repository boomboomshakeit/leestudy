package tut03;

public class CompEx {

	public static void main(String[] args) {
		
		//결과는 true 아님 false
		
		//1. 크기비교 : >=, <=, >, <
		int num1 = 3;
		int num2 = 5;
		
		boolean result = num1 > num2;
		System.out.println(result);
		
		//2. 등가비교 : ==, !=
		boolean result2 = (num1 == num2);
		System.out.println(result2);
		
		boolean result3 = (num1 != num2);
		System.out.println(result3);
		
		//3. 참조비교 : 메모리주소를 비교
		//new 키워드(자바에서 사용하는 문법)를 사용하면다른 메모리에 저장
		//문자열 : 참조타입으로 생성
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//문자열 비교 equals()
		boolean result4 = s1.equals(s2);
		System.out.println(result4);
		
		//메모리 비교 ==
		boolean result5 = (s1 == s2);
		System.out.println(result5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
