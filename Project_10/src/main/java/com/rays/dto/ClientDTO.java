package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CLIENT")
public class ClientDTO extends BaseDTO {

	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;

	@Column(name = "ADDRESS", length = 100)
	private String address;

	@Column(name = "PHONE", length = 15)
	private String phone;

	@Column(name = "PRIORITY", length = 20)
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
	public String getValue() {
		return clientName;
	}

	@Override
	public String getUniqueKey() {
		return "clientName";
	}

	@Override
	public String getUniqueValue() {
		return clientName;
	}

	@Override
	public String getLabel() {
		return "Client Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("clientName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("clientName", clientName);
		return map;
	}
}
