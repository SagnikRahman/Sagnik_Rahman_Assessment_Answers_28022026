package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		String url = "jdbc:mysql://localhost:3306/mental_health_db_normalized_new";
		String username = "root";
		String password = "sagnikr@15";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM patients");
			
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + ", " + rs.getString(5) + ", " + rs.getString(9));
//			}
			
			ps = con.prepareStatement("DELETE FROM patients WHERE id = ?");
			ps.setInt(1, 26);
			int rows = ps.executeUpdate();
			
			if (rows > 0) {
				System.out.println("Data Deleted Successfully");
			} else {
				System.out.println("No Record Found");
			}
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(5) + ", " + rs.getString(9)); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
