package com.rays.form;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ActivityDTO;

public class ActivityForm extends BaseForm {

	@NotEmpty(message = "Please enter activity name")
	private String activityName;

	@NotEmpty(message = "Please enter performed by")
	private String performedBy;

	@NotNull(message = "Please select activity time")
	private LocalDateTime activityTime;

	@NotEmpty(message = "Please select status")
	private String activityStatus;

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public LocalDateTime getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(LocalDateTime activityTime) {
		this.activityTime = activityTime;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	@Override
	public ActivityDTO getDto() {
		ActivityDTO dto = initDTO(new ActivityDTO());
		dto.setActivityName(activityName);
		dto.setPerformedBy(performedBy);
		dto.setActivityTime(activityTime);
		dto.setActivityStatus(activityStatus);
		return dto;
	}
}
