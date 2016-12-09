package com.csu.test;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.csu.bean.Answer;
import com.csu.dao.AnswerDao;
import com.csu.dao.impl.AnswerDaoImpl;
import com.csu.util.TimeUtil;

/**
 * 测试answer接口实现 
 * @author 刘巧
 *
 */
public class testAnswer {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	    testAnswer test=new testAnswer();
	    test.testDelete();
	}
	
	public void testInsert() {
		Answer answer=new Answer();
	   answer.setAnswerContent("这是我插入的一条回答");
	   answer.setAnswerDate(TimeUtil.getCurrentTime());
	   answer.setAnswerSupport(0);
	   answer.setIsAnoy(0);
	   
	   AnswerDao answerDao=new AnswerDaoImpl();
	   boolean result=answerDao.insertAnswer(answer);
	   System.out.println(result);
	}
	
	public void testDelete() {
		AnswerDao answerDao=new AnswerDaoImpl();
		Answer answer=new Answer();
		answer.setAnswerId(5);
		boolean result=answerDao.deleteAnswer(answer);
		System.out.println(result);
	}

}
