package entity;

import java.sql.Date;

/*
 * �����ݿ�smbms_user��Ӧ��һ��Javaʵ����
 */
public class User {
	private int id;//����ID
	private String userCode;//�û�����
	private String userName;//�û���
	private String userPassword;//����
	private int gender;//�Ա�
	private Date birthday;//��������
	private String phone;//��ϵ��ʽ
	private String address;//��ַ��ID
	private int userRole;//�û���ɫ
	private int createdBy;//������id
	private int creationDate;//����ʱ��
	private int modifyBy;//�޸���
	private int modifyDate;//�޸�ʱ��
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
