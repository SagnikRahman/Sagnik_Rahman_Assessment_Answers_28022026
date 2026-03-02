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
		PreparedStatement ps = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/jdbc1";
		String username = "root";
		String password = "sagnikr@15";
		
		Scanner sc = new Scanner(System.in);
		
		try {
//			System.out.println("Enter ID: ");
//			int id = sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
//			ps = con.prepareStatement("SELECT * FROM Student WHERE student_id = ?");
//			ps.setInt(1, id);
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(4)); 			
//			}
			
//			System.out.println("Enter ID:");
//			int id = sc.nextInt();
//			sc.nextLine();
//
//			System.out.println("Enter name:");
//			String name = sc.nextLine();
//
//			System.out.println("Enter mobile number:");
//			String mobile = sc.nextLine();
//
//			System.out.println("Enter email:");
//			String email = sc.nextLine();
//
//			System.out.println("Enter department:");
//			String dept = sc.nextLine();
//
//			System.out.println("Enter admission date (yyyy-mm-dd):");
//			String date = sc.nextLine();
//
//			ps = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?, ?, ?, ?)");
//
//			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setString(3, mobile);
//			ps.setString(4, email);
//			ps.setString(5, dept);
//			ps.setDate(6, java.sql.Date.valueOf(date));
//
//			int r = ps.executeUpdate();
//
//			if (r > 0) {
//				System.out.println("Record inserted successfully");
//			} else {
//				System.out.println("No record found with given ID");
//			}
			
			
			System.out.println("Enter the ID of the student whose record needs to be deleted: ");
			int id1 = sc.nextInt();
			
			ps = con.prepareStatement("DELETE FROM Student WHERE student_id = ?");
			ps.setInt(1, id1);
			int r1 = ps.executeUpdate();
			
			if (r1 > 0) {
				System.out.println("Data deleted successfully");
			} else {
				System.out.println("No record found");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
