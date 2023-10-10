package tut09;

public class ArrEx01 {

	public static void main(String[] args) {
		
		//배열 + 반복문(for - 배열번호가 필요한 경우, 향상된 for - 배열번호 필요없이 값만 출력)
		//배열번호(index)은 0번부터 시작
		//값[0] = 100
		//i, idx, index 변수이름이 보이면 배열처리
		
		/*
		for문
		for(int i = 0; i < 배열명.length, i++) {
			출력코드(배열명[i]);
		}
		*/
		
		/*
		향상된 for
		for(출력타입 별명 : 배열명) {
			출력코드(별명);
		}
		*/
		
		//정수 100개에 값을 저장하는 프로그램을 완성하시오.
		//데이터타입 변수명 = new 데이터타입;
		//int[] value = new int[100]; //데이터를 여러개 처리하기 때문에 참조타입이라 new를 적는다., 4byte * 100 공간이 생성, 초기화가 아니고 빈 공간만 생김
		
		//int[] value = null;//숫자 묶음 여러게 데이터를 처리하기 때문에 참조임, 참조이기 때문에 null을 넣음
		//value = new int[10];
		
		//생성자 : 초기화
		//Member m = new Member(); //초기화, 생성자는 소괄호를 사용
		
		int[] value = new int[3];
		
		value[0] = 100; //초기화 시킨것
		value[1] = 200; 
		value[2] = 300;
		
		//배열 0 ~ 2번까지 출력하시오
		//배열명[인덱스]
		//for
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
		for(int i = 0; i <= 2; i++) {
			//System.out.println(value[i]);
			//System.out.println("value[" + i +"]의 값은 " + value[i] + "입니다.");
			System.out.println( (i + 1) + "번 값은 " + value[i] + "입니다.");
		}
		
		
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		
		
		System.out.println("--------------------------------------");
		
		//int[] num = {1, 2, 3, 4, 5};
		//초기값을 설정하면 배여 ㄹ개수가 생성
		//학생 3명 점수를 초기값으로 설정 후
		//화면에 출력하시오
		//합계를 출력하시오
		//평균을 출력하시오
		
		int[] jumsu = {88, 77, 66, 55, 44};
		
		//등록된 게시물 수는 1000개 입니다.
		System.out.println("등록된 학생 수는 " + jumsu.length + "명 입니다.");
		
		
		System.out.println("========화면출력========");
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		System.out.println("");
		System.out.println("========화면출력========");
		
		int sum = 0;
		
		for(int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		System.out.println("점수의 합계는 : " + sum + "입니다.");
		
		System.out.println("점수의 평균은 : " + ((double)sum / jumsu.length) + "입니다.");
		
		double result = (double)sum / jumsu.length;
		
		
		//출력 포맷 변경 소수점 2자리로 설정
		//평균은 87.55입니다.
		System.out.println(String.format("평균은 %.2f입니다.", result));
		System.out.printf("평균은 %.2f입니다.", result);
		
		
		
		
		
		
		
		
		
		
	}
}
