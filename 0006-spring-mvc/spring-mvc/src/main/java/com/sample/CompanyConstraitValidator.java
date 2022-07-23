package com.sample;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CompanyConstraitValidator implements ConstraintValidator<CompanyValidator, String> {

    private String comanyName;

    @Override
    public void initialize(CompanyValidator companyValidator) {

    comanyName = companyValidator.value();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            result = s.startsWith("Iran");
        } else {
            result = true;
        }

        return result;
    }
}
