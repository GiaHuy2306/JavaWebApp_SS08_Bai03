package com.session08_bai03.custom_validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = MultipleOfTenThousandValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MultipleOfTenThousand {

    String message() default "Số tiền phải từ 50.000 trở lên và là bội số của 10.000";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};
}
