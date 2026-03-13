package com.rays.form;

import javax.validation.constraints.NotEmpty;
import com.rays.common.BaseForm;
import com.rays.dto.CompanyDTO;

public class CompanyForm extends BaseForm {

    @NotEmpty(message = "Company Name is required")
    private String companyName;

    @NotEmpty(message = "Industry is required")
    private String industry;

    @NotEmpty(message = "City is required")
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
    public CompanyDTO getDto() {
        CompanyDTO dto = initDTO(new CompanyDTO());
        dto.setCompanyName(companyName);
        dto.setIndustry(industry);
        dto.setCity(city);
        return dto;
    }
}