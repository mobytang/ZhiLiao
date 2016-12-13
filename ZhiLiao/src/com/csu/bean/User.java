package com.csu.bean;

public class User {
	private int userId;          //用户编号
	private String userName;     //用户名	
	private String passWord;     //密码
	private String email;        //邮箱
	private String sex;          //性别
	private String userIntro;    //一句话介绍
    private String address;      //居住地	
	private String industry;     //所在行业
	private String careerEx;     //职业经历
    private String educationEx;  //教育经历
    private String simpleIntro;  //个人简介
	private String image;        //图片
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserIntro() {
		return userIntro;
	}
	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getCareerEx() {
		return careerEx;
	}
	public void setCareerEx(String careerEx) {
		this.careerEx = careerEx;
	}
	public String getEducationEx() {
		return educationEx;
	}
	public void setEducationEx(String educationEx) {
		this.educationEx = educationEx;
	}
	public String getSimpleIntro() {
		return simpleIntro;
	}
	public void setSimpleIntro(String simpleIntro) {
		this.simpleIntro = simpleIntro;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", sex=" + sex + ", userIntro=" + userIntro + ", address=" + address + ", industry=" + industry
				+ ", careerEx=" + careerEx + ", educationEx=" + educationEx + ", simpleIntro=" + simpleIntro
				+ ", image=" + image + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((careerEx == null) ? 0 : careerEx.hashCode());
		result = prime * result + ((educationEx == null) ? 0 : educationEx.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((simpleIntro == null) ? 0 : simpleIntro.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userIntro == null) ? 0 : userIntro.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (careerEx == null) {
			if (other.careerEx != null)
				return false;
		} else if (!careerEx.equals(other.careerEx))
			return false;
		if (educationEx == null) {
			if (other.educationEx != null)
				return false;
		} else if (!educationEx.equals(other.educationEx))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (passWord == null) {
			if (other.passWord != null)
				return false;
		} else if (!passWord.equals(other.passWord))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (simpleIntro == null) {
			if (other.simpleIntro != null)
				return false;
		} else if (!simpleIntro.equals(other.simpleIntro))
			return false;
		if (userId != other.userId)
			return false;
		if (userIntro == null) {
			if (other.userIntro != null)
				return false;
		} else if (!userIntro.equals(other.userIntro))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
		
}
