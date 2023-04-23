package com.wl.msnotify.aop;

import java.lang.annotation.*;

/**
 * @author : tchstart
 * @Description : 操作日志
 * @date : 2022/4/29 16:47
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogAnnotation {
    String value() default "";
}
