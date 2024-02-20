package com.dtone.dvs.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = TransactionDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "external_id")
	private String externalId;

	@JsonProperty(value = "creation_date")
	private String creationDate;

	@JsonProperty(value = "confirmation_expiration_date")
	private String confirmationExpirationDate;

	@JsonProperty(value = "confirmation_date")
	private String confirmationDate;

	@JsonProperty(value = "status")
	private Status status;

	@JsonProperty(value = "operator_reference")
	private String operatorReference;

	@JsonProperty(value = "pin")
	private Pin pin;

	@JsonProperty(value = "product")
	private Product product;

	@JsonProperty(value = "prices")
	private Prices prices;

	@JsonProperty(value = "rates")
	private Rates rates;

	@JsonProperty(value = "promotions")
	private List<Promotion> promotions;

	@JsonProperty(value = "requested_values")
	private Values requestedValues;

	@JsonProperty(value = "adjusted_values")
	private Values adjustedValues;

	@JsonProperty(value = "sender")
	private Party sender;

	@JsonProperty(value = "beneficiary")
	private Party beneficiary;

	@JsonProperty(value = "debit_party_identifier")
	private PartyIdentifier debitPartyIdentifier;

	@JsonProperty(value = "credit_party_identifier")
	private PartyIdentifier creditPartyIdentifier;

	@JsonProperty(value = "statement_identifier")
	private StatementIdentifier statementIdentifier;

	@JsonProperty(value = "callback_url")
	private String callbackUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getConfirmationExpirationDate() {
		return confirmationExpirationDate;
	}

	public void setConfirmationExpirationDate(String confirmationExpirationDate) {
		this.confirmationExpirationDate = confirmationExpirationDate;
	}

	public String getConfirmationDate() {
		return confirmationDate;
	}

	public void setConfirmationDate(String confirmationDate) {
		this.confirmationDate = confirmationDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getOperatorReference() {
		return operatorReference;
	}

	public void setOperatorReference(String operatorReference) {
		this.operatorReference = operatorReference;
	}

	public Pin getPin() {
		return pin;
	}

	public void setPin(Pin pin) {
		this.pin = pin;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	public Rates getRates() {
		return rates;
	}

	public void setRates(Rates rates) {
		this.rates = rates;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Values getRequestedValues() {
		return requestedValues;
	}

	public void setRequestedValues(Values requestedValues) {
		this.requestedValues = requestedValues;
	}

	public Values getAdjustedValues() {
		return adjustedValues;
	}

	public void setAdjustedValues(Values adjustedValues) {
		this.adjustedValues = adjustedValues;
	}

	public Party getSender() {
		return sender;
	}

	public void setSender(Party sender) {
		this.sender = sender;
	}

	public Party getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Party beneficiary) {
		this.beneficiary = beneficiary;
	}

	public PartyIdentifier getDebitPartyIdentifier() {
		return debitPartyIdentifier;
	}

	public void setDebitPartyIdentifier(PartyIdentifier debitPartyIdentifier) {
		this.debitPartyIdentifier = debitPartyIdentifier;
	}

	public PartyIdentifier getCreditPartyIdentifier() {
		return creditPartyIdentifier;
	}

	public void setCreditPartyIdentifier(PartyIdentifier creditPartyIdentifier) {
		this.creditPartyIdentifier = creditPartyIdentifier;
	}

	public StatementIdentifier getStatementIdentifier() {
		return statementIdentifier;
	}

	public void setStatementIdentifier(StatementIdentifier statementIdentifier) {
		this.statementIdentifier = statementIdentifier;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", externalId=" + externalId + ", creationDate=" + creationDate
				+ ", confirmationExpirationDate=" + confirmationExpirationDate + ", confirmationDate="
				+ confirmationDate + ", status=" + status + ", operatorReference=" + operatorReference + ", pin=" + pin
				+ ", product=" + product + ", prices=" + prices + ", rates=" + rates + ", promotions=" + promotions
				+ ", requestedValues=" + requestedValues + ", adjustedValues=" + adjustedValues + ", sender=" + sender
				+ ", beneficiary=" + beneficiary + ", debitPartyIdentifier=" + debitPartyIdentifier
				+ ", creditPartyIdentifier=" + creditPartyIdentifier + ", statementIdentifier=" + statementIdentifier
				+ ", callbackUrl=" + callbackUrl + "]";
	}

}
