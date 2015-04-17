package com.luodexin.struts2.testIDCard;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IDCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object object) throws ValidationException {
		//1.获取 字段名 和 值
		String fielName = getFieldName();
		Object value = this.getFieldValue(fielName, object);
		//2.验证
		IDCard card = new IDCard();
		boolean isValidate = card.Verify((String)value);
		//3.如果验证不通过则添加错误消息
		if(!isValidate){
			addFieldError(fielName , object);
		}
		
	}

}
