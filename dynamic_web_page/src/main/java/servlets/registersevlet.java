package servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.student_db_connection;
import models.student;
import services.student_service;

@WebServlet("/register")

public class registersevlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rollnumber=req.getParameter("rollnumber");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
	    Long mobilenumber=Long.parseLong(req.getParameter("mobilenumber"));
		Integer gender=Integer.parseInt(req.getParameter("gender"));
		String adddress=req.getParameter("adddress");
		Double salary=Double.parseDouble(req.getParameter("salary"));
		student s=new student(rollnumber, name, email, password, 0, 0, adddress, 0, password, adddress, 0);
		student_service service=new student_service(student_db_connection.getConnection());
		boolean i=service.addStudent(s);
		if (i) {
			resp.sendRedirect("");
		}
		else {
			resp.sendRedirect("");
		}
	}

}
