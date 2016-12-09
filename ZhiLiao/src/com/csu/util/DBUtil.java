package com.csu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 * @author 刘巧
 *
 */
public class DBUtil {
	/**
	 * @author 刘巧
	 * @param 无
	 * @return 一个可用的数据库连接
	 * @time 2016-12-8
	 */
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/zhiliaodb";
		String userName="root";
		String passWord="123456";
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			connection=DriverManager.getConnection(url,userName,passWord);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;		
	}

	/**
	 * 该main方法可用来测试是否成功获取连接
	 * 如果可以获取，可在控制台看到com.mysql.jdbc.JDBC4Connection@******
	 * @param args
	 * @author 刘巧
	 */
   public static void main(String[] args) {
	   System.err.println(DBUtil.getConnection());
   }

}
