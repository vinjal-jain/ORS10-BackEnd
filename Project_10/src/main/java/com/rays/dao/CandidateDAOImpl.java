package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CandidateDTO;

@Repository
public class CandidateDAOImpl extends BaseDAOImpl<CandidateDTO> implements CandidateDAOInt {

    @Override
    protected List<Predicate> getWhereClause(CandidateDTO dto, CriteriaBuilder builder, Root<CandidateDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        if (!isEmptyString(dto.getCandidateCode())) {
            where.add(builder.like(qRoot.get("candidateCode"), dto.getCandidateCode() + "%"));
        }

        if (!isEmptyString(dto.getCandidateName())) {
            where.add(builder.like(qRoot.get("candidateName"), dto.getCandidateName() + "%"));
        }

        if (!isEmptyString(dto.getEmail())) {
            where.add(builder.like(qRoot.get("email"), dto.getEmail() + "%"));
        }

        return where;
    }

    @Override
    public Class<CandidateDTO> getDTOClass() {
        return CandidateDTO.class;
    }
}