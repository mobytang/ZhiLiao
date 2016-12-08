package com.csu.question.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class questionDBUtil {

	private Connection connection;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://localhost/question";
			String username = "root";
			String password = "123456";
			
			connection =DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}