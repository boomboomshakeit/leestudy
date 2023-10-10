package tut05;

public class LoopEx {

	public static void main(String[] args) {
		
//		//기본형 0 4까지 출력하는 for를 완성하시오.
//		
//		/*
//		for(int i = 0; i < 조건; i++) {
//		출력코드
//		}
//		
//		for(int i = 0; i < 조건; ++i) {
//			출력코드
//		}
//		 */
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("");
//		//0부터 100미만 출력 하는 for
//		
//		for(int j = 0; j < 100; j++) {
//			System.out.print(j + " ");
//		}
//		
//		System.out.println("");
//		
//		//1부터 10이하까지 출력하는 for
//		
//		for(int i = 1; i <= 10 ; i++) {
//			System.out.print(i);
//		}
//		
		
		//0 ~ 10 미만 출력하는 for
		
		System.out.print("for을 이용한 출력 : ");
		for(int i = 0; i < 10; i++) {
			//for를 이용한 출력 01234567\
			System.out.print(i + " ");
		}
		System.out.println("");
		
		// 0 ~ 10 미만 출력하는 while
		System.out.print("while을 이용한 출력 : ");
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			++i;
		}
		
		System.out.println("");
		
		//10이하 부터 1까지 출력하는 for
		for(int j = 11; j >= 1; --j) {
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
