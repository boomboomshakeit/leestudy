package testex;

import java.util.Scanner;

public class zzin4 {

	public static void main(String[] args) {
		// 60점 이상이면 합격 미만이면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		int jumsu = 0;
		
		jumsu = sc.nextInt();
		
		if(jumsu > 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
