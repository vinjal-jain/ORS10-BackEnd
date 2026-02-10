package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.AuditDTO;

import java.time.LocalDateTime;

public class AuditForm extends BaseForm {

	@NotEmpty(message = "Please enter action type")
	private String actionType;

	@NotEmpty(message = "Please enter action by")
	private String actionBy;

	@NotNull(message = "Please enter action time")
	private LocalDateTime actionTime;

	@NotEmpty(message = "Please enter action result")
	private String actionResult;

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

	@Override
	public AuditDTO getDto() {
		AuditDTO dto = initDTO(new AuditDTO());
		dto.setActionType(actionType);
		dto.setActionBy(actionBy);
		dto.setActionTime(actionTime);
		dto.setActionResult(actionResult);
		return dto;
	}
}
