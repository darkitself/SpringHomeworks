package com.homework.fifth_homework.date_validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateValidator.class)
@Target( { ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateIsValid {
    String message() default "Invalid birthdate";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
