package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_RESOURCE")
public class ResourceDTO extends BaseDTO {

    @Column(name = "RESOURCE_CODE", length = 50, unique = true)
    private String resourceCode;

    @Column(name = "RESOURCE_NAME", length = 100)
    private String resourceName;

    @Column(name = "RESOURCE_TYPE", length = 50)
    private String resourceType;

    @Column(name = "RESOURCE_STATUS", length = 20)
    private String resourceStatus;

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return resourceName;
    }

    @Override
    public String getUniqueKey() {
        return "resourceCode";
    }

    @Override
    public String getUniqueValue() {
        return resourceCode;
    }

    @Override
    public String getLabel() {
        return "Resource Name";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("resourceName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("resourceCode", resourceCode);
        return map;
    }
}
