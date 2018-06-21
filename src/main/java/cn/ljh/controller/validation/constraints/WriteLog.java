package cn.ljh.controller.validation.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD })
public @interface WriteLog {
	public String value() default "";

	public WriteType type() default WriteType.after;

	public enum WriteType {
		before, after
	}
}
