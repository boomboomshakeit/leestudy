package testex;

import java.util.Scanner;

public class zzin2 {

	public static void main(String[] args) {
		// 영문자를 입력 받아 대문자로 변경하는 프로그램()
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine(); // 입력받기
		
		String upper = input.toUpperCase(); // 대문자출
		
		System.out.println(upper);
		
	}

}
