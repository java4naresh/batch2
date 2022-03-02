package com.gopi.jdbc;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_App1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
   			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gopi", "root", "root");
    		Statement stmt = con.createStatement();
    		stmt.executeUpdate("Delete  from Student where s_id = 2");
    	//	stmt.executeUpdate("Drop table Student");
    	//	int count = stmt.executeUpdate("create table Student(s_id integer primary key,s_name varchar(25),s_gender char )");
    	//	if(count != 0) System.out.println("Table created");
    	//	String query = "insert into Student values(6,"+"'"+"Triveni"+"'"+","+"'"+"F"+"'"+")";
    		String selectQuery = "select * from Student";
    		System.out.println( selectQuery);
    		ResultSet rs  = stmt.executeQuery( selectQuery);
    		while(rs.next()) {
    			int s_id = rs.getInt(1);
    			String s_name = rs.getString(2);
    		//	Reader s_gender =  rs.getCharacterStream(3);
    		//	System.out.println("s_id ="+ s_id +" , s_name = "+ s_name + ", s_gender = " + s_gender );   
    			System.out.println("s_id ="+ s_id +" , s_name = "+ s_name);
    		}
    		
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void While(boolean next) {
		// TODO Auto-generated method stub
		
	}

}
