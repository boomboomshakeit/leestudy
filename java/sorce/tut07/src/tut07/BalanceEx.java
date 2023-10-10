package tut07;

import java.util.Scanner;

public class BalanceEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 100000;
		int plus = 2000;
		
		
		boolean run = true;
		
		while(run) {
		
		System.out.println("———————————-------------------—");
		System.out.println("1.예금 | 2.출금 | 3.확인 | 4.종료");
		System.out.println("——————————--------------------——");
		System.out.println("선택 > ");
		
		int i = sc.nextInt();
		
		
		
		switch(i) {
		case 1:
			int y = money += plus;
			System.out.println(y + "원 입니다.");
			break;
		case 2:
			y = money -=plus;
			System.out.println(money - plus + "원 입니다.");
			break;
		case 3:
			y = money;
			System.out.println(y + "원 입니다.");
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
