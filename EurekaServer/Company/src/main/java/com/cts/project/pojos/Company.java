package com.cts.project.pojos;

import javax.persistence.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id

	private String companyname;

	private int turnover;

	private String ceoname;

	private String bod;

	private int listedinse;

	private String sector;

	private String remarks;

	private int stockcode;
	@Transient
	List<StockPrice> stockPriceList;
	public List<StockPrice> getStockPriceList() {
		return stockPriceList;
	}

	public void setStockPriceList(List<StockPrice> stockPriceList) {
		this.stockPriceList = stockPriceList;
	}

	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceoname=" + ceoname + ", bod="
				+ bod + ", listedinse=" + listedinse + ", sector=" + sector + ", remarks=" + remarks + ", stockcode="
				+ stockcode + "]";
	}
	
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeoname() {
		return ceoname;
	}

	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public int getListedinse() {
		return listedinse;
	}

	public void setListedinse(int listedinse) {
		this.listedinse = listedinse;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getStockcode() {
		return stockcode;
	}

	public void setStockcode(int stockcode) {
		this.stockcode = stockcode;
	}

}
