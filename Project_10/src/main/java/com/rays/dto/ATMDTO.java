package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ATM")
public class ATMDTO extends BaseDTO {

    @Column(name = "LOCATION", length = 100)
    private String location;

    @Column(name = "CASH_AVAILABLE")
    private Double cashAvailable;

    
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DOB")
    private LocalDate dob;

   
    @Column(name = "REMARK", length = 100)
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
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return location;
    }

    @Override
    public String getUniqueKey() {
        return "location";
    }

    @Override
    public String getUniqueValue() {
        return location;
    }

    @Override
    public String getLabel() {
        return "Location";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("location", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("location", location);
        return map;
    }
}
