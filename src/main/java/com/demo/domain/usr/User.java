package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User extends BaseDomain {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select uuid()")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
	private String id;

	private String name;

	@Column(name = "nick_name")
	private String nickName;

	private String password;

	private String college;

	private String major;

	private String address;

	@Column(name = "startDate")
	private Integer startdate;

	private String email;

	private String phone;

	private String status;

	@Column(name = "head_url")
	private String headUrl;

	private Integer versions;

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return nick_name
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return college
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @param college
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * @return major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return startDate
	 */
	public Integer getStartdate() {
		return startdate;
	}

	/**
	 * @param startdate
	 */
	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return head_url
	 */
	public String getHeadUrl() {
		return headUrl;
	}

	/**
	 * @param headUrl
	 */
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	/**
	 * @return versions
	 */
	public Integer getVersions() {
		return versions;
	}

	/**
	 * @param versions
	 */
	public void setVersions(Integer versions) {
		this.versions = versions;
	}
}