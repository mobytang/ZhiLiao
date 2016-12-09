package com.csu.bean;
/**
 * 
 * @author 唐嘉良
 *
 */
public class Question {
	
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
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(int questionID, String questionTitle, String questionDes, int userID, boolean qIsAno) {
		super();
		this.questionID = questionID;
		this.questionTitle = questionTitle;
		this.questionDes = questionDes;
		this.userID = userID;
		this.qIsAno = qIsAno;
	}
	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", questionTitle=" + questionTitle + ", questionDes="
				+ questionDes + ", userID=" + userID + ", qIsAno=" + qIsAno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (qIsAno ? 1231 : 1237);
		result = prime * result + ((questionDes == null) ? 0 : questionDes.hashCode());
		result = prime * result + questionID;
		result = prime * result + ((questionTitle == null) ? 0 : questionTitle.hashCode());
		result = prime * result + userID;
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
		Question other = (Question) obj;
		if (qIsAno != other.qIsAno)
			return false;
		if (questionDes == null) {
			if (other.questionDes != null)
				return false;
		} else if (!questionDes.equals(other.questionDes))
			return false;
		if (questionID != other.questionID)
			return false;
		if (questionTitle == null) {
			if (other.questionTitle != null)
				return false;
		} else if (!questionTitle.equals(other.questionTitle))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}
	
	
}
