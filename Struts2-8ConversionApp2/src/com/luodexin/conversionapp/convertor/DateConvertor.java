package com.luodexin.conversionapp.convertor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConvertor extends StrutsTypeConverter {
	
	private DateFormat dateFormat;
	
	public DateConvertor() {
		System.out.println("DateConvertor Constractor ........");
		dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if(toClass == Date.class){
			if(values != null && values.length > 0){
				String value = values[0];
				try {
					return dateFormat.parseObject(value);
				} catch (ParseException e) {
					System.out.println("类型转换异常。。。。。");
					e.printStackTrace();
				}
			}
		}
		return values;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if(o instanceof Date){
			Date date = (Date)o;
			return dateFormat.format(date);
		}
		return null;
	}



}
