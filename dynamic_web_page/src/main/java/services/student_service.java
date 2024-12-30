package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.student;

public class student_service {
private Connection conn;

public student_service(Connection conn) {
	super();
	this.conn = conn;
}

public boolean addStudent(student s) {
	boolean f = false;
	try {
		String sql = "insert into student(rollno,name,email,password,phoneno,gender,address,pincode,course,branch,year) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pmst = conn.prepareStatement(sql);
		pmst.setString(1,s.getRollno());
		pmst.setString(2,s.getName());
		pmst.setString(3,s.getEmail());
		pmst.setString(4,s.getPassword());
		pmst.setLong(5,s.getPhoneno());
		pmst.setInt(6,s.getGender());
		pmst.setString(7,s.getAddress());
		pmst.setInt(8,s.getPincode());
		pmst.setString(9,s.getCourse());
		pmst.setString(10,s.getBranch());
		pmst.setInt(11,s.getYear());
		int i = pmst.executeUpdate();
		if(i==1) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
public student getbyEmail(String email) {
//	student s = new student();
	student s = null;
	try {
		String sql = "select * from student where email=?";
		PreparedStatement pmst = conn.prepareStatement(sql);
		pmst.setString(1,email);
		ResultSet rs = pmst.executeQuery();
		while(rs.next()) {
			s = new student();
			s.setRollno(rs.getString(1));
			s.setName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setPassword(rs.getString(4));
			s.setPhoneno(rs.getLong(5));
			s.setGender(rs.getInt(6));
			s.setAddress(rs.getString(7));
			s.setPincode(rs.getInt(8));
			s.setCourse(rs.getString(9));
			s.setBranch(rs.getString(10));
			s.setYear(rs.getInt(11));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
	
}
public boolean deleteByRollNo(String rollno) {
	boolean f = false;
	try {
		String sql = "delete from student where rollno = ?";
		PreparedStatement pmst = conn.prepareStatement(sql);
		int i = pmst.executeUpdate();
		if(i==1) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
public List<student> getAll(student s){
	List<student> li = new ArrayList<student>();
	try {
		String sql = "select * from student";
		PreparedStatement pmst = conn.prepareStatement(sql);
		ResultSet rs = pmst.executeQuery();
		while(rs.next()) {
			s.setRollno(rs.getString(1));
			s.setName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setPassword(rs.getString(4));
			s.setPhoneno(rs.getLong(5));
			s.setGender(rs.getInt(6));
			s.setAddress(rs.getString(7));
			s.setPincode(rs.getInt(8));
			s.setCourse(rs.getString(9));
			s.setBranch(rs.getString(10));
			s.setYear(rs.getInt(11));
			li.add(s);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return li;
}
public boolean updateStudent(student s) {
	boolean f = false;
	try {
		String sql = "update student set name=?,email=?,password=?,phoneno=?,gender=?,address=?,pincode=?,course=?,branch=?,year=? where rollno=?";
		PreparedStatement pmst = conn.prepareStatement(sql);
		
		pmst.setString(1,s.getName());
		pmst.setString(2,s.getEmail());
		pmst.setString(3,s.getPassword());
		pmst.setLong(4,s.getPhoneno());
		pmst.setInt(5,s.getGender());
		pmst.setString(6,s.getAddress());
		pmst.setInt(7,s.getPincode());
		pmst.setString(8,s.getCourse());
		pmst.setString(9,s.getBranch());
		pmst.setInt(10,s.getYear());
		pmst.setString(11,s.getRollno());
		int i = pmst.executeUpdate();
		if(i==1) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
}
