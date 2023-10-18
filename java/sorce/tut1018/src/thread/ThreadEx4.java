package thread;

public class ThreadEx4 {

	public static void main(String[] args) { //클래스를 만들지 않고 익명 함수로 처리

		//글자 출력
		Thread t1 = new Thread( () -> { //객체생성 후 생성자 부분에 익명함수 사용
			
			String[] strArr = {"하나", "둘", "셋", "넷", "다섯"}; //배열생성
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		} ); 
		
		
		//숫자 출력
		Thread t2 = new Thread( new Runnable() { // Runnable  생성

			@Override
			public void run() { //인터페이스를 강제 오버라이드 해야함
				int[] intArr = new int[] {1, 2, 3, 4, 5};
				
				for(int i = 0; i < intArr.length; i++) {
					System.out.println(intArr[i]);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} 
			
		}); 
		
		//쓰레드 우선순위 : 10 ~ 1 -> 지정하지 않으면 5가 출력
		
		System.out.println("쓰레드 이름은 : " + t1.getName()); 
		t1.setPriority(10); //쓰레드 중요도 지정하는 방법
		System.out.println(t1.getPriority()); //쓰레드 중요도 출력
//		t1.start();
		
		System.out.println("쓰레드 이름은 : " + t2.getName());
		System.out.println(t2.getPriority());
//		t2.start();
		
		
		
	}

}
