package tut05;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int money =10000;
		int coffee = 3000;
		int stock = 10;
		
		boolean run = true;
		while(run) {
			System.out.println("===================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("===================");
			
			System.out.println("1.구매(P/p) | 2.잔액(B/b) | 3.종료(Q/q)");
			System.out.print("메뉴 선택 > ");
			
			String menu = sc.next(); // 내가 입력한 것을 읽는 것
			
			switch(menu) {
			case "P":
			case "p":
				
				if(money < coffee) {
					System.out.println("잔액이 부족합니다.");
				} else if(stock < 1) {
					System.out.println("커피를 구매할 수 없습니다.");
				} else {
					money = money - coffee; // 안에서 진행할 것!
					stock -= 1;
					System.out.println("구매를 진행합니다.");
				}
				break;
				
			case "B":
			case "b":
				System.out.println("재고 : " + stock);
				System.out.println("잔액 : " + money);
				break;
				
			case "Q":
			case "q":
				System.out.println("프로그램을 종료합니다.");		//완료
				System.exit(0);
				break;

			default:
				System.out.println("잘못 선택된 메뉴입니다.");
				System.out.println("");
				continue;
			}
		}
	}

}
