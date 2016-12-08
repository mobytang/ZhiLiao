package com.csu.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.csu.bean.Answer;
import com.csu.dao.AnswerDao;
import com.csu.util.DBUtil;
import com.mysql.jdbc.PreparedStatement;

/**
 * 回答接口实现类
 * @author 刘巧
 * @time 创建时间：2016年12月8日 最后修改时间：2016年12月8日
 */
public class AnswerDaoImpl implements AnswerDao{

	PreparedStatement ps;
	ResultSet rs;
	Connection connection;
	int result;
	
	/**
	 * 插入一条新回答进入answer表
	 * @param answer 待插入回答
	 * @return 插入结果 
	 */
	@Override
	public boolean insertAnswer(Answer answer) {
		// TODO Auto-generated method stub
		String sql="insert into "
				+ "answer(answerContent,answerDate,answerUser,support,questionId,asIsAnoy) "
				+ "values(?,?,?,?,?,?)";
		connection = DBUtil.getConnection();
		try {
			ps=(PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, answer.getAnswerContent());
			ps.setString(2, answer.getAnswerDate());
			ps.setInt(3, 1);//用户编号 
			ps.setInt(4, answer.getAnswerSupport());
			ps.setInt(5, 1);//问题编号 
			ps.setInt(6, answer.getIsAnoy());
			
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result==0) {
			return false;
		}
		else return true;
	}

	/**
	 * 删除一条回答从answer表
	 * @param answer 待删除回答
	 * @return 插入结果 
	 * delete from answer WHERE answer.answerId=5
	 */
	@Override
	public boolean deleteAnswer(Answer answer) {
		// TODO Auto-generated method stub
		String sql="delete from answer WHERE answer.answerId=4";
		connection = DBUtil.getConnection();
		try {
			ps=(PreparedStatement) connection.prepareStatement(sql);
			ps.setInt(1, answer.getAnswerId());			
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if (result==0) {
			return false;
		}
		else return true;
	}

	@Override
	public boolean updateAnswer(int answerId, Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Answer getAnswerById(int answerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Answer> getAnswerByQuestionId(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Answer> getAnswerByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
