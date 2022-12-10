package com.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_JDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s_name");
		String s_name=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter student phone_no");
		int phone_no=sc.nextInt();
		System.out.println("enter s_id");
		int s_id=sc.nextInt();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//register
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Bidisha98@");
		PreparedStatement stmt;
		 //inserting data in database table
		String sql="insert into StudentApplication value(????)";
		stmt=con.prepareStatement(sql);
		stmt.setInt(12,s_id);
		stmt.setString(12,s_name);
		stmt.setInt(12,phone_no);
		stmt.setInt(12,s_id);
		stmt.execute();
		System.out.println("inserted successfully");
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
