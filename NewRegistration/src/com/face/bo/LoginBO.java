package com.face.bo;

public class LoginBO {
	private String name;
	private String email;
	private String phno;
	private String uname;
	private String password;
	
	public LoginBO() {


	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public LoginBO(String name, String email, String phno, String uname, String password) {
		//super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.uname = uname;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
