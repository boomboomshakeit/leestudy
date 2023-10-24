package realtest;

public class Test6 {

	public static void main(String[] args) {
		
		// - 하이픈(-)을 기준으로 주민번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 주민등록번호(001234-1234567)을 이용하여 1,3이면 남자, 2,4면 여자가 출력되게 프로그램을 작성하시오.
		
		String num = "001234-5234567";
		
		char genderCode = num.charAt(7);
		String gender = null;
		
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자입니다.";
		}else if(genderCode == '2' || genderCode == '4') {
			gender = "여자입니다.";
		}else {
			gender = "잘못된 값입니다.";
		}
		System.out.println(gender);

	}

}
