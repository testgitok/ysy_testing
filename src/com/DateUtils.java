package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static final String _DEFAULT1 = "yyyy-MM-dd HH:mm";		//2014-07-25 11:18
    
    public static final String _DEFAULT2 = "yyyy-MM-dd HH:mm:ss";		//2014-07-25 11:18:46
    
    
    /**
     * 日期时间格式转换
     * */
	public static String formatDate(Date date) {
		return formatDate(date, _DEFAULT1);
	}
	
	 /**
     * 日期时间格式转换
     * @param:String style:_DEFAULT1.2...
     * */
	public static String formatDate(Date date, String style) {
		return new SimpleDateFormat(style).format(date);
	}
	
}
