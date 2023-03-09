package com.example.customValidatorExample;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomValidator implements ConstraintValidator<MyCustomValidation, String> {

    @Override
    public void initialize(MyCustomValidation constraintAnnotation) {
        // Initialization code here
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            // Null values are considered valid (use @NotNull if null values should be
            // rejected)
            return true;
        }
        return value.length() >= 5;
    }
}
