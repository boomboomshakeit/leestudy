package realtest;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		//	내용	
//		<작업 지시 사항>
//
//		1.  학년(1 ~ 4)와 점수(0 ~ 100)을 입력 받아  60점 이상이면 합격, 60점 미만이면 불합격 메시지를 출력하시오. 
//
//		  (단, 학년이 4학년이면서 점수가 80점 이상일 때는 ‘졸업입니다’ 를 학년이 4학년이지만 80점 미만일 때는 ‘재시험입니다’를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;
		
		int score = 0;
		
		grade = sc.nextInt();
		score = sc.nextInt();
		
		System.out.println("학년 : " + grade);
		System.out.println("점수 : " + score); 
		
		if(score >= 60 && score <= 100) {
			if(grade == 4 && score >= 80) {
				System.out.println("졸업입니다.");
			} else if(grade == 4 && score < 80) {
				System.out.println("재시험입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		} else if(score < 60 && score >= 0) {
			if(grade == 4) {
				System.out.println("재시험입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println("잘못된 값입니다. 프로그램을 다시 실행해주세요.");
		}
		
		
	}

}
