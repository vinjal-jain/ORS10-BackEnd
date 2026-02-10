package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ContractDTO;

@Repository
public class ContractDAOImpl extends BaseDAOImpl<ContractDTO>
		implements ContractDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ContractDTO dto,
			CriteriaBuilder builder, Root<ContractDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(
				builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (!isEmptyString(dto.getCity())) {
			whereCondition.add(
				builder.equal(qRoot.get("city"), dto.getCity()));
		}

		return whereCondition;
	}

	@Override
	public Class<ContractDTO> getDTOClass() {
		return ContractDTO.class;
	}
}
