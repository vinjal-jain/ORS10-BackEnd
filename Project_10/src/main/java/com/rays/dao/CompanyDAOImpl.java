package com.rays.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import com.rays.common.BaseDAOImpl;
import com.rays.dto.CompanyDTO;

@Repository
public class CompanyDAOImpl extends BaseDAOImpl<CompanyDTO> implements CompanyDAOInt {

    @Override
    protected List<Predicate> getWhereClause(CompanyDTO dto, CriteriaBuilder builder, Root<CompanyDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        if (!isEmptyString(dto.getCompanyName())) {
            where.add(builder.like(qRoot.get("companyName"), dto.getCompanyName() + "%"));
        }

        if (!isEmptyString(dto.getIndustry())) {
            where.add(builder.like(qRoot.get("industry"), dto.getIndustry() + "%"));
        }

        if (!isEmptyString(dto.getCity())) {
            where.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
        }

        return where;
    }

    @Override
    public Class<CompanyDTO> getDTOClass() {
        return CompanyDTO.class;
    }
}