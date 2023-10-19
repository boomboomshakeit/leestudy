package thread;

class NumCount2 implements Runnable { //Runnable 인터페이스를 구현하는 클래스 정의

	@Override
	public void run() { //run()메소드 오버라이드 및 스레드 코드 작성
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
	
}

class HanCount2 implements Runnable { //Runnable 인터페이스를 구현하는 클래스 정의

	@Override
	public void run() { //run()메소드 오버라이드 및 스레드 코드 작성
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String[] strArr = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx3 {

	public static void main(String[] args) {
		
		NumCount2 nc2 = new NumCount2(); //Runnable 객체 생성
		//Thread 객체에 주입해서 사용
		Thread t1 = new Thread(nc2); // Runnable 인터페이스를 구현하는 방법
		t1.start(); // 스레드의 실행
		
		HanCount2 hc2 = new HanCount2(); //Runnable 객체 생성
		//Thread 객체에 주입해서 사용
		Thread t2 = new Thread(hc2); // Runnable 인터페이스를 구현하는 방법
		t2.start(); // 스레드의 실행
		
		
	}

}
