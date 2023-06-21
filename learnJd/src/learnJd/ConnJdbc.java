package learnJd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnJdbc {

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/","Arshad","1999ArshadVas");
				Statement stmt = conn.createStatement()){
			
			String sql = "CREATE DATABASE ELECTRONICS";
			stmt.executeUpdate(sql);
			System.out.println("DB created successfully");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
