package com.webapp.bankingservice;

import java.io.Serializable;

import java.util.Date;


public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int documentId;

	private String documentName;

	private Date documentExpiryDate;

	private String documentAddress;

	private Customer customer;

	public Document() {
		super();
	}

	public Document(int documentId, String documentName, Date documentExpiryDate, String documentAddress,
			Customer customer) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentExpiryDate = documentExpiryDate;
		this.documentAddress = documentAddress;
		this.customer = customer;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Date getDocumentExpiryDate() {
		return documentExpiryDate;
	}

	public void setDocumentExpiryDate(Date documentExpiryDate) {
		this.documentExpiryDate = documentExpiryDate;
	}

	public String getDocumentAddress() {
		return documentAddress;
	}

	public void setDocumentAddress(String documentAddress) {
		this.documentAddress = documentAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Document [documentId=" + documentId + ", documentName=" + documentName + ", documentExpiryDate="
				+ documentExpiryDate + ", documentAddress=" + documentAddress + ", customer=" + customer + "]";
	}

}
