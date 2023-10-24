package realtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class Sub7 {
	
	void InsertSub() throws SQLException {
		
		//INSERT 
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kordb", "tae", "1234");
			stmt = conn.createStatement();
			String sql = "INSERT INTO kordb_member VALUES(NULL, '권보성', '2425', now(), '남', '리얼키키')";
			stmt.execute(sql);
			System.out.println("DB에 저장 되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	void SelectSub() throws SQLException {
		
		//SELECT
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kordb", "tae", "1234");
				String sql = "SELECT * FROM kordb_member";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.println("아이디 : " + rs.getInt(1) + ", 이름 : " + rs.getString(2) + ", 비밀번호 : " 
				+ rs.getString(3) + ", 가입일 : " + rs.getDate(4) + ", 성별 : " + rs.getString(5) + ", 자기소개 : " + rs.getString(6));
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
		
	}
}

public class Test7 {

	public static void main(String[] args) throws SQLException {
		
		Sub7 sub = new Sub7();
		//sub.InsertSub(); // SELECT 시에는 주석 처리하고 실행하여 주세요.

		sub.SelectSub(); // INSERT 시에는 주석 처리하고 실행하여 주세요.
	}

}
