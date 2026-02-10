package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.ClientDTO;

public class ClientForm extends BaseForm {

	@NotEmpty(message = "Please enter client name")
	private String clientName;

	@NotEmpty(message = "Please enter address")
	private String address;

	@NotEmpty(message = "Please enter phone number")
	private String phone;

	@NotEmpty(message = "Please select priority")
	private String priority;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public ClientDTO getDto() {
		ClientDTO dto = initDTO(new ClientDTO());
		dto.setClientName(clientName);
		dto.setAddress(address);
		dto.setPhone(phone);
		dto.setPriority(priority);
		return dto;
	}
}
