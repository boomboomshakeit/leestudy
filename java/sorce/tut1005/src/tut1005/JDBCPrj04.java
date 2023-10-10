package tut1005;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

class SelectDao {
	void selectDB() {
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null; //while
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "12345678");
			
			String sql = "SELECT * FROM member ORDER BY com_id DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // rs 객체 배열
			
			System.out.println("---------------사원목록 출력---------------");
			while(rs.next()) {//한줄 씩 값을 가져와서...
				System.out.println("사번 : " + rs.getInt(1) + ", 이름 : " + rs.getString(2) + ", 입사일 : " + rs.getDate(3) + ", 퇴사일 : " + rs.getDate(4));
				System.out.println("---------------------------------------");
			}
			
			System.out.println("연결성공");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("연결실패");
		}
	}
}

public class JDBCPrj04 {

	public static void main(String[] args) {
		SelectDao dao = new SelectDao();
		dao.selectDB();
	}

}
