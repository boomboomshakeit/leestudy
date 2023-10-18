package thread;

public class ThreadEx { //스레드 시험에 나옴!!!

	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println(Runtime.getRuntime().availableProcessors());
		//Single Thread : 순서대로 처리
		//1, 2, 3, 4, 5
		//A, B, C, B, E
		
		//Thread를 이용해서 0.5초의 간격을 두고 실행
		//프로그래밍은 1초 = 1000
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------------");
		
		char c = 'A';
		
		System.out.println((int)c);
		
		for(int i = 65; i < (65+5); i++) {
			System.out.println((char)i);
			Thread.sleep(500);
		}
		
		//1, 2, 3, 4, 5
		//하나, 둘, 셋, 넷, 다섯
		//1 하나, 2 둘, 3 셋, 4 넷, 5 다섯
		
		
		
		//배열로 Single Thread
		
		
	
		String[] str2 = {"하나", "둘", "셋", "넷", "다섯"};
		
		String[] str = new String[5];
		str[0] = "하나";
		str[1] = "둘";
		
		int[] intArr = new int[] {1, 2, 3, 4, 5}; // 배열생성
		String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		for(int i = 0; i < intArr.length; i++) { //intArr 배열의 길이만큼 for문을 실행
			System.out.println(intArr[i]); //intArr 배열을 출력함
			Thread.sleep(1000); // 1초간 출력을 멈춤
		}
		
		System.out.println("--------------------");
		
		for(int i = 0; i < strArr.length; i++) { //strArr 배열의 길이만큼 for문을 실행
			System.out.println(strArr[i]); //strArr 배열을 출력함
			Thread.sleep(1000); // 1초간 출력을 멈춤
		}
		
		
		
		
		
		
	}

}
