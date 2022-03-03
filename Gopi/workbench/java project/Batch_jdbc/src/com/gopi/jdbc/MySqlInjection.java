package com.gopi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlInjection {

	public static void main(String[] args) {
		
		
		
		try {
			String userName = "Gopinadh"; //"\"\" or \"\"=\"\"";
			String userPassword = "KGN7116"; //"\"\" or \"\"=\"\"";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gopi", "root", "root");
		//	Statement stmt = con.createStatement();
		//	int count = stmt.executeUpdate("create table User1(u_id integer,u_name varchar(25),u_password varchar(25))");
		//	int count = stmt.executeUpdate("insert into User1 values(1,"+"'"+"Gopinadh"+"'"+","+"'"+"KGN7116"+"'"+")");
			String selectQuery = "select * from User1 where u_name = ? and u_password =?";
			System.out.println(selectQuery);
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
		//	String selectQuery = "select * from User1 where u_id= 1 ";
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
    		int u_id = rs.getInt(1);
    			String u_name = rs.getString(2);
    			String u_password = rs.getString(3);
    			System.out.println(u_id + ","+ u_name + "," + u_password);
    			//System.out.println( u_name);
			}
		//	if(count != 0) System.out.println("Table Create");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
