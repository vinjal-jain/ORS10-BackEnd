package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ATMDTO;

@Repository
public class ATMDAOImpl extends BaseDAOImpl<ATMDTO> implements ATMDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ATMDTO dto, CriteriaBuilder builder, Root<ATMDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        // Location
        if (!isEmptyString(dto.getLocation())) {
            where.add(builder.like(qRoot.get("location"), dto.getLocation() + "%"));
        }

        // Cash Available
        if (isNotNull(dto.getCashAvailable())) {
            where.add(builder.equal(qRoot.get("cashAvailable"), dto.getCashAvailable()));
        }

        // ⭐ Remark Search
        if (!isEmptyString(dto.getRemark())) {
            where.add(builder.like(qRoot.get("remark"), dto.getRemark() + "%"));
        }

        // ⭐ Date Search
        if (isNotNull(dto.getDob())) {
            where.add(builder.equal(qRoot.get("dob"), dto.getDob()));
        }

        return where;
    }

    @Override
    public Class<ATMDTO> getDTOClass() {
        return ATMDTO.class;
    }
}
