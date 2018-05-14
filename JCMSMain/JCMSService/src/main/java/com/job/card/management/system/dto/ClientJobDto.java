package com.job.card.management.system.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ClientJobDto extends ProductDto{

	private static final long serialVersionUID = -5011967168202016600L;

	private Integer jobId;
	private String jobDescription;
	private Date createdDate;
	private Date approxCompletionDate;
	private Date deliveryDate;
	private String clientName;
	private String clientAddress;
	private String clientContactNo;
	private String clientEmail;
	private String jobStatus;
	private String clientRemark;
	private String serviceEngineerStatus;
	private String serviceEngineerRemark;

	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientContactNo() {
		return clientContactNo;
	}
	public void setClientContactNo(String clientContactNo) {
		this.clientContactNo = clientContactNo;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public String getClientRemark() {
		return clientRemark;
	}
	public void setClientRemark(String clientRemark) {
		this.clientRemark = clientRemark;
	}
	public String getServiceEngineerStatus() {
		return serviceEngineerStatus;
	}
	public void setServiceEngineerStatus(String serviceEngineerStatus) {
		this.serviceEngineerStatus = serviceEngineerStatus;
	}
	public String getServiceEngineerRemark() {
		return serviceEngineerRemark;
	}
	public void setServiceEngineerRemark(String serviceEngineerRemark) {
		this.serviceEngineerRemark = serviceEngineerRemark;
	}
	public Date getApproxCompletionDate() {
		return approxCompletionDate;
	}
	public void setApproxCompletionDate(Date approxCompletionDate) {
		this.approxCompletionDate = approxCompletionDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

}
