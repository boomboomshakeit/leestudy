package realtest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		char inputChar = 0;
		String a = "";

        while (inputChar != 'q' && inputChar != 'Q') {
            System.out.print("A(a).입력 | Q(q).종료 ");
            inputChar = sc.next().charAt(0);

            if (inputChar == 'a' || inputChar == 'A') {
                System.out.print("영어 입력 (띄어쓰기 없이): ");
                a = sc.next();
                System.out.println("입력된 영어: " + a);
            } else if (inputChar != 'q' && inputChar != 'Q') {
                System.out.println();
            } else {
                System.out.println("잘못된 입력 값입니다.");
            }
        }
        System.out.println("프로그램 종료");
        sc.close();
	}

}
