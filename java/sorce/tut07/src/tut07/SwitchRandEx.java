package tut07;

import java.util.Scanner;

public class SwitchRandEx {

	public static void main(String[] args) {
		
		//me, dice
		//Scanner
		//1 ~ 6
		//외에 값이 입력되면 잘못 입력된 값입니다. 출력
		//(int)(Math.random() * 마지막값) + 시작값
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주사위 1 ~ 6 까지 정수를 입력 > ");
		int me = sc.nextInt();
		
		int dice = (int)(Math.random() * 6) + 1;

		
		switch(dice) {
		case 1:
			System.out.println("선택한 주사위 값은 1입니다.");
			break;
			
		case 2:
			System.out.println("선택한 주사위 값은 2입니다.");
			break;
			
		case 3:
			System.out.println("선택한 주사위 값은 3입니다.");
			break;
			
		case 4:
			System.out.println("선택한 주사위 값은 4입니다.");
			break;
			
		case 5:
			System.out.println("선택한 주사위 값은 5입니다.");
			break;
			
		case 6:
			System.out.println("선택한 주사위 값은 6입니다.");
			break;
			
		default :
			System.out.println("잘못된 값입니다.");
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
