package com.example.stockspring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
private int id;
@NotEmpty(message="please enter username")
	@Column(name="username")
private String userName;
@NotEmpty(message="please enter password")
	@Column(name="password")
private String password;
	@Column(name="usertype")
private String userType;
	@NotEmpty(message="please enter email")
	@Column(name="email")
private String email;
	
	@Column(name="mobilenumber")
private int mobileNumber;
	@Column(name="confirmed")
private boolean confirmed;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public boolean isConfirmed() {
	return confirmed;
}
public void setConfirmed(boolean confirmed) {
	this.confirmed = confirmed;
}
}
