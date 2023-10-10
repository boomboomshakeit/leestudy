package tut09;


public class ArrEx03 {

	public static void main(String[] args) {
		
		//메소드를 이용하여 출력
		//정수 5개에 점수 입력 후
		//합계
		//평균
		
		//정수 3개에 점수 입력 후
		//합계
		//평균
		
		//int[] scores = new int[] {1,2,3,4,5}; //<- 메소드 
		int[] scores = null;
		scores = new int[] {1,2,3,4,5};
		
		
		
		Cal c = new Cal(); //생성자를 통해서 접근 
		Display d = new Display();
		//배열 10개의 합은 100입니다.
		//System.out.println(c.sum(scores));
		d.title("컴퓨터 프로그램");

		System.out.println("배열 "+ scores.length + "개의 합은 " + c.sum(scores) + "입니다.");
		
		
		
		//보낼 때는 값(오른쪽), 받을 때는 타입(왼쪽)
		//보낼 때 new, 
//		c.sum(new int[] {1, 2, 3, 4, 5});
//		System.out.println(c.sum(new int[] {1, 2, 3, 4, 5}));
//		c.avg();
		d.title("컴퓨터 프로그램");
		c.avg(scores);
		System.out.println(String.format("평균은 : %.2f", c.avg(scores)));
		System.out.printf("평균은 : %.2f", c.avg(scores));
		System.out.println("");
		
		System.out.println(d.close("시스템 종료"));
		
		
		
		
		
		
		
		
		
		
	}

}
