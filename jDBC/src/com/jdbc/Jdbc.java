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

		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "sagnikr@15";
		
		
		try {
			//Display data from table
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(url, username, password);
//			st = con.createStatement();
//			rs = st.executeQuery("SELECT * FROM Student");
//    		
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(4)); 
			// also try by passing column names instead of getInt, getString, etc.
//			}

			//Insert data into table
//			String query = "INSERT INTO Student VALUES (?, ?, ?, ?, ?, ?)";
//			ps = con.prepareStatement(query);
//
//			ps.setInt(1, 107);
//			ps.setString(2, "Rahul Sen");
//			ps.setString(3, "9876543210");
//			ps.setString(4, "rahul.s@gmail.com");
//			ps.setString(5, "Java");
//			ps.setDate(6, java.sql.Date.valueOf("2026-03-01"));
//
//			int rows = ps.executeUpdate();
//
//			if (rows > 0) {
//				System.out.println("Data Inserted Successfully");
//			}
			
			String query = "DELETE FROM Student WHERE student_id = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, 107);
			int rows = ps.executeUpdate();
			// st.executeUpdate("INSERT INTO patients (id, .....");

			if (rows > 0) {
				System.out.println("Data Deleted Successfully");
			} else {
				System.out.println("No Record Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}