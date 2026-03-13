package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.DepartmentDTO;

public class DepartmentForm extends BaseForm {

    @NotEmpty(message = "Department Code is required")
    private String departmentCode;

    @NotEmpty(message = "Department Name is required")
    private String departmentName;

    @NotEmpty(message = "Department Head is required")
    private String departmentHead;

    @NotEmpty(message = "Department Status is required")
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
    public DepartmentDTO getDto() {

        DepartmentDTO dto = new DepartmentDTO();

        dto.setId(id);
        dto.setDepartmentCode(departmentCode);
        dto.setDepartmentName(departmentName);
        dto.setDepartmentHead(departmentHead);
        dto.setDepartmentStatus(departmentStatus);

        return dto;
    }
}