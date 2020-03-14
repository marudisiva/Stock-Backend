package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "ipodetails")

public class IpoDetails {
	@Id
	private Integer ipoid;

	

	private String companyname;

	private String stockexchange;

	private Integer pricepershare;

	private Integer totalnoofshares;

	private Integer opendatetime;
	@Override
	public String toString() {
		return "IpoDetails [ipoid=" + ipoid + ", companyname=" + companyname + ", stockexchange=" + stockexchange
				+ ", pricepershare=" + pricepershare + ", totalnoofshares=" + totalnoofshares + ", opendatetime="
				+ opendatetime + "]";
	}

	public Integer getIpoid() {

		return ipoid;

	}

	public void setIpoid(Integer ipoid) {

		this.ipoid = ipoid;

	}

	public String getCompanyname() {

		return companyname;

	}

	public void setCompanyname(String companyname) {

		this.companyname = companyname;

	}

	public String getStockexchange() {

		return stockexchange;

	}

	public void setStockexchange(String stockexchange) {

		this.stockexchange = stockexchange;

	}

	public Integer getPricepershare() {

		return pricepershare;

	}

	public void setPricepershare(Integer pricepershare) {

		this.pricepershare = pricepershare;

	}

	public Integer getTotalnoofshares() {

		return totalnoofshares;

	}

	public void setTotalnoofshares(Integer totalnoofshares) {

		this.totalnoofshares = totalnoofshares;

	}

	public Integer getOpendatetime() {

		return opendatetime;

	}

	public void setOpendatetime(Integer opendatetime) {

		this.opendatetime = opendatetime;

	}

}
