package com.srinu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp1 {

	public static void main(String[] args) {
     
		try {
			Class.forName("com.mysql.jdbc.Driver");//driver register
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2", "root", "root");
			Statement stmt = con.createStatement();
            // stmt.executeUpdate("create table student (s_id Integer primary key, s_name varchar(20),s_age Integer)");
            // int count = stmt.executeUpdate("insert into student values(1,"+"'"+"srinu"+"'"+",25)");
			String selectQuary = "select s_id,s_name from student";
			System.out.println(selectQuary);
			ResultSet rs = stmt.executeQuery(selectQuary);
			while (rs.next()) {
				int s_id = rs.getInt(1);
				String s_name = rs.getString(2);
				System.out.println("s_id = "+s_id +" , s_name = "+s_name);
			}
			//if(count != 0) System.out.println("table created");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 

	}

}
     