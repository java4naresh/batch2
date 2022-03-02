package com.gopi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCapp1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //driver register
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gopi", "root", "root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table Employee (emp_id integer,emp_name varchar(25),emp_gender char)");
			String query = "insert into Employee values(1,"+"'"+"Gopi"+"'"+","+"'"+"M"+"'"+")";
			System.out.println(query);
			stmt.executeUpdate(query);
			
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
