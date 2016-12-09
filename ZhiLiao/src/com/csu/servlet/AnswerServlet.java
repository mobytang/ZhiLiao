package com.csu.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csu.bean.Answer;
import com.csu.dao.AnswerDao;
import com.csu.dao.impl.AnswerDaoImpl;
import com.csu.util.TimeUtil;

/**
 * Servlet implementation class AnswerServlet
 */

@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AnswerDao answerDao=new AnswerDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String methodName = request.getParameter("method");
		System.out.println(methodName);
	        try {
	            // 利用反射获取方法
	            Method method = getClass().getDeclaredMethod(methodName,
	                    HttpServletRequest.class, HttpServletResponse.class);
	            // 执行相应的方法
	            method.invoke(this, request, response);
	        } catch (Exception e) {
	            // TODO: handle exception
	        }
	}
	
	public void submitAnswer(HttpServletRequest request, HttpServletResponse response) {
		
		String word_content = request.getParameter("container");
		System.out.println("word_content"+word_content);
		//假装接收参数值
		Answer answer=new Answer();
	    answer.setAnswerContent("这是我插入的一条回答");
	    answer.setAnswerDate(TimeUtil.getCurrentTime());
	    answer.setAnswerSupport(0);
	    answer.setIsAnoy(0);
	    //调用dao 插入数据库
	    /*boolean result=answerDao.insertAnswer(answer);
	    //根据执行结果选择跳转
	    if (result) {
			//response.sendRedirect("");
		}
	    else{
	    	//response.sendRedirect("");
	    }*/
		//return null;		
	}

}
