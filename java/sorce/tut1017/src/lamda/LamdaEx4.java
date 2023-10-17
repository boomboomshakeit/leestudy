package lamda;

interface Cals2 {
	
	int add(int a, int b);
}

public class LamdaEx4 {

	public static void main(String[] args) {

		//두 값의 합을 구하는 람다식
		Cals2 c2 = (i, j) -> {
			
			int sum = i + j;
			return i + j;
		};
		System.out.println(c2.add(1,3));
		
		
	}

}
