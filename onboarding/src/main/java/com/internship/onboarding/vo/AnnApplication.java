package com.internship.onboarding.vo;

public class AnnApplication {
	private int user_id;
	private String ann_id;
	public AnnApplication() {
		// TODO Auto-generated constructor stub
	}
	public AnnApplication(int user_id, String ann_id) {
		this.user_id = user_id;
		this.ann_id = ann_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAnn_id() {
		return ann_id;
	}
	public void setAnn_id(String ann_id) {
		this.ann_id = ann_id;
	}
	
}
