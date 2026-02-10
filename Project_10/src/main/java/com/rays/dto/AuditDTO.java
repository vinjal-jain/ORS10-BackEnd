package com.rays.dto;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_AUDIT")
public class AuditDTO extends BaseDTO {

	@Column(name = "ACTION_TYPE", length = 50)
	private String actionType;

	@Column(name = "ACTION_BY", length = 50)
	private String actionBy;

	@Column(name = "ACTION_TIME")
	private LocalDateTime actionTime;

	@Column(name = "ACTION_RESULT", length = 50)
	private String actionResult;

	/* ================= Getters & Setters ================= */

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public LocalDateTime getActionTime() {
		return actionTime;
	}

	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionResult() {
		return actionResult;
	}

	public void setActionResult(String actionResult) {
		this.actionResult = actionResult;
	}

	/* ================= BaseDTO Overrides (Offer Style) ================= */

	@Override
	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		return actionType;
	}

	@Override
	public String getUniqueKey() {
		// SAME pattern as OfferDTO → offerCode
		return "actionType";
	}

	@Override
	public String getUniqueValue() {
		return actionType;
	}

	@Override
	public String getLabel() {
		return "Action Type";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("actionTime", "desc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("actionType", actionType);
		return map;
	}
}
