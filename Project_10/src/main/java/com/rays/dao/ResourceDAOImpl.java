package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ResourceDTO;

@Repository
public class ResourceDAOImpl extends BaseDAOImpl<ResourceDTO> implements ResourceDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ResourceDTO dto, CriteriaBuilder builder, Root<ResourceDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        if (!isEmptyString(dto.getResourceCode())) {
            where.add(builder.like(qRoot.get("resourceCode"), dto.getResourceCode() + "%"));
        }

        if (!isEmptyString(dto.getResourceName())) {
            where.add(builder.like(qRoot.get("resourceName"), dto.getResourceName() + "%"));
        }

        if (!isEmptyString(dto.getResourceType())) {
            where.add(builder.equal(qRoot.get("resourceType"), dto.getResourceType()));
        }

        if (!isEmptyString(dto.getResourceStatus())) {
            where.add(builder.equal(qRoot.get("resourceStatus"), dto.getResourceStatus()));
        }

        return where;
    }

    @Override
    public Class<ResourceDTO> getDTOClass() {
        return ResourceDTO.class;
    }
}
