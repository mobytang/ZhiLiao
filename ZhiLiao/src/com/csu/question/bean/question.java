package com.csu.question.bean;

public class question {

	private int questionID;
	private String questionTitle;
	private String questionDes;
	private int userID;
	private boolean qIsAno;
	
	
	
	
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionDes() {
		return questionDes;
	}
	public void setQuestionDes(String questionDes) {
		this.questionDes = questionDes;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public boolean isqIsAno() {
		return qIsAno;
	}
	public void setqIsAno(boolean qIsAno) {
		this.qIsAno = qIsAno;
	}
	
	
	
}
