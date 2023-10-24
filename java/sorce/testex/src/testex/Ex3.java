package testex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 영문자 출력, do ~while로 프로그램 작성()
		Scanner sc = new Scanner(System.in);
		/* ex1
	
		
		char c = 'a';
		
		char letter = 'a';
		do {
			
			System.out.println(c);
			c++;
		} while(c <= 'z');
	*/
		char inputChar;

        do {
            System.out.print("영문자를 입력하세요 (종료하려면 'q' 또는 'Q'를 입력하세요): ");
            inputChar = sc.next().charAt(0);

            if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
                // 입력한 문자가 영문자인 경우에만 출력
                System.out.println("입력한 영문자: " + inputChar);
            }
        } while (inputChar != 'q' && inputChar != 'Q');

        sc.close();
    }
}


