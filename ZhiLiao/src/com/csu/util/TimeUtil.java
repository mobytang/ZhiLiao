package com.csu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 刘巧
 * 时间格式的转换
 * @time 创建时间：2016年12月8日 最后修改时间：2016年12月8日
 */
public class TimeUtil {

/**
 * 获取当前时间，格式为yyyy-MM-dd HH:mm:ss
 * @author 刘巧
 * @param 无
 * @return eg:2016-12-08 16:03:12
 */
	public static String getCurrentTime() {
		String currentTime="";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		currentTime=simpleDateFormat.format(new Date());
		return currentTime;
	}
	
	public static void main(String[] args) {
		System.out.println(TimeUtil.getCurrentTime());
	}
}
