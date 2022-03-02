package com.srinu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCApp3 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Id");
		int s_id = scr.nextInt();
		System.out.println("Enter Name");
		String s_name = scr.next();
		
		System.out.println("Enter age");
		int s_age = scr.nextInt();
		System.out.println(s_id + " "+s_name+" "+ s_age);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//driver register
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2","root","root");
			Statement stmt = con.createStatement();
			String insertQuary = "insert into student values ("+s_id+","+"'"+s_name+"'"+","+s_age+")";
			System.out.println(insertQuary);
			int count = stmt.executeUpdate(insertQuary);
			if(count != 0) System.out.println("record updated");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
