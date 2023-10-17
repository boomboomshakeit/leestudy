package lamda;

interface MaxNum {
	int getMaxNum(int a, int b);
}


public class LamdaEx5 {

	public static void main(String[] args) {
		
		//두 개의 수중 큰 숫자를 출력하세오.
		// x > y -> return x;
		// y > x -> return y;
		/*
		MaxNum m = (x, y) -> {
			
			if(x > y)
				return x;
			else 
				return y;
		};
		System.out.println(m.getMaxNum(3, 5));
		*/
		
		/*
		MaxNum m = (a, b) -> {
			
			return (a > b) ? a : b;
		};
		System.out.println(m.getMaxNum(2, 1));
		*/
		
		//한줄로 만들면.. return이 생략가능
		MaxNum m = (a, b) ->  (a > b) ? a : b;
		System.out.println(m.getMaxNum(3, 4));
	}

}
