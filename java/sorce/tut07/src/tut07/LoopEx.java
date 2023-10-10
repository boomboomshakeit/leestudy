package tut07;

public class LoopEx {

	public static void main(String[] args) {
		
		//임의 정수 값이 0인데 0과 대소를 비교할 때 
		for(int i = 0; i < 0; i++) {
			System.out.println(i);
		}
		
		int j;
		for(j = 0; j < 0; j++) {
			System.out.println(j);
		}
		
		System.out.println("-----------------------");
		
		int k = 0;
		
		while(k < 0) {
			System.out.println(k);
			k++;
		}
		
		System.out.println("-----------------------");
		
		//do while문 
		int x  = 0;
		do {
			System.out.println("조건이 틀려도 출력됩니다.");
			x++;
		}while(x < 0);
	}

}
