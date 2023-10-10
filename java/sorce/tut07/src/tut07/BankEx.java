package tut07;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 100000;
		
		
		boolean run = true;
		
		while(run) {
		
		System.out.println("———————————-------------------—");
		System.out.println("1.예금 | 2.출금 | 3.확인 | 4.종료");
		System.out.println("——————————--------------------——");
		System.out.println("선택 > ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("예금할 금액을 입력 > ");
			balance += sc.nextInt();
			System.out.println("입금 되었습니다.");
			System.out.println("잔고를 확인하세요");
			break;
		case 2:
			if(balance < 0) {
				break;
			} else {
			System.out.println("출금을 진행합니다.");
			System.out.println("현재 잔액 : " + balance);
			System.out.println("출금할 금액 > ");
			balance -= sc.nextInt();
			System.out.println("출금 되었습니다.");

			}
		case 3:
			System.out.println("현재 잔고를 확인합니다.");
			System.out.println("잔고는 " + balance + "원 입니다.");
			break;
		case 4:
			System.out.println("종료");
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 입력 값입니다.");
			break;
		}
		
		}
	}

}
