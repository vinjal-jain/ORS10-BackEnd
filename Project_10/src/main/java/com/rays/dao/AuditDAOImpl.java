package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AuditDTO;

@Repository
public class AuditDAOImpl extends BaseDAOImpl<AuditDTO>
		implements AuditDAOInt {

	@Override
	protected List<Predicate> getWhereClause(
			AuditDTO dto,
			CriteriaBuilder builder,
			Root<AuditDTO> qRoot) {

		List<Predicate> where = new ArrayList<>();

		if (!isEmptyString(dto.getActionType())) {
			where.add(builder.like(
				qRoot.get("actionType"),
				dto.getActionType() + "%"));
		}

		if (!isEmptyString(dto.getActionBy())) {
			where.add(builder.like(
				qRoot.get("actionBy"),
				dto.getActionBy() + "%"));
		}

		if (!isEmptyString(dto.getActionResult())) {
			where.add(builder.equal(
				qRoot.get("actionResult"),
				dto.getActionResult()));
		}

		if (isNotNull(dto.getActionTime())) {
			where.add(builder.equal(
				qRoot.get("actionTime"),
				dto.getActionTime()));
		}

		return where;
	}

	@Override
	public Class<AuditDTO> getDTOClass() {
		return AuditDTO.class;
	}
}
