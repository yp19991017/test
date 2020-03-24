package entity;

import java.sql.Date;

/*
 * 与数据库smbms_user对应的一个Java实体类
 */
public class User {
	private int id;//主键ID
	private String userCode;//用户编码
	private String userName;//用户名
	private String userPassword;//密码
	private int gender;//性别
	private Date birthday;//出生日期
	private String phone;//联系方式
	private String address;//地址键ID
	private int userRole;//用户角色
	private int createdBy;//创建者id
	private int creationDate;//创建时间
	private int modifyBy;//修改者
	private int modifyDate;//修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public int getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(int modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
