package tut07;

import java.util.Scanner;

public class IFRandomEx {

	public static void main(String[] args) {
		
		//가위(1), 바위(2), 보(3)
		//me, com 변수
		//나와 컴퓨터를 비교해서 일치하지 않으면 이겼습니다. 일치하면 졌습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 선택 > ");
		
		//int me = 2;
		int me = sc.nextInt();
		
		
		//System.out.println(Math.random());
		
		/*
		 * (int)(Math.random() * 마지막값) + 시작값
		 */
		
		System.out.println((int)(Math.random() * 3) + 1);
		
		int com = (int)(Math.random() * 3) + 1;
		if(me != com ) {
			System.out.println("컴퓨터는" + com + " 나는 " + me + "입니다.");
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("프로그램을 종료합니다");
		} else {
			System.out.println("내가 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
