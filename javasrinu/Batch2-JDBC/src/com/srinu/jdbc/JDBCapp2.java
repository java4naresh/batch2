package com.srinu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCapp2 {

	public static void main(String[] args) {
		   int s_id = 5;
	  try {
		Class.forName("com.mysql.jdbc.Driver");// driver register
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2", "root", "root");
	    Statement stmt = con.createStatement();
	   // String updateQuary = "update student set s_name ="+"'"+"venki"+"'"+"where s_id ="+s_id;
	    String deleteQuary = "delete from student  where s_id="+s_id;
	   // System.out.println(updateQuary);
	   // int count = stmt.executeUpdate(updateQuary);
	    System.out.println(deleteQuary);
	    int count = stmt.executeUpdate(deleteQuary);
	    if(count !=0) System.out.println("Record deleted");
	    //if(count !=0) System.out.println("Record updated");
	    
	  } catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();         
	}
	  

	}

}
