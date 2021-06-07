package com.dtone.dvs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "unit_type")
	private UnitTypes unitType;

	@JsonProperty(value = "unit")
	private String unit;

	@JsonProperty(value = "available")
	private Long available;

	@JsonProperty(value = "holding")
	private Long holding;

	@JsonProperty(value = "credit_limit")
	private Long creditLimit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UnitTypes getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitTypes unitType) {
		this.unitType = unitType;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getAvailable() {
		return available;
	}

	public void setAvailable(Long available) {
		this.available = available;
	}

	public Long getHolding() {
		return holding;
	}

	public void setHolding(Long holding) {
		this.holding = holding;
	}

	public Long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "Balance [id=" + id + ", unitType=" + unitType + ", unit=" + unit + ", available=" + available
				+ ", holding=" + holding + ", creditLimit=" + creditLimit + "]";
	}

}
