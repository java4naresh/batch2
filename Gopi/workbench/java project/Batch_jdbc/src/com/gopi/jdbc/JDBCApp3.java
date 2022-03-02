package com.gopi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCApp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int s_id = sc.nextInt();
		System.out.println("Enter Name");
		String s_name = sc.next();
		System.out.println("Enter char");
		String s_gender = sc.next();
		System.out.println(s_id+"  "+s_name+"  "+s_gender);
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gopi", "root", "root");
			Statement stmt = con.createStatement();
			String insertQuery = "insert into Student values("+s_id+","+"'"+s_name+"'"+","+"'"+s_gender+"'"+")";
			System.out.println(insertQuery);
			int count = stmt.executeUpdate(insertQuery);
			//String deleteQuery = "Delete "+s_id+","+"'"+s_name+"'"+","+"'"+s_gender+"'"+" from Student" ;
			//int count = stmt.executeUpdate(deleteQuery);
			if(count != 0) System.out.println("Record Updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}

}
