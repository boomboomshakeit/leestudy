/*
 * 1. 프로그램명 : byte 타입 예제
 * 2. 작 성 일 : 2023.09.08
 * 3. 작 성 자 : 이태훈
 * 4. 내   용 : -128 ~ 0, +127까지 출력해 보기
 */

//주석

package tut01;

public class ByteEx {

	public static void main(String[] args) {
		//-128 저장 -> byte
		//테이터타입 변수명 = 값;
		//왼쪽 = 오른쪽; 오른쪽 값을 왼쪽에 대입
		
		byte b = 127; //byte는 -128부터 0 127까지
		System.out.println(b);
	}

}
