package tut02;

public class PrintEx {
	
	public static void main(String[] args) {
		
		//정수 5와 8의 합을 출력하시오.
		//변수 선언 초기화 = 선언과 초기화를동
		
//		int num1, num2;
//		num1 = 5;
//		num2 = 8;
		
		//변수이름 첫글자는 소문자
		int num1 = 5;
		int num2 = 8;
		//System.in - scanner 사용 시
		//스테틱메서드
		
		System.out.println(num1 + num2);
		
		//결과값을 변수에 저장 후 출력
		
		int result = num1 + num2;
		
		System.out.println(result);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//byte(1) - int(4) - float(4) - double(8)
		//0, 1 => 1byte = 8bit => 2 * 8 => 256 / 2 = 128
		//음수(-128), 0, 양수(+127)   128이 나오면 돌아감
		byte b = 127;
		
		//사람이 읽는 수 10
		//16진수 0 ~ 15 : 0~9, a, b, c, d, e, f
		//메모리 주소에 x = hex
		//메모리 주소 0 = oct
		
		//byte : 메시지 전송, 이미지 처리
		
		System.out.println("-----------------------");
		
		//int 10억 넘어가면 ~
		//long 
		//long은 숫자 뒤에다가 L표시 해줘야함
		long money = 10000000000L;
		
		//float
		//PI는 값이 정해져 있는(고정되어 있는) 값 - 상수  고정 되어있는 값은 대문자로 표시
		float PI = 3.12345678F;
		System.out.println(PI);

		
		
		
		
		
		
		
		
	}

}