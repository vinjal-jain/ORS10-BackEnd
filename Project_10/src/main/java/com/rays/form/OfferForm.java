package com.rays.form;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.OfferDTO;

public class OfferForm extends BaseForm {

	@NotEmpty(message = "please enter offerCode")
	private String offerCode;

	@NotNull(message = "please enter discountAmount")
	private BigDecimal discountAmount;

	@NotNull(message = "please enter expiryDate")
	private LocalDate expiryDate;

	@NotEmpty(message = "please enter offerStatus")
	private String offerStatus;

	// Getters and Setters

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	@Override
	public OfferDTO getDto() {

		OfferDTO dto = initDTO(new OfferDTO());
		dto.setOfferCode(offerCode);
		dto.setDiscountAmount(discountAmount);
		dto.setExpiryDate(expiryDate);
		dto.setOfferStatus(offerStatus);
		return dto;
	}
}
