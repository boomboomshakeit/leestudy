package tut1004;

import java.sql.DriverManager;
//import java.sql.*; 이렇게하면 수동으로 등록할 수 있음

public class JdbcPrj01Ex {

	public static void main(String[] args) {
		
		//데이터입출력 : try ~ catch() 또는 메소드 일므 옆에 throws
		JdbcPrj01Ex jdbc = new JdbcPrj01Ex();
		jdbc.mysqlConnect();
		
	}

	void mysqlConnect() { //mysql 접속동작
		try {
			
			//1. jdbc 연결 : Class.forName();
			//ver5 : Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결정보 : Connection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "12345678";
			
			DriverManager.getConnection(url, id, pwd); //맥은 url, id, pwd로 써야댐
			
			//3. 확인
			System.out.println("데이터베이스 연결완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
