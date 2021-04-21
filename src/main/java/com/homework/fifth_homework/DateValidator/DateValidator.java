package com.homework.fifth_homework.DateValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateValidator implements
        ConstraintValidator<DateIsValid, LocalDate> {
    LocalDate min;
    LocalDate max;

    @Override
    public void initialize(DateIsValid date) {
        min = LocalDate.now().minusYears(100);
        max = LocalDate.now();
    }

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext cxt) {
        return date.isAfter(min) && date.isBefore(max);
    }
}