package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DEPARTMENT")
public class DepartmentDTO extends BaseDTO {

    @Column(name = "DEPARTMENT_CODE", length = 50)
    private String departmentCode;

    @Column(name = "DEPARTMENT_NAME", length = 100)
    private String departmentName;

    @Column(name = "DEPARTMENT_HEAD", length = 100)
    private String departmentHead;

    @Column(name = "DEPARTMENT_STATUS", length = 20)
    private String departmentStatus;

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    public String getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(String departmentStatus) {
        this.departmentStatus = departmentStatus;
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return departmentName;
    }

    @Override
    public String getUniqueKey() {
        return "departmentCode";
    }

    @Override
    public String getUniqueValue() {
        return departmentCode;
    }

    @Override
    public String getLabel() {
        return "Department Code";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("departmentName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("departmentCode", departmentCode);
        return map;
    }
}