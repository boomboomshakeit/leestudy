package exception;

public class Exception02 {
	//4.InterruptE~ : 쓰레드
	public static void main(String[] args) {
		
		//Exception -> Interrupt
		
		

	}
	
	void thread1() throws InterruptedException {
		//1초 뒤에 멈추세요.
		Thread.sleep(1000);
	}

	void thread2() {
		try {
			Thread.sleep(1000);
			System.out.println("쓰레드 성공");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("스레드를 종료합니다.");
		}
	}
	
}
