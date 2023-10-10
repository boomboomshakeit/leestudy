package tut04;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		//컨트롤 쉬프트 에
		
		/*
		 학점 91 ~ 100 A등급
		 81 ~ 90 B등급
		 71 ~ 80 C등급
		 나머지는 F등급으로 표시하시오
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력(숫자:0~100) > ");
		//값을 입력 받을 수 있게 sc.next();
		//정수로 변환
		//int jumsu = Integer.parseInt(sc.next());
		
		int jumsu = sc.nextInt(); //이걸로 사용해도 괜찮음
		
		
		//int jumsu = 88;
		
		String str = null;
		
		
		if (jumsu <= 100 && jumsu >= 91) {
			str = "A등급";
		} else if (jumsu <= 90 && jumsu >= 81) {
			str = "B등급";
		} else if (jumsu <= 80 && jumsu >= 71) {
			str = "C등급";
		} else {
			str = "F등급";
		}
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
