package com.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//register
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Bidisha98@");
	Statement stmt=con.createStatement();
	stmt.executeUpdate("insert into StudentApplication values(9,'Amrita',123466789,'howrah')");
	stmt.executeUpdate("insert into StudentApplication values(10,'Bidisha',1234523489,'Kolkata')");
	stmt.executeUpdate("insert into StudentApplication values(11,'Arita',123444789,'UP')");
		System.out.println("inserted successfully");
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}