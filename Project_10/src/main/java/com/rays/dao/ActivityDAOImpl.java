package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ActivityDTO;

@Repository
public class ActivityDAOImpl extends BaseDAOImpl<ActivityDTO> implements ActivityDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ActivityDTO dto, CriteriaBuilder builder, Root<ActivityDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getActivityName())) {
			whereCondition.add(builder.like(qRoot.get("activityName"), dto.getActivityName() + "%"));
		}

		if (!isEmptyString(dto.getPerformedBy())) {
			whereCondition.add(builder.like(qRoot.get("performedBy"), dto.getPerformedBy() + "%"));
		}

		if (!isEmptyString(dto.getActivityStatus())) {
			whereCondition.add(builder.equal(qRoot.get("activityStatus"), dto.getActivityStatus()));
		}

		return whereCondition;
	}

	@Override
	public Class<ActivityDTO> getDTOClass() {
		return ActivityDTO.class;
	}
}
