package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) throws IOException {
		/*
		 -Exception : 컴파일
			1.ClassNotFound~ : Class.forName(디비 또는 서블릿);
			2.IOE~ : 입출력
			3.FileNotFoundE : 파일이 없는 경우
			4.InterruptE~ : 쓰레드
			5.CloneNotSupportEx~ : clone 객체 사용할 때
		 */
		/*
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //예외가 발생한 부분을 표시해줌 : 개발자
			e.getMessage(); //예외 메시지
			System.out.println("404 Error : 관리자에게 문의하세요.");
			
		}finally {//성공, 실패 여부와 상관없이 마지막에 꼭 실행해야 하는 내용
			System.out.println("프로그램 종료.");
			*/
			/*
			rs.close();
			pstmt.close();
			conn.close();
			
			try {
				if(conn != null) {
					conn.close();
				}
			}
			*/
		
		/*
		try {
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			System.out.println("404 Error : 관리자에게 문의하세요.");
		}finally {
			System.out.println("종료합니다.");
		}
		*/
		/*
		 -Runtime Exception : 실행 단위
			-ArimetricEx~ : 나누기 예외
			-ArrayIndexOutBoundE~
			-NullPointEx~
		 */
		/*
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			ae.getMessage();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		*/
		/*
		
		String[] str = new String[] {"a", "b", "c"};
//		System.out.println(str.length);
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
		
		try {
			System.out.println(str[3]);
		} catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			System.out.println("인덱스 번호 예외");
		}
		*/
		
		/*
		String str = "koreait";
		
		//글자 추출 후 char로 변경해수 출력
		//System.out.println(str.charAt(0));
		
		String str2 = null;
		
		try {
			System.out.println(str2.charAt(0));
		} catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("데이터 값이 없습니다.");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
