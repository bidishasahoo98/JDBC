package com.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update_JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//register
	//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Bidisha98@");
	//create statement
			Statement stmt=con.createStatement();
			//update an existing data
			stmt.executeUpdate("update StudentApplication set city='west bengal' where s_id=9");
			//delete record
			stmt.executeUpdate("delete from StudentApplication where s_id=11");
			//execute quarry fetch data from database
			ResultSet rs=stmt.executeQuery("select *from StudentApplication");
			//iteration 
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
}}
