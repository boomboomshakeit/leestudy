package tut05;

import java.util.Scanner;

public class LoopEx6 {
	
	//내가 한것

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean star = true;
		
		int money = 10000;
		int price = 3000;
		int cnt = 10;
		
		while(star) {
			System.out.println("===================");
			System.out.println("스타벅스 커피 자동 판매");
			System.out.println("===================");
			
			System.out.println("1.구매(P/p) | 2.잔액(B/b) | 3.종료(Q/q)");
			System.out.println("메뉴 선택 > ");
			
			String choice = sc.next();
		
			
			
			
			
			switch(choice) {
			case "P":
			case "p":
				if(money < 3000 || cnt < 1) {
					
					System.out.println("구매 하실 수 없습니다.");
				} else {
					money =  money - price;
					cnt = cnt - 1;
					System.out.println("커피를 구매하셨습니다.");
				}
				break;
				
			case "B":
			case "b":
				
				System.out.println(money +  "원 남았습니다.");
				break;
				
			case "Q":
			case "q":
				System.out.println("프로그램을 종료합니다.");		//완료
				System.exit(0);
				break;
			
			default:
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
