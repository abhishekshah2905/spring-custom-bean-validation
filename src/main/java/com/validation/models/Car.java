/**
 * 
 */
package com.validation.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.validation.validators.enumValidator.CheckCase;

import com.validation.models.types.CaseMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
	@NotNull
    private String manufacturer;

    @NotNull
    @Size(min = 2, max = 14)
    @CheckCase(enumClass = CaseMode.class)
    private String licensePlate;

    @Min(2)
    private int seatCount;

}
