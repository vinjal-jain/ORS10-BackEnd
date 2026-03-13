package com.rays.dto;

import java.util.LinkedHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PERMISSION")
public class PermissionDTO extends BaseDTO {

    @Column(name = "PERMISSION_CODE", length = 50)
    private String permissionCode;

    @Column(name = "PERMISSION_NAME", length = 100)
    private String permissionName;

    @Column(name = "MODULE_NAME", length = 100)
    private String moduleName;

    @Column(name = "ACCESS_TYPE", length = 20)
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
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return permissionCode;
    }

    @Override
    public String getUniqueKey() {
        return "permissionCode";
    }

    @Override
    public String getUniqueValue() {
        return permissionCode;
    }

    @Override
    public String getLabel() {
        return "Permission Code";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("permissionCode", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("permissionCode", permissionCode);
        return map;
    }
}