package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;
import com.rays.dto.ATMDTO;

public class ATMForm extends BaseForm {

    @NotEmpty(message = "Please enter location")
    private String location;

    @NotNull(message = "Please enter cash available")
    private Double cashAvailable;

    @NotNull(message = "Please select date")
    private LocalDate dob;

    @NotEmpty(message = "Please enter remark")
   
    private String remark;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(Double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public ATMDTO getDto() {
        ATMDTO dto = initDTO(new ATMDTO());
        dto.setLocation(location);
        dto.setCashAvailable(cashAvailable);
        dto.setDob(dob);
        dto.setRemark(remark);
        return dto;
    }
}
