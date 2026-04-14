package com.session08_bai03.model.dto;

import com.session08_bai03.custom_validate.MultipleOfTenThousand;
import jakarta.validation.constraints.NotNull;

public class WithdrawRequestDto {
    @NotNull(message = "Số tiền rút không được để trống")
    @MultipleOfTenThousand
    private Long withdrawAmount;

    private String bankAccountId;
}
