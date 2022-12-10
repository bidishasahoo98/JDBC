package com.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Testcase {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Bidisha98@");
	//create statement
			Statement stmt=con.createStatement();
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
