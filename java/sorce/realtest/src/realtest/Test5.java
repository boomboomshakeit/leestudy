package realtest;

class Test5m {
	
	public void Tes() {
		int[] list = new int[] {8, 3 , 1,  6, 2, 4, 5, 9};
		
		float avg = 0.0f;
		
		for(int i = 0; i < list.length; i++) {
			avg += list[i];
		}
		System.out.println(avg / list.length);
	}
}

public class Test5 {

	public static void main(String[] args) {
		
//		- 8, 3 , 1,  6, 2, 4, 5, 9 값을 배열에 입력하여 평균을 구하는 프로그램을 작성하시오.
//		- 단, 평균은 메소드로 작성하여 평균 값을 구한 후 출력 하시오.
//		- 평균 값은 소수점 2자리까지 출력하시오
		
		Test5m tes = new Test5m();
		tes.Tes();
	}

}
