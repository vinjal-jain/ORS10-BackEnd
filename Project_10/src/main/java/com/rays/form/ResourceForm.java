package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.ResourceDTO;

public class ResourceForm extends BaseForm {

    @NotEmpty(message = "Resource Code is required")
    private String resourceCode;

    @NotEmpty(message = "Resource Name is required")
    private String resourceName;

    @NotEmpty(message = "Resource Type is required")
    private String resourceType;

    @NotEmpty(message = "Resource Status is required")
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
    public ResourceDTO getDto() {
        ResourceDTO dto = initDTO(new ResourceDTO());
        dto.setResourceCode(resourceCode);
        dto.setResourceName(resourceName);
        dto.setResourceType(resourceType);
        dto.setResourceStatus(resourceStatus);
        return dto;
    }
}
