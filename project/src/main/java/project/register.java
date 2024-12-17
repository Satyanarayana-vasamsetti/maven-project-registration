package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String mail = req.getParameter("email");
		String pass = req.getParameter("password");
		try {
			PrintWriter pw=resp.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","Satya@22551A4261");
			String sql ="insert into login(name,email,password) values(?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, name);
			pmst.setString(2, mail);
			pmst.setString(3, pass);
			int i = pmst.executeUpdate();
			if(i > 0) {
				pw.println("Successfully Inserted");
			}
			else {
				pw.println("Error");
			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
