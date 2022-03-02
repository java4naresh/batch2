package com.gopi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp2 {
	public static void main(String[] args) {
		int s_id = 1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gopi","root","root");
			Statement stmt = con.createStatement();
		//	String updateQuery = "update  Student set s_name= "+"'"+"Gopi Kambala"+"'" +"Where s_id ="+s_id;
			String deleteQuery = "Delete from  Student  Where s_id ="+s_id;
			int count = stmt.executeUpdate(deleteQuery);
		//	int count = stmt.executeUpdate(updateQuery);
			if(count !=0) System.out.println("Record Updated");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
