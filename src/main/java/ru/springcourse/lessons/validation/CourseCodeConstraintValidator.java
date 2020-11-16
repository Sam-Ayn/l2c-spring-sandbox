package ru.springcourse.lessons.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String courcePrefix;



    @Override
    public void initialize(CourseCode courseCode) {
        courcePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        if(code != null) return code.startsWith(courcePrefix);
        else return true;
    }
}
