package models;

public class student {
	private String rollno;
	private String name;
	private String email;
	private String password;
	private long phoneno;
	private int gender;
	private String address;
	private int pincode;
	private String course;
	private String branch;
	private int year;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String rollno, String name, String email, String password, long phoneno, int gender, String address,
			int pincode, String course, String branch, int year) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
		this.course = course;
		this.branch = branch;
		this.year = year;
	}
	
}
