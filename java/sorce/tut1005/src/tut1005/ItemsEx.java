package tut1005;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ItemCrud {
	
	void selectItem() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "12345678";
		
		conn = DriverManager.getConnection(url, id, pwd);
		String sql = "SELECT * FROM items ORDER BY pro_num DESC";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { //디비 -> 객체 -> 화면 출력
			Items items = new Items();
			//rs.getInt(1);
			items.setProNum(rs.getInt(1));
			items.setProName(rs.getString(2));
			items.setProPrice(rs.getInt(3));
			items.setProStock(rs.getInt(4));
			items.setProDate(rs.getString(5));
			
			System.out.println(items.toString());
			
		}
	}
	void insertItem() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "12345678";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "INSEERT INTO items VALUES(NULL, ?, ?, ?, NOW());";
			pstmt = conn.prepareStatement(sql);
			
			Items item = new Items();
			item.setProName("한돈++");
			item.setProPrice(100000);
			item.setProStock(-100);
			
			pstmt.setString(1, item.getProName());//실제 디비 저장
			pstmt.setInt(2, item.getProPrice());
			pstmt.setInt(3, item.getProStock());
			int row = pstmt.executeUpdate();
			
			if(row > 0) {
				System.out.println(item.getProName() + " 상품 등록이 완료되었습니다.");
			} else {
				System.out.println("상품등록에 실패하였습니다.\n확인하세요.");
			}
			
		} catch(Exception e) {
			
		}
	}
}

public class ItemsEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ItemCrud crud = new ItemCrud();
		//crud.insertItem();
		crud.selectItem();
		
		
	}

}
