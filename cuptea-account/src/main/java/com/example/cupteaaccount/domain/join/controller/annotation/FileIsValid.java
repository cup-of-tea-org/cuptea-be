package com.example.cupteaaccount.domain.join.controller.annotation;

import com.example.cupteaaccount.util.validator.FileValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR})
@Constraint(validatedBy = {FileValidator.class})
public @interface FileIsValid {
    String message() default "파일 형식이 맞지 않습니다";
    Class<? extends Payload>[] payload() default {};
    Class<?>[] groups() default {};

}
