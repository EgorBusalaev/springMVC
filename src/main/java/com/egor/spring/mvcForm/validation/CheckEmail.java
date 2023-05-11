package com.egor.spring.mvcForm.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = checkEmailValidator.class)
public  @interface CheckEmail {
    public String value() default "@mail.ru";

    public String message() default "email must ends with @mail.ru";

    public Class<?>[] groups() default {   };
    public Class <? extends Payload> [] payload() default {};
}
