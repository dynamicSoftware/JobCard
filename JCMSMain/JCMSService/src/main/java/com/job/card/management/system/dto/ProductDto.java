package com.job.card.management.system.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProductDto implements Serializable{

	private static final long serialVersionUID = 8627046911913057273L;
	
	private Integer productId;
	private String productName;
	private String modelBrand;
	private String modelNo;

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModelBrand() {
		return modelBrand;
	}
	public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
