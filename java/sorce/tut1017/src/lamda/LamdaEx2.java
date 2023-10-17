package lamda;

interface Cals {
	//람다식은 일반적으로 인터페이스 안에 메소드 1개만 생성 후 사용
	void dispNum(int num);
}

public class LamdaEx2 {

	public static void main(String[] args) {
		
		//이렇게도 만들 수 있음
		/*
		Cals c;
		c = (num) -> {
			System.out.println(num);
		};
		c.dispNum(3);
		*/
		
		Cals c = (num) -> {
			System.out.println(num);
		};
		c.dispNum(3);
		
		System.out.println("--------------곱하기 * 10-------------");
		
		Cals c2 = (x) -> {//소괄호 안에 들어가는 매게변수는 맞춰야한다.
			System.out.println(x * 10);
		};
		c2.dispNum(12);
		
		
		System.out.println("--------------더하기 + 10-------------");
		
		Cals c3 = (a) -> {
			int sum = a + 10;
			System.out.println(sum);
		};
		c3.dispNum(100);
		
		System.out.println("-------------return으로 출력-------------");
		
		
	}

}
