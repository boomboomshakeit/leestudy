package tut03;

public class StringEx {

	public static void main(String[] args) {

		//기본타입 koreait 문자열 저장
		//객체타입 koreait 문자열 저장
		//비교하는 예제
		
		String str = "koreait";  //stack
		String str2 = new String("koreait");  //객체타입  heap
		
		//문자열비교 A.equals(B) 값
		if(str.equals(str2)) {
			System.out.println("값은 동일합니다.");
		}else {
			System.out.println("값이 다릅니다.");
		}
		
		//문자열비교 or 숫자 == 메모리 주소값
		//비교연산자(>, <, 결과 true, false)
		//System.out.println(str == str2);
		
		boolean result = str == str2;
		if(result) {
			System.out.println("메모리가 동일합니다.");
		}else {
			System.out.println("메모리 위치가 다릅니다.");
		}
		
		
		//문자열을 제외하면 비교는 == 사용하면 됨
		int num1 = 1;
		int num2 = 2;
		
		boolean res = (num1 == num2);
	}

}
