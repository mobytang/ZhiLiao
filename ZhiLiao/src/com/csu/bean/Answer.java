package com.csu.bean;

import java.sql.Date;
/**
 * @author 刘巧
 * 
 */
public class Answer {
	private int answerId;//回答编号
	private String answerContent;//回答内容
	private String answerDate;//回答时间
	//private ? answerUser;//回答者：王俊强的user POJO写出来后引用	
	//private ? question;//问题：老司机的question POJO写出来后引用
	private int answerSupport;//点赞数
	private int isAnoy;//是否匿名
	
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}
	public int getAnswerSupport() {
		return answerSupport;
	}
	public void setAnswerSupport(int answerSupport) {
		this.answerSupport = answerSupport;
	}
	public int getIsAnoy() {
		return isAnoy;
	}
	public void setIsAnoy(int isAnoy) {
		this.isAnoy = isAnoy;
	}
	public Answer(int answerId, String answerContent, String answerDate, int answerSupport, int isAnoy) {
		super();
		this.answerId = answerId;
		this.answerContent = answerContent;
		this.answerDate = answerDate;
		this.answerSupport = answerSupport;
		this.isAnoy = isAnoy;
	}
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answerContent=" + answerContent + ", answerDate=" + answerDate
				+ ", answerSupport=" + answerSupport + ", isAnoy=" + isAnoy + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerContent == null) ? 0 : answerContent.hashCode());
		result = prime * result + ((answerDate == null) ? 0 : answerDate.hashCode());
		result = prime * result + answerId;
		result = prime * result + answerSupport;
		result = prime * result + isAnoy;
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
		Answer other = (Answer) obj;
		if (answerContent == null) {
			if (other.answerContent != null)
				return false;
		} else if (!answerContent.equals(other.answerContent))
			return false;
		if (answerDate == null) {
			if (other.answerDate != null)
				return false;
		} else if (!answerDate.equals(other.answerDate))
			return false;
		if (answerId != other.answerId)
			return false;
		if (answerSupport != other.answerSupport)
			return false;
		if (isAnoy != other.isAnoy)
			return false;
		return true;
	}
	
	

}
