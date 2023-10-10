package tut05;

import java.util.Scanner;

public class ContEx5 {

	public static void main(String[] args) {
		
		/*
		 	정수를 입력받아서.
			3~5 계절은 봄입니다.
			6 ~8 게절은 여름입니다.
			9~11가을입니다.
			1,2,12 겨울입니다.
			나머지는 잘못된 값입니다.
		 */
		
//		Scanner sc = null;     코드가 길거나 for문을 사용할 시에 이렇게도 사용함
//		sc = new Scanner();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수입력 > ");
		int choice = sc.nextInt(); // 숫자로 변환해주는 것
		
		switch(choice) {
			case 3:
			case 4: 
			case 5:
				System.out.println("봄입니다.");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다.");
				break;
				
			case 1:
			case 2:
			case 12:
				System.out.println("겨울입니다.");
				break;
				
			default :
				System.out.println("잘못된 값입니다.");
				break;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
