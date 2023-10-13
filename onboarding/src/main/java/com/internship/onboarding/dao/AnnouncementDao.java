package com.internship.onboarding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.internship.onboarding.vo.AnnApplication;
import com.internship.onboarding.vo.Announcement;

@Mapper
public interface AnnouncementDao {
	public int insertAnn(Announcement insert);
	public int updateAnn(Announcement update);
	public List<Announcement> schAnn(String company_name);
	public int deleteAnn(String ann_id);
	public Announcement detailAnn(String ann_id);
	public List<Announcement> othersAnn(Announcement others);
	public int annApply(AnnApplication app);
	public int appHistory(AnnApplication app);
}
