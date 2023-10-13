package com.internship.onboarding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.onboarding.dao.AnnouncementDao;
import com.internship.onboarding.vo.Announcement;

@Service
public class AnnouncementService {
	@Autowired
	private AnnouncementDao dao;
	
	public String insertAnn(Announcement insert) {
		return dao.insertAnn(insert)>0?"등록성공":"등록실패";
	}
	public String updateAnn(Announcement update) {
		return dao.updateAnn(update)>0?"수정성공":"수정실패";
	}
	public List<Announcement> schAnn(String company_name){
		if(company_name==null) company_name="";
		return dao.schAnn(company_name);
	}
	public String deleteAnn(String ann_id) {
		return dao.deleteAnn(ann_id)>0?"삭제성공":"삭제실패";
	}
	public Announcement detailAnn(String ann_id) {
		return dao.detailAnn(ann_id);
	}
	public List<Announcement> othersAnn(Announcement others){
		return dao.othersAnn(others);
	}
	
}
