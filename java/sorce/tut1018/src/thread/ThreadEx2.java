package thread;

class NumCount1 extends Thread { //Thread 클래스 상속한 클래스 정의
	
	public void run() { //run()메소드 오버라이드 및 스레드 코드 작성
		
		int[] intArr = {1, 2, 3, 4, 5};
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			try {
				Thread.sleep(1000); //1초간 스레드를 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class HanCount1 extends Thread { //Thread 클래스 상속한 클래스 정의
	
	public void run() { //run()메소드 오버라이드 및 스레드 코드 작성
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String[] strArr = {"하나", "둘", "셋","넷", "다섯"};
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(1000); //1초간 스레드를 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		
		NumCount1 nc1 = new NumCount1(); //객체생성
		nc1.start(); //스레드 출력
		
		HanCount1 hc1 = new HanCount1(); //객체생성
		hc1.start(); //스레드 출력
		
		
	}

}
