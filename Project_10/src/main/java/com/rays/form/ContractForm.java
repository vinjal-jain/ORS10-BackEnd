package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ContractDTO;

public class ContractForm extends BaseForm {

	@NotEmpty(message = "Please enter name")
	private String name;

	@NotEmpty(message = "Please select city")
	private String city;

	@NotNull(message = "Please select date of birth")
	private LocalDate dob;

	@NotNull(message = "Please enter mobile number")
	private Integer mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public ContractDTO getDto() {
		ContractDTO dto = initDTO(new ContractDTO());
		dto.setName(name);
		dto.setCity(city);
		dto.setDob(dob);
		dto.setMobileNo(mobileNo);
		return dto;
	}
}
