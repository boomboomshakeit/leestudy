package testex;

import java.util.Scanner;

public class zzin3 {

	public static void main(String[] args) {
		// 영문자 출력, do ~while로 프로그램 작성()
		/*
		Scanner sc = new Scanner(System.in);
		
		char c;
		
		
		do {
			c = sc.next().charAt(0);
			if(c >= 'a' || c >= 'A') {
			System.out.println(c);
			}
		} while (c != 'q' && c != 'Q');
		*/
		
		char c = 'a';
		
		do {
			System.out.println(c);
			c++;
		} while (c <= 'z');

	}

}
