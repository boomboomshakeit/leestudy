package tut03;

public class ConOptEx {

	public static void main(String[] args) {
		
		//삼항연산자
		//정수 두 개를 비교하여 크면 1, 작으면 0을 출력하시오.
		
		int num1 = 3;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0;
		System.out.println(result); 
		
		//임의의 정수를 생성 후 1이면 홀수, 0이면 작수를 출력하시오
		int num3 = 4;
		
		int result2 = (num3 % 2 == 0) ? 0 : 1;
		System.out.println(result2);
		
//		if(num3 % 2 == 0) {
//			System.out.println("Even Number!!");
//		}else {
//			System.out.println("Odd Number!!");
//		}
		
		String msg = "";
		if(num3 % 2 == 0) {
			msg = "짝수";
		}else {
			msg = "홀수";
		}
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
