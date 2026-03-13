package com.rays.form;

import javax.validation.constraints.NotEmpty;
import com.rays.common.BaseForm;
import com.rays.dto.PermissionDTO;

public class PermissionForm extends BaseForm {

    @NotEmpty(message = "Permission Code is required")
    private String permissionCode;

    @NotEmpty(message = "Permission Name is required")
    private String permissionName;

    @NotEmpty(message = "Module Name is required")
    private String moduleName;

    @NotEmpty(message = "Access Type is required")
    private String accessType;

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    @Override
    public PermissionDTO getDto() {
        PermissionDTO dto = initDTO(new PermissionDTO());
        dto.setPermissionCode(permissionCode);
        dto.setPermissionName(permissionName);
        dto.setModuleName(moduleName);
        dto.setAccessType(accessType);
        return dto;
    }
}