package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.TransportDTO;

public class TransportForm extends BaseForm {

    @NotEmpty(message = "Vehicle Type is required")
    private String vehicleType;

    @NotEmpty(message = "Driver Name is required")
    private String driverName;

    @NotNull(message = "Charges are required")
    private Double charges;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    @Override
    public TransportDTO getDto() {

        TransportDTO dto = new TransportDTO();

        dto.setId(id);

        dto.setVehicleType(vehicleType);
        dto.setDriverName(driverName);
        dto.setCharges(charges);

        return dto;
    }
}