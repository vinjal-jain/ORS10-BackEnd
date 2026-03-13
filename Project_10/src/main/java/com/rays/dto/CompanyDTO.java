package com.rays.dto;

import java.util.LinkedHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPANY")
public class CompanyDTO extends BaseDTO {

    @Column(name = "COMPANY_NAME", length = 100)
    private String companyName;

    @Column(name = "INDUSTRY", length = 100)
    private String industry;

    @Column(name = "CITY", length = 100)
    private String city;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return companyName;
    }

    @Override
    public String getUniqueKey() {
        return "companyName";
    }

    @Override
    public String getUniqueValue() {
        return companyName;
    }

    @Override
    public String getLabel() {
        return "Company Name";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("companyName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("companyName", companyName);
        return map;
    }
}