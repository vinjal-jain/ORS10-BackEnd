package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ClientDTO;

@Repository
public class ClientDAOImpl extends BaseDAOImpl<ClientDTO> implements ClientDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ClientDTO dto, CriteriaBuilder builder, Root<ClientDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getClientName())) {
			whereCondition.add(builder.like(qRoot.get("clientName"), dto.getClientName() + "%"));
		}

		if (!isEmptyString(dto.getPriority())) {
			whereCondition.add(builder.equal(qRoot.get("priority"), dto.getPriority()));
		}

		return whereCondition;
	}

	@Override
	public Class<ClientDTO> getDTOClass() {
		return ClientDTO.class;
	}
}
