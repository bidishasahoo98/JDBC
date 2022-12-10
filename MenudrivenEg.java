package com.packages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenudrivenEg {
	Scanner sc=new Scanner(System.in);
	int e_id,e_age,e_salary;
	String e_name,e_city;
	//saving employee details in database
	public void saveMenuDriven()throws SQLException{
		System.out.println("Enter employee Id:");
		e_id=sc.nextInt();
		System.out.println("Enter employee name:");
		e_name=sc.next();
		System.out.println("Enter employee age:");
		e_age=sc.nextInt();
		System.out.println("Enter employee city:");
		e_city=sc.next();
		System.out.println("Enter employee salary:");
		e_salary=sc.nextInt();
		Connection conn=Helper.con();
		PreparedStatement stmt=conn.prepareStatement("insert into Menudriven values(?,?,?,?,?)");
	stmt.setInt(1,e_id);
		stmt.setString(2,e_name);
		stmt.setInt(3,e_age);
		stmt.setString(4,e_city);
		stmt.setInt(5,e_salary);
		stmt.executeUpdate();
		}
	//fetching employee details in database(display)
	public void fetchMenuDriven()throws Exception{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		//execute quarry fetch data from database
		ResultSet rs=stmt.executeQuery("select * from MenuDriven");
		//iteration 
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+rs.getString(5));
		}}
	//updating employee details in database
	public void updateMenuDriven()throws Exception{
	Connection conn=Helper.con();
	Statement stmt=conn.createStatement();
	System.out.println("Enter employee id to modify:");
	e_id = sc.nextInt();
	System.out.println("Enter city to update:");
	e_city=sc.next();
	stmt.executeUpdate("update menudriven set e_city='"+e_city+"' where e_id= "+e_id);
	}
	//deleting employee detail in the database
	public void deleteMenuDriven()throws Exception{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter employee Id:");
		e_id=sc.nextInt();
		stmt.executeUpdate("delete from MenuDriven where e_id= "+e_id);
}
}
