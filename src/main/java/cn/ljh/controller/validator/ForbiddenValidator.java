package cn.ljh.controller.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import cn.ljh.controller.validation.constraints.Forbidden;

public class ForbiddenValidator implements ConstraintValidator<Forbidden, String> {

	// 可以从外部注入
	private String[] forbiddenWords = { "admin", "sex", "fuck" };

	private String[] illegalwords;

	@Override
	public void initialize(Forbidden constraintAnnotation) {
		// 初始化，得到注解数据
		illegalwords = constraintAnnotation.illegalwords();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtils.isEmpty(value)) {
			return true;
		}

		// 合并两个数组
		String[] all = new String[forbiddenWords.length + illegalwords.length];
		System.arraycopy(forbiddenWords, 0, all, 0, forbiddenWords.length);
		System.arraycopy(illegalwords, 0, all, forbiddenWords.length, illegalwords.length);

		for (String word : all) {
			if (value.contains(word)) {
				return false;// 验证失败
			}
		}
		return true;
	}
}
