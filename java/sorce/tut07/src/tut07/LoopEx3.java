package tut07;

public class LoopEx3 {

	public static void main(String[] args) {
		
		// 1 ~ 100까지 합을 구하시오
		//while
		//출력 예시 : 1 ~ 100	까지 합은 *** 입니다
		
		int result = 0;
		int num = 0;
		while(num <= 100) {
			result += num;
			num++;
		}
		System.out.println("1에서부터 100까지의 합은 : " + result + "입니다.");
		
		
		
		
		
	}

}
