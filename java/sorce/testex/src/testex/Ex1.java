package testex;

public class Ex1 {

	public static void main(String[] args) {
		// 3과 5의 배수 출력 

		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
