package tut06;

public class LoopEx {

	public static void main(String[] args) {
		
		//for(초기값; 조건; 증감값) {
		//출력코드
		//}
		
		//0부터 10까지 출력하는 반복문을 완성하시오.
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		//1부터 20까지 출력하는 for
		for(int i = 1; i <=20; i++) { //1  2 4 순서
 			System.out.print(i + " "); //3
		}
		System.out.println("");
		
		int j = 1;//1
		while(j <= 20) {//2
			System.out.print(j + " "); //3
			j++; //4
		}
		
		// 0 ~ 10 까지 출력하는 for
		//짝수만 출력하세요
		//건너뛸 때는 continue;
		for(int i = 0; i <= 10; i++) {
			
			if(i % 2 == 1) 
				continue;
				
				System.out.print(i);
			
		}
		System.out.println("");
		int k = 0;
		while(k <= 10) {
			
			System.out.print(k);
			k++;
			
				if(k % 2 == 1) 
					continue;
		}
		
		
		
		
	}

}
