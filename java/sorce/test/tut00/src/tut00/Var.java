/*
 * 1. 프로그램 명 : 정수 100으 출력하는 프로그램
 * 2. 작성일 : 2023.09.07
 * 3. 작성자 : 이태
 */
package tut00;

public class Var {

	public static void main(String[] args) {
		//데이터 이름 = 값
		// 왼쪽 = 오른쪽 : 오른쪽에 있는 값을 왼쪽에 저장해라
		// A==B A와 B의 메모리 값이 같다
		//A.equals("A") : A와 B의 값이 같다
//		int num = 100;
//		System.out.println(num);
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		
		// 0.2 - 0.1
		double d1 = 0.2;
		double d2 = 0.1;
		
		System.out.println(d1 - d2);
		
		//작은 것은 큰거에 담아도 손실이 없음 ㅇ
		//큰것을 작은 것에 담으면 손실이 있음
		//int는 저장 공간이 4byte(32bit)
		//double은 저장공간이 8byte(64bit)
		
		//
		
		int i = (int)1.333; // 소수점 있는 것을 정수로 변환하는것
		System.out.println(i);
		
		
	}

}
