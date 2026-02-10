package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OfferDTO;

@Repository
public class OfferDAOImpl extends BaseDAOImpl<OfferDTO> implements OfferDAOInt {

	@Override
	protected List<Predicate> getWhereClause(OfferDTO dto, CriteriaBuilder builder, Root<OfferDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getOfferCode())) {
			whereCondition.add(
				builder.like(qRoot.get("offerCode"), dto.getOfferCode() + "%"));
		}

		if (isNotNull(dto.getDiscountAmount())) {
			whereCondition.add(
				builder.equal(qRoot.get("discountAmount"), dto.getDiscountAmount()));
		}

		if (isNotNull(dto.getExpiryDate())) {
			whereCondition.add(
				builder.equal(qRoot.get("expiryDate"), dto.getExpiryDate()));
		}

		if (!isEmptyString(dto.getOfferStatus())) {
			whereCondition.add(
				builder.equal(qRoot.get("offerStatus"), dto.getOfferStatus()));
		}

		return whereCondition;
	}

	@Override
	public Class<OfferDTO> getDTOClass() {
		return OfferDTO.class;
	}
}
