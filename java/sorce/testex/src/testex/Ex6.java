package testex;

public class Ex6 {

	public static void main(String[] args) {
		// 주민등록번호 여자 남자 출력
		
		String mem = "111111-1011111";
		String mem2 = "111111-2011111";
		
		char genderCode = mem.charAt(7); //문자열로 받아야함
		
		String gender;
		if(genderCode == '1' || genderCode == '3') { //문자열로 추가해야함
			gender = "남성입니다.";
		}else {
			gender = "여성입니다.";
		}
		
		System.out.println(gender);
		
	}

}
