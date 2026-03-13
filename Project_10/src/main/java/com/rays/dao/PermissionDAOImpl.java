package com.rays.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import com.rays.common.BaseDAOImpl;
import com.rays.dto.PermissionDTO;

@Repository
public class PermissionDAOImpl extends BaseDAOImpl<PermissionDTO> implements PermissionDAOInt {

    @Override
    protected List<Predicate> getWhereClause(PermissionDTO dto, CriteriaBuilder builder, Root<PermissionDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        if (!isEmptyString(dto.getPermissionCode())) {
            where.add(builder.like(qRoot.get("permissionCode"), dto.getPermissionCode() + "%"));
        }

        if (!isEmptyString(dto.getPermissionName())) {
            where.add(builder.like(qRoot.get("permissionName"), dto.getPermissionName() + "%"));
        }

        if (!isEmptyString(dto.getModuleName())) {
            where.add(builder.like(qRoot.get("moduleName"), dto.getModuleName() + "%"));
        }

        return where;
    }

    @Override
    public Class<PermissionDTO> getDTOClass() {
        return PermissionDTO.class;
    }
}