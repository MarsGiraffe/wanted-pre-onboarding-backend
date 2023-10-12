package com.internship.onboarding.vo;

public class Announcement {
	private String ann_id;
	private String company_name;
	private String ann_info;
	private String positions;
	private int compensation;
	private String using_skill;
	public Announcement() {
		// TODO Auto-generated constructor stub
	}
	public Announcement(String ann_id, String company_name, String ann_info, String positions, int compensation,
			String using_skill) {
		this.ann_id = ann_id;
		this.company_name = company_name;
		this.ann_info = ann_info;
		this.positions = positions;
		this.compensation = compensation;
		this.using_skill = using_skill;
	}
	public String getAnn_id() {
		return ann_id;
	}
	public void setAnn_id(String ann_id) {
		this.ann_id = ann_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAnn_info() {
		return ann_info;
	}
	public void setAnn_info(String ann_info) {
		this.ann_info = ann_info;
	}
	public String getPositions() {
		return positions;
	}
	public void setPositions(String positions) {
		this.positions = positions;
	}
	public int getCompensation() {
		return compensation;
	}
	public void setCompensation(int compensation) {
		this.compensation = compensation;
	}
	public String getUsing_skill() {
		return using_skill;
	}
	public void setUsing_skill(String using_skill) {
		this.using_skill = using_skill;
	}
	
}
