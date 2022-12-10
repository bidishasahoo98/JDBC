package JDBC_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	static {
		 try {
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
	 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 }
	 public static Connection con()throws SQLException{
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Bidisha98@");
		 
	 }

	public static void main(String[]args) throws Exception {
		MenudrivenEg mde=new MenudrivenEg();
		mde.saveMenuDriven();
    	mde.fetchMenuDriven();
		mde.updateMenuDriven();
		mde.deleteMenuDriven();
	}} 