package testex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class all {
	void insertdb() throws SQLException {
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "12345678");
			
			stmt = conn.createStatement();
			String sql = "INSERT INTO mem VALUES(null, '뉴진스', '1313', now())";
			stmt.execute(sql);//rs는 insert에 안씀
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void selectdb() throws SQLException {
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "12345678");
//			conn = stmt.getConnection(); 출력은 이거 필요없음
			String sql = "SELECT * FROM mem";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"," + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getDate(4));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class zzin77 {

	public static void main(String[] args) throws SQLException {
		
		all all = new all();
//		all.insertdb();
		all.selectdb();
	}

}
