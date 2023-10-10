package tut08;



public class CalEx {
	
	//매개변수는 없을 수도 있음
	//접근제한 리턴타입 메소드명(매개변수){}
//	public void disp(String title) {
//		System.out.println(title + "코리아아이티 계산기");
//	}
//	
//	public void close() {
//		System.out.println("프로그램 종료");
//	}
	
	public String disp() {
		return "코리아아이티 아카데미";
	}
	
	//오버로딩
	//매개변수 개수 다르고, 타입을 다르게 사용할 때는 같은 이름을 써도 가능
//	public int add(int num1, int num2) {
//		
//		return num1 + num2; //원래 있던 자리로 보내준다.
//	}
//	
//	public int add(int num1, int num2, int num3) {//이름과 타입은 같지만 개수가 다
//		return num1 + num2 + num3;
//	}
//	
//	public double add(double num1, double num2) {//이름과 개수는 같지만 타입이 다름
//		
//		return num1 + num2;
//	}
//	
//	public int sum(int num1, int num2, int num3) {
//		return num1 + num2 + num3;
//	}
	/*
	public boolean isPrint(int num1, int num2) {				
		
		return (num1 + num2) > 200 ? true : false;
	}
	*/
	
	/*
	public boolean isCheck(int num) {		
		
		return (num % 2 != 0) ? true : false;
	}
	*/
	
	public static void main(String[] args) {
		
		//재사용 : 반복 사용
		
		//코리아아이티 계산기 : void, String
		//두개의 정수를 더하기 하는 메소드
			//100 + 200 = 300
		//프로그램 종료
		
//		CalEx c = new CalEx();
//		c.disp("부산");
//		c.close();
//		
//		System.out.println("----------------------------");
//		
//		c.disp("서울");
//		c.close();
//		
		
//		CalEx c = new CalEx();
//		System.out.println(c.disp());
		
//		100 + 100
//		200 + 200
//		300 + 300
		
		//보내줄 때 값, 처리할 때는 타입 변수
		//배열은 보내줄 때는 생성자, 처리할 때는 타입[] 변수
//		CalEx ce = new CalEx();
//		System.out.println(ce.add(100, 200));
		
		//100, 200, 300	 = 600 -> 메소드
		
//		System.out.println(ce.sum(100, 200, 300));
		
		//100 + 100의 결과가 200보다 크면 true를 출력하시오
		
		
//		CalEx c = new CalEx();
//		System.out.println(c.isPrint(100, 100));
		
		
		//정수를 이용하여 홀수면 true, 짝수면 false를 출력하시오 
		
		/*
		CalEx c = new CalEx();
		System.out.println(c.isCheck(5));
		*/
		
		Cal c = new Cal();
		System.out.println(c.isCheck(7));
		
		
		
		
		
		
	}

}
