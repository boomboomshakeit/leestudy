package testex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 영문자를 입력 받아 대문자로 변경하는 프로그램()
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine(); //문자열 입력받기
		
		String upper = input.toUpperCase(); //touppercase를 이용해 높이기
		
		System.out.println(upper);

	}

}
