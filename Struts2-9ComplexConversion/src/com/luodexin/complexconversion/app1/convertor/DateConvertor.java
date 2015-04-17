package com.luodexin.complexconversion.app1.convertor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConvertor extends StrutsTypeConverter {

	private DateFormat dateFormat;
	
	public DateConvertor() {
		System.out.println("dateformat constactor .....");
	}
	
	protected DateFormat getDateFormat () {
		if(dateFormat == null)
			dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return dateFormat;
	}

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if(toClass == Date.class){
			if(values != null && values.length > 0){
				String value = values[0];
				try {
					System.out.println("convert from string ......");
					Date date = getDateFormat().parse(value);
					return date;
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if(o instanceof Date){
			System.out.println("convert to string .....");
			Date date = (Date) o;
			return getDateFormat().format(date);
		}
		return null;
	}
	


}
