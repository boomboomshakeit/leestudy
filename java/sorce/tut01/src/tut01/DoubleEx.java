package tut01;

public class DoubleEx {

	public static void main(String[] args) {
		
		//실수를 저장하는 변수 -> 값을 지정하지 않았을 때
		//값을 1.0으로 바꿀때
		
//		double d = 0.0;
//		System.out.println(d);
//		
//		//변수 선언은 기본적으로 overwrite(덮어쓰기)
//		d = 1.0;
//		System.out.println(d);
//		
//		//d2라는 변수 하나를 추가하는데 값은 2.0 두 값을 더하기
//		double d2 = 2.0;
//		
//		System.out.println(d + d2);
		
//		double d = 1.0;
//		double d2 = 2.0;
		
		double d, d2;
		d = 1.23456;
		d2 = 2.23456;
		
		//쇼핑몰 -> 1.2 + 2.2 = 3.4 => 3
		//실수 -> 정수로 타입 변환 : 형변환 = (바꿀타입)변수명
		//연산자 우선순위 - 특별히 지정하지 않으면 가까운 쪽에 것을 먼저 처리
		//()처리 우선순위가 가장 높기 때문에
		//순수한 숫자를 제외하면 + 연산자는 앞뒤를 연결할 때 사용
		System.out.println("합계 " + (int)(d + d2) + "달러");
		
		// + * / -
		// % : 몫이 아니고 나머지
		
		//0012345-1234567 주민번호의 8번째 숫자를 이요하여 남자 여자를 표시하시오
		//단, %, if 사용해서 표시하시오
		
		
		
		System.out.println("---------------------");
		int jumin = 1;
		
		if(jumin % 2 == 1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		//(조건) ? 참 : 거짓;
		String result = (jumin % 2 == 1) ? "남자" : "여자";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
