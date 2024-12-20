package dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class student_db_connection {
private static String driver = "com.mysql.cj.jdbc.Driver";
public static Connection conn = null;
private static String username = "root";
private static String password = "Satya@22551A4261";
private static String url ="jdbc:mysql://127.0.0.1:3306/studentdashboard";
public static Connection getConnection() {
	try {
		Class.forName(driver);
		conn=DriverManager.getConnection(url, username, password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
}
}
