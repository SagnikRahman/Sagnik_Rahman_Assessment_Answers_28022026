package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		String url = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "sagnikr@15";
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM country ");
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(4)); 
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the code of the country whose record needs to be deleted: ");
			String id1 = sc.nextLine();
			
			ps = con.prepareStatement("DELETE FROM country WHERE code = ?");
			ps.setString(1, id1);
			int r1 = ps.executeUpdate();
			
			if (r1 > 0) {
				System.out.println("Data deleted successfully");
			} else {
				System.out.println("No record found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
