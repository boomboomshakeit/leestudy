package testex;

public class zzin6 {

	public static void main(String[] args) {
		// 주민등록번호로 남녀 구분
		
		String mem = "111111-2111111";
		
		char genderCode = mem.charAt(7);
		
		String gender = null;
		
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자입니다.";
		} else if (genderCode == '2' || genderCode == '4') {
			gender = "여자입니다.";
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println(gender);
	}

}
