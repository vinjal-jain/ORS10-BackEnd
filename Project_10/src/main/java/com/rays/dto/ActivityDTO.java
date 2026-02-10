package com.rays.dto;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ACTIVITY")
public class ActivityDTO extends BaseDTO {

	@Column(name = "ACTIVITY_NAME", length = 50)
	private String activityName;

	@Column(name = "PERFORMED_BY", length = 50)
	private String performedBy;

	@Column(name = "ACTIVITY_TIME")
	private LocalDateTime activityTime;

	@Column(name = "ACTIVITY_STATUS", length = 20)
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
	public String getValue() {
		return activityName;
	}

	@Override
	public String getUniqueKey() {
		return "activityName";
	}

	@Override
	public String getUniqueValue() {
		return activityName;
	}

	@Override
	public String getLabel() {
		return "Activity Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("activityTime", "desc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("activityName", activityName);
		return map;
	}
}
