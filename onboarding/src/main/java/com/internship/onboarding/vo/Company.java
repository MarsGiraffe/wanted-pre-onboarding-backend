package com.internship.onboarding.vo;

public class Company {
	private String company_name;
	private String nation;
	private String region;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String company_name, String nation, String region) {
		this.company_name = company_name;
		this.nation = nation;
		this.region = region;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
}
