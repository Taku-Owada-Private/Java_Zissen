package rensyu_mondai;

import java.util.ArrayList;
import java.sql.*;

public class ItemsDAO {
	
	
	public ArrayList<Item>findByMinimumPrice(int i) {
		
		//ArrayList<Item> items = new ArrayList<>();
		
		try {
			Class.forName("org.h2.Driver");
			
		}catch(ClassNotFoundException e) {
			//throw new IllegalStateException("ドライバのロードに失敗しました");
			e.printStackTrace();
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:~/mydb");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > ?");
			pstmt.setInt(1,i);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Item> items = new ArrayList<>();
			while(rs.next()) {
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHT"));
				items.add(item);
			}
		rs.close();
		pstmt.close();
		return  items;
			
		}catch(SQLException e2) {
			e2.printStackTrace();
			return null;
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e3) {
					e3.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}

}
