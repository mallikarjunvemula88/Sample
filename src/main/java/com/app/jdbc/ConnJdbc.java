package com.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnJdbc {
	private static Connection con=null;
	static
	{
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static Connection getconn()
{
	return con;
}

	
}