package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TransportDTO;

@Repository
public class TransportDAOImpl extends BaseDAOImpl<TransportDTO> implements TransportDAOInt {

    @Override
    protected List<Predicate> getWhereClause(TransportDTO dto, CriteriaBuilder builder, Root<TransportDTO> qRoot) {

        List<Predicate> where = new ArrayList<>();

        if (!isEmptyString(dto.getVehicleType())) {
            where.add(builder.like(qRoot.get("vehicleType"), dto.getVehicleType() + "%"));
        }

        if (!isEmptyString(dto.getDriverName())) {
            where.add(builder.like(qRoot.get("driverName"), dto.getDriverName() + "%"));
        }

        if (isNotNull(dto.getCharges())) {
            where.add(builder.equal(qRoot.get("charges"), dto.getCharges()));
        }

        return where;
    }

    @Override
    public Class<TransportDTO> getDTOClass() {
        return TransportDTO.class;
    }
}