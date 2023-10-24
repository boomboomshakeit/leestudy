package testex;

import java.util.Random;

public class zzin5 {

	public static void main(String[] args) {
		// 무작위 값을 배열에 저장 후 짝수만 출력
		
		int[] list = new int[10];
		
		Random rand = new Random();
		
		for(int i = 0; i < list.length; i++) {
			list[i] = rand.nextInt(99);
		}
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] % 2 == 0) {
				System.out.println(list[i]);
			}
			
		}
	}

}
