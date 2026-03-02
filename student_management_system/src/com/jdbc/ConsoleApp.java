package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
    	
    	Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int id;
		String name;
		double marks;

		String url = "jdbc:mysql://localhost:3306/jdbc2";
		String username = "root";
		String password = "sagnikr@15";
		
        Scanner sc = new Scanner(System.in);

        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection(url, username, password);
    		
            while (true) {
                System.out.println("\n1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.println("Enter the choice:");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        ps = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)");

                        System.out.print("Enter ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        ps.setInt(1, id);

                        System.out.print("Enter Name: ");
                        name = sc.nextLine();
                        ps.setString(2, name);

                        System.out.print("Enter Marks: ");
                        marks = sc.nextDouble();
                        ps.setDouble(3, marks);

                        ps.executeUpdate();
                        System.out.println("Student Added Successfully");
                        break;

                    case 2: 
                        ps = con.prepareStatement("UPDATE Student SET marks=? WHERE id=?");

                        System.out.print("Enter ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        ps.setInt(2, id);

                        System.out.print("Enter New Marks: ");
                        marks = sc.nextDouble();
                        ps.setDouble(1, marks);

                        int rows = ps.executeUpdate();
                        if (rows > 0) {
                            System.out.println("Student Marks Updated Successfully");
                        } else {
                            System.out.println("Student ID not found");
                        }
                        break;

                    case 3: 
                        ps = con.prepareStatement("DELETE FROM Student WHERE id=?");

                        System.out.print("Enter ID: ");
                        id = sc.nextInt();
                        ps.setInt(1, id);

                        int rows1 = ps.executeUpdate();
                        if (rows1 > 0) {
                            System.out.println("Student Deleted Successfully");
                        } else {
                            System.out.println("Student ID not found");
                        }
                        break;

                    case 4: 
                        ps = con.prepareStatement("SELECT * FROM Student");
                        rs = ps.executeQuery();

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + " " +
                                    rs.getString("name") + " " +
                                    rs.getDouble("marks")
                            );
                        }
                        break;

                    case 5:
                        sc.close();
                        return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}