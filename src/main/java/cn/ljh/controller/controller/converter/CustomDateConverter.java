package cn.ljh.controller.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date> {

	// @Override
	public Date convert(String source) {

		// 实现 将日期串转成日期类型(格式是yyyy-MM-dd)
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		// 是否严格解析日期
		// true:"1/55/1999"->解析成为Tue Jul 01 00:00:00 CST 2003
		// false:"1/55/1999"->直接报错
		simpleDateFormat.setLenient(false);
		Date date = null;
		try {
			date = simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

}
