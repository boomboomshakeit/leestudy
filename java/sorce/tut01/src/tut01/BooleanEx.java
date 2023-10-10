package tut01;

public class BooleanEx {
	
	public static void main(String[] arg) {
		//컴퓨터에서는 0, 1 => false(거짓) 0
		//				=>	true(참) 0을 제외한 양수는 참
		
		//기본타입의 초기값 설정(비워두면 쓰레기 값이 생기기에 정수의 경우 0을 넣고 실수의 경우에는 0.0, boolean같은 경우 false를 넣는)
//		int i = 0;
//		double d = 0.0;
//		boolean b = false;
//		String str = "";
		
		boolean b = true;
		
		//equals() : String 값
		//참이면 통과, 아니면 재평가
		//그 외 비교할 때는 ==
		if(b) { //if(b)는 if(b == true)와 같
			System.out.println("통과");
		} else {
			System.out.println("재평가");
		}
		
		String result = (b) ? "통과" : "재평가";
		System.out.println(result);
		
		//조건이 참이면 1 아니면 0을 출력하시오
		int i = (b) ? 1 : 0;
		
		//조건이 참이면 1.0 아니면 0.0을 출력하시오
		double d = (b) ? 1.0 : 0.0;
		
		//조건이 참이면 true 아니면 false을 출력하시오
		
		boolean b1 = (b) ? true : false;
	}
}
